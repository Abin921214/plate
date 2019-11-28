package com.jzhl.plate.utils;

import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ImageUtils {
    //base64字符串转化成图片
    public static boolean GenerateImage(String imgStr)
    {   //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try
        {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片
            String imgFilePath = "D:\\tupian\\new.jpg";//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "sfasdfa/image/sdfasdf";
        String[] a =  s.split("image/");
        System.out.println(a.length);
        System.out.println(a[1]);
    }
}
