package com.example.servlet.demo.servlet;

import org.apache.commons.lang3.StringUtils;

public class tuomin {
    public static void main(String[] args) {
        System.out.println(left("weiqingxin", 1));
    }
    public static String left(String fullName,int index) {
        if (StringUtils.isBlank(fullName)) {
            return "";
        }
        String name = StringUtils.left(fullName, index);
        return StringUtils.rightPad(name, StringUtils.length(fullName), "*");
    }
}
