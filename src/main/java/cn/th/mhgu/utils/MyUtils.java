package cn.th.mhgu.utils;

import java.util.Collection;

public class MyUtils {

    public static String getLikeStr(String str) {
        return "%" + str + "%";
    }

    public static boolean strIsEmpty(String str) {
        return null == str || "".equals(str.trim());
    }

    public static boolean collectionIsEmpty(Collection c) {
        return c == null || c.size()<=0;
    }

}
