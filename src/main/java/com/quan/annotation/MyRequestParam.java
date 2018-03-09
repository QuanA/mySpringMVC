package com.quan.annotation;

import java.lang.annotation.*;

/**
 * @author xiaojq
 * 08/03/2018
 **/
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented public @interface MyRequestParam {

    /**
     * 参数别名，必填
     * @return
     */
    String value();
}
