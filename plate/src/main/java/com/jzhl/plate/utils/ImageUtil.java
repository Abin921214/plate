package com.jzhl.plate.utils;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * 图片压缩工具类
 *
 * @author lnj
 * createTime 2018-10-19 15:31
 **/
public class ImageUtil {


    /********************************************  图片压缩 start ********************************************************/

    // 图片默认缩放比率
    private static final double DEFAULT_SCALE = 0.8d;

    // 缩略图后缀
    public static final String SUFFIX = "-th";


    /**
     * 生成缩略图到指定的目录
     *
     * @param path  目录
     * @param files 要生成缩略图的文件列表
     * @throws IOException
     */
    public static List<String> generateThumbnail2Directory(String path, String... files) throws IOException {
        return generateThumbnail2Directory(DEFAULT_SCALE, path, files);
    }

    /**
     * 生成缩略图到指定的目录
     *
     * @param scale    图片缩放率
     * @param pathname 缩略图保存目录
     * @param files    要生成缩略图的文件列表
     * @throws IOException
     */
    public static List<String> generateThumbnail2Directory(double scale, String pathname, String... files) throws IOException {
        Thumbnails.of(files)
                // 图片缩放率，不能和size()一起使用
                .scale(scale)
                // 缩略图保存目录,该目录需存在，否则报错
                .toFiles(new File(pathname), Rename.SUFFIX_HYPHEN_THUMBNAIL);
        List<String> list = new ArrayList<>(files.length);
        for (String file : files) {
            list.add(appendSuffix(file, SUFFIX));
        }

        return list;
    }

    /**
     * 将指定目录下所有图片生成缩略图
     *
     * @param pathname 文件目录
     */
    public static void generateDirectoryThumbnail(String pathname) throws IOException {
        generateDirectoryThumbnail(pathname, DEFAULT_SCALE);
    }

    /**
     * 将指定目录下所有图片生成缩略图
     *
     * @param pathname 文件目录
     */
    public static void generateDirectoryThumbnail(String pathname, double scale) throws IOException {
        File[] files = new File(pathname).listFiles();
        compressRecurse(files, pathname);
    }

    /**
     * 文件追加后缀
     *
     * @param fileName 原文件名
     * @param suffix   文件后缀
     * @return
     */
    public static String appendSuffix(String fileName, String suffix) {
        String newFileName = "";

        int indexOfDot = fileName.lastIndexOf('.');

        if (indexOfDot != -1) {
            newFileName = fileName.substring(0, indexOfDot);
            newFileName += suffix;
            newFileName += fileName.substring(indexOfDot);
        } else {
            newFileName = fileName + suffix;
        }

        return newFileName;
    }


    private static void compressRecurse(File[] files, String pathname) throws IOException {
        for (File file : files) {
            // 目录
            if (file.isDirectory()) {
                File[] subFiles = file.listFiles();
                compressRecurse(subFiles, pathname + File.separator + file.getName());
            } else {
                // 文件包含压缩文件后缀或非图片格式，则不再压缩
                String extension = getFileExtention(file.getName());
                if (!file.getName().contains(SUFFIX) && isImage(extension)) {
                    generateThumbnail2Directory(pathname, file.getAbsolutePath());
                }
            }
        }
    }

    /**
     * 根据文件扩展名判断文件是否图片格式
     *
     * @param extension 文件扩展名
     * @return
     */
    public static boolean isImage(String extension) {
        String[] imageExtension = new String[]{"jpeg", "jpg", "png"};

        for (String e : imageExtension) if (extension.toLowerCase().equals(e)) return true;

        return false;
    }

    public static String getFileExtention(String fileName) {
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
        return extension;
    }
    /********************************************  图片压缩 end ********************************************************/

    /********************************************************  图片转base64 **********************************************************************/

    /**
     * 本地图片转换成base64字符串
     * @param imgFile    图片本地路径
     * @return
     */
    public static String ImageToBase64ByLocal(String imgFile) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理

        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);// 返回Base64编码过的字节数组字符串
    }

    /**
     * 将网络图片转成Base64码，此方法可以解决解码后图片显示不完整的问题
     * @param imgURL 图片地址。
     * 例如：http://***.com/271025191524034.jpg
     * @return
     */
    public static String imgBase64(String imgURL) {
        ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        try {
            // 创建URL
            URL url = new URL(imgURL);
            // 创建链接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(10 * 1000);

            if(conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return "fail";//连接失败/链接失效/图片不存在
            }
            InputStream inStream = conn.getInputStream();
            int len = -1;
            while ((len = inStream.read(data)) != -1) {
                outPut.write(data, 0, len);
            }
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(outPut.toByteArray());
    }

    /**
     * BASE转图片
     * @param baseStr  base64字符串
     * @param imagePath 生成的图片
     * @return
     */
    public static boolean base64ChangeImage(String baseStr,String imagePath){
        if (baseStr == null){
            return false;
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解密
            byte[] b = decoder.decodeBuffer(baseStr);
            // 处理数据
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(imagePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * 车牌识别图片处理
     */
    public static String getPlateImageUrl(HttpServletRequest request, int heId, String base64, String filePath){

        String rootUrl = NetWorkUtil.getRequestPrefix(request);

        //人脸图片编号
        String imgNum = UUIDUtils.getUUID();

        String fileName = imgNum + ".jpg"; // 获取新文件名(源文件)

        //根据时间格式获取指定日期
        String dateStr = DateUtils.fileDate();

        String path = filePath + heId + "/" + dateStr;

        // 图片（原图）的全路径  包含图片名称和后缀
        filePath = filePath + heId + "/" + dateStr + "/" + fileName;//获取文件存储

        //根据路径创建文件
        File dest = new File(filePath);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        try {
            // 写入图片信息到指定路径中
            if(base64 != null && !base64.equals("")){
                ImageUtil.base64ChangeImage(base64, filePath);

                String[] str = new String[]{filePath};
                List<String> list = ImageUtil.generateThumbnail2Directory(0.5, path, str);
                if(list.size() > 0){
                    IOUtils.deleteFile(filePath);
                }

                String srcUrl = rootUrl + "/image/"+ heId +"/" + dateStr + "/" + imgNum + "-thumbnail.jpg";
                return srcUrl;
            }
            return "";

        } catch (Exception e) {
            e.printStackTrace();
            // 删除当前上传的文件
            IOUtils.deleteFile(filePath);
            return null;
        }
    }
}
