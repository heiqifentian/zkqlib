package com.zkq.zkqbaselib.utils;

import android.widget.EditText;

import org.json.JSONObject;

import java.util.regex.Pattern;

public class CMd {


    public static void Syo(String s)
    {
        System.out.println(s);

    }

    //返回字符串不区分大小写(返回全大写)
    public static String NoBigOrSmalll(String str)
    {
        return  str.toUpperCase();
    }


    //字符串是否为空
    public static boolean isNull(String str)
    {
        if(str==null||str.equals("null")||str.equals(""))
            return true;
        else
            return false;
    }

    /****判断是否为纯汉字***/
    public static boolean isHanziName(String name)
    {
        int n = 0;
        for(int i = 0; i < name.length(); i++) {
            n = (int)name.charAt(i);
            if(!(19968 <= n && n <40869)) {
                return false;
            }
        }
        return true;
    }

    //编辑框是否为空
    public static boolean isEditNull(EditText editText)
    {
        if(editText==null||editText.getText()==null||editText.getText().toString().equals("null")||editText.getText().toString().equals(""))
            return true;
        else
            return false;
    }


    //判断字符串是否为纯数字
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    //保留长度后8位
    public static String retention_length_later_8(String str){
        if(str==null)
            return "";
        return retention_length_later(str,8);
    }

    //头部补0，总的两位数
    public static String  repairZero_2(String str)
    {
        if(str!=null&&str.equals("?"))
            return str;
        if(str!=null&&str.length()<2)
        {
            return "0"+str;
        }

        return str;
    }

    //保留长度后几位
    public static String retention_length_later(String str,int length){
        if(str.length()<=length)
            return str;
        else
        {
            int nowL=str.length();
            return str.substring(nowL-length,nowL);
        }
    }

    /***
     * 字符串插入逗号 例如：12345——>1,2,3,4,5
     * ***/
    public static String addDouhaoStr(String str)
    {
        String nowStr="";
        for(int i=0;i<str.length();i++)
        {
            if(i>0)
            {
                nowStr+=",";
            }
            nowStr+=str.substring(i,i+1);
        }
        return nowStr;
    }

    //万字彩——最多保留六位
    public static String get_wzc_6num(String str)
    {
        long num_result=0;
        String str1="";
        String str_result="";
        if(CMd.isNull(str))
            return str;
        String str2=str.replaceAll(".","");
        if(!CMd.isNumeric(str2))
        {
            return str;
        }

        if(str.length()<=7)
        {
            str1=str;
        }
        else
        {
            str1=str.substring(0,7);
            if(str1.substring(6,7).equals("."))
            {
                str1=str.substring(0,6);
            }
        }

        if(str1.contains("."))
        {
            double num1=Double.parseDouble(str1);
            num_result=  Math.round(num1);
        }
        else
        {
            num_result=Long.parseLong(str1);
        }
        str_result=num_result+"";
        if(str_result.length()>6)
        {
            str_result=str_result.substring(0,6);
        }
        return str_result;
    }
}
