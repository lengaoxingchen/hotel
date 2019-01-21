
package cn.itcast.utils;

public class KeyUtils {
    public static String genUniqueKey() {
        String id = String.valueOf(System.currentTimeMillis() / 1000 + 1);
        return id;
    }

}