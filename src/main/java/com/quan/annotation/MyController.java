package com.quan.annotation;

import java.lang.annotation.*;

/**
 * @author xiaojq
 * 08/03/2018
 **/



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

    /**
     * 给controller注册别名
     * @return
     */
    String value() default "";
}
