package com.jzhl.plate.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UnicodeChange {

    //UTF-8->GB2312
    public static String utf8Togb2312(String str){

        StringBuffer sb = new StringBuffer();

        for ( int i=0; i<str.length(); i++) {

            char c = str.charAt(i);
            switch (c) {
                case '+' :
                    sb.append( ' ' );
                    break ;
                case '%' :
                    try {
                        sb.append(( char )Integer.parseInt (
                                str.substring(i+1,i+3),16));
                    }
                    catch (NumberFormatException e) {
                        throw new IllegalArgumentException();
                    }

                    i += 2;

                    break ;

                default :

                    sb.append(c);

                    break ;

            }

        }

        String result = sb.toString();

        String res= null ;

        try {

            byte [] inputBytes = result.getBytes( "8859_1" );

            res= new String(inputBytes, "UTF-8" );

        }

        catch (Exception e){}

        return res;

    }


    //GB2312->UTF-8
    public static String gb2312ToUtf8(String str) {

        String urlEncode = "" ;

        try {

            urlEncode = URLEncoder.encode (str, "UTF-8" );

        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();

        }

        return urlEncode;

    }


    public static void main(String[] args){

        try {

            String str="輸入簡體字,點下面繁體字按鈕進行在線轉換.";//%E4%B8%AD%E5%9B%BD

            str=gb2312ToUtf8(str);

            System.out.println(str);

            str=utf8Togb2312(str);

            System.out.println(str);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }



}

