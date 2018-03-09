package com.quan.annotation;

import java.lang.annotation.*;

/**
 * @author xiaojq
 * 08/03/2018
 **/
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented public @interface MyRequestMapping {

    /**
     * 访问该方法的url
     * @return
     */
    String value() default "";
}
