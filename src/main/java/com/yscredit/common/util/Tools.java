package com.yscredit.common.util;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;

public class Tools {

    private static final String hexDigIts[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

    //base64字符串转byte[]
    public static byte[] base64String2ByteFun(String base64Str){
        return Base64.decodeBase64(base64Str);
    }
    //byte[]转base64
    public static String byte2Base64StringFun(byte[] b){
        return Base64.encodeBase64String(b);
    }

    /**
     * MD5加密
     * @param origin 字符
     * @param charsetname 编码
     * @return
     */
    public static String MD5Encode(String origin, String charsetname){
        String resultString = null;
        try{
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if(null == charsetname || "".equals(charsetname)){
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            }else{
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
            }
        }catch (Exception e){
        }
        return resultString;
    }


    public static String byteArrayToHexString(byte b[]){
        StringBuffer resultSb = new StringBuffer();
        for(int i = 0; i < b.length; i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    public static String byteToHexString(byte b){
        int n = b;
        if(n < 0){
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigIts[d1] + hexDigIts[d2];
    }


    /**
     *通过图片base64流判断图片等于多少字节
     *image 图片流
     */
    public static Integer imageSize(String image){
        String str=image.substring(22); // 1.需要计算文件流大小，首先把头部的data:image/png;base64,（注意有逗号）去掉。
        Integer equalIndex= str.indexOf("=");//2.找到等号，把等号也去掉
        if(str.indexOf("=")>0) {
            str=str.substring(0, equalIndex);
        }
        Integer strLength=str.length();//3.原来的字符流大小，单位为字节
        Integer size=strLength-(strLength/8)*2;//4.计算后得到的文件流大小，单位为字节
        return size;
    }
}

