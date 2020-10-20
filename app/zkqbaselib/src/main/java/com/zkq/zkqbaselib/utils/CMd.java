package com.zkq.zkqbaselib.utils;

public class CMd {
    public static boolean isNull(String str)
    {
        if(str==null||str.equals("null")||str.equals(""))
            return true;
        else
            return false;
    }
}
