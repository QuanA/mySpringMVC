package com.quan.core.controller;

import com.quan.annotation.MyController;
import com.quan.annotation.MyRequestMapping;
import com.quan.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xiaojq
 * 08/03/2018
 **/
@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response, @MyRequestParam("param") String param) {
        System.out.println(param);
        try {
            response.getWriter().write("doTest method success!param:" + param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @MyRequestMapping("doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("doTest method success！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
