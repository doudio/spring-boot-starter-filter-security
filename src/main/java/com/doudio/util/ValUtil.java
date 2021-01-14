package com.doudio.util;

import java.util.Collection;
import java.util.Map;

/**
 * @author: doudio
 * @date: 2021-01-14 16:21
 * @description: 判断值
 **/
public class ValUtil {

    /**
     * 判断集合是否为空
     *
     * @return true 空 | false 非空
     */
    public static boolean isEmpty(Collection coll) {
        if (coll == null || coll.isEmpty()) return true;
        return false;
    }

    public static boolean isNotEmpty(Collection coll) {
        return !isEmpty(coll);
    }

    public static boolean isEmpty(Map map) {
        if (map == null || map.isEmpty()) return true;
        return false;
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

}
