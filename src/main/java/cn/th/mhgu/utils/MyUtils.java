package cn.th.mhgu.utils;

public class MyUtils {

    public static String getLikeStr(String str) {
        return "%" + str + "%";
    }

    public static boolean strIsEmpty(String str) {
        return null == str || "".equals(str.trim());
    }

}
