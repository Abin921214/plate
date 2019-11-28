package com.jzhl.plate.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.lang.management.ManagementFactory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 时间工具类
 *
 * @author ruoyi
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils
{
    public static String YYYY = "yyyy";

    public static String YYYY_MM = "yyyy-MM";

    public static String YYYY_MM_DD = "yyyy-MM-dd";

    public static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

    /**
     * 获取当前Date型日期
     *
     * @return Date() 当前日期
     */
    public static Date getNowDate()
    {
        return new Date();
    }

    /**
     * 获取当前日期, 默认格式为yyyy-MM-dd
     *
     * @return String
     */
    public static String getDate()
    {
        return dateTimeNow(YYYY_MM_DD);
    }

    public static final String getTime()
    {
        return dateTimeNow(YYYY_MM_DD_HH_MM_SS);
    }

    public static final String dateTimeNow()
    {
        return dateTimeNow(YYYYMMDDHHMMSS);
    }

    public static final String dateTimeNow(final String format)
    {
        return parseDateToStr(format, new Date());
    }

    public static final String dateTime(final Date date)
    {
        return parseDateToStr(YYYY_MM_DD, date);
    }

    public static final String parseDateToStr(final String format, final Date date)
    {
        return new SimpleDateFormat(format).format(date);
    }

    public static final Date dateTime(final String format, final String ts)
    {
        try
        {
            return new SimpleDateFormat(format).parse(ts);
        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Long time = Long.valueOf("1547602699456");

        Date d = new Date(time);
        System.out.println( calLastedTime(d));

    }

    /**
     * 日期路径 即年/月/日 如2018/08/08
     */
    public static final String datePath()
    {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyy/MM/dd");
    }

    /**
     * 日期路径 即年/月/日 如20180808
     */
    public static final String dateTime()
    {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyyMMdd");
    }

    /**
     * 日期型字符串转化为日期 格式
     */
    public static Date parseDate(Object str)
    {
        if (str == null)
        {
            return null;
        }
        try
        {
            return parseDate(str.toString(), parsePatterns);
        }
        catch (ParseException e)
        {
            return null;
        }
    }

    /**
     * 获取服务器启动时间
     */
    public static Date getServerStartDate()
    {
        long time = ManagementFactory.getRuntimeMXBean().getStartTime();
        return new Date(time);
    }

    /**
     * 计算两个时间差
     */
    public static String getDatePoor(Date endDate, Date nowDate)
    {
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
         long sec = diff % nd % nh % nm / ns;
//        return day + "天" + hour + "小时" + min + "分钟";
        return sec + "";
    }


    /**
     * 计算两个时间差
     */
    public static long getDateHour(Date endDate, Date nowDate,int type)
    {
        System.out.println("时间：" + nowDate + ":" + endDate);
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();

        // 计算差多少小时
        long hour = diff / nh;

        // 计算差多少分钟
        long min = diff / nm;

        return type == 1?hour:min;
    }



    /**
     * String 转化 date
     * 两种格式
     * 1：yyyy-MM-dd
     * 2：yyyy-MM-dd HH:mm:ss
     * @param dateStr
     * @return
     */
    public static Date getStrChangeDate(String dateStr){
        try {
            String formatStr = "yyyy-MM-dd";
            if(dateStr.split(" ").length == 2){
                formatStr += " HH:mm:ss";
            }
            SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
            Date date = sdf.parse(dateStr);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 计算距离当前时间差的秒数
    public static long calLastedTime(Date startDate) {
        long a = new Date().getTime();
        long b = startDate.getTime();
        long c = (a - b) / 1000;
        return c;
    }


    /**
     * 比较两个时间的大小
     * @param DATE1
     * @param DATE2
     * @return
     */
    public static int compare_date(Date DATE1, Date DATE2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
//            Date dt1 = df.parse(DATE1);
//            Date dt2 = df.parse(DATE2);
            Date dt1 = DATE1;
            Date dt2 = DATE2;
            if (dt1.getTime() > dt2.getTime()) {
//                System.out.println("dt1 在dt2前");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
//                System.out.println("dt1在dt2后");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    public static Date getStrChangeDate2(String logDate){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

        Date date = null;
        try{
            date = (Date) sdf.parse(logDate);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return date;
    }

    /**
     * 获取当前时间 按照指定格式
     */
    public static String fileDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        return df.format(new Date());
    }
}

