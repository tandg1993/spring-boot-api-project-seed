package com.company.project.core;

import java.text.MessageFormat;

/**
 * Created by tan.dg on 2018/5/28.
 */
public class SQLConstant {

    /**
     * SQL全模糊查询占位符
     * @see MessageFormat#format(String, Object...)
     */
    public static final String SELECT_LIKE_ALL = "%{0}%";

    /**
     * SQL左模糊查询占位符
     * @see MessageFormat#format(String, Object...)
     */
    public static final String SELECT_LIKE_LEFT = "%{0}";

    /**
     * SQL右模糊查询占位符
     * @see MessageFormat#format(String, Object...)
     */
    public static final String SELECT_LIKE_RIGHT = "{0}%";

    /**
     * SQL全模糊匹配格式化
     * @param param
     * @return
     */
    public static final String selectLikeAllFormat(String param) {
        return MessageFormat.format(SELECT_LIKE_ALL, param);
    }

    /**
     * SQL左模糊匹配格式化
     * @param param
     * @return
     */
    public static final String selectLikeLeftFormat(String param) {
        return MessageFormat.format(SELECT_LIKE_LEFT, param);
    }

    /**
     * SQL右模糊匹配格式化
     * @param param
     * @return
     */
    public static final String selectLikeRightFormat(String param) {
        return MessageFormat.format(SELECT_LIKE_RIGHT, param);
    }

}
