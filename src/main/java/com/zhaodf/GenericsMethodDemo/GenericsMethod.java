package com.zhaodf.GenericsMethodDemo;

import java.util.List;

/**
 * 类：GenericsMethod
 *
 * @author zhaodf
 * @date 2020/6/5
 */
public class GenericsMethod {
    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        T t = c.newInstance();
        return t;
    }

    public static void main(String[] args) {
        GenericsMethod genericsMethod = new GenericsMethod();
        try {
            User user = (User)genericsMethod.getObject(Class.forName("com.zhaodf.GenericsMethodDemo.User"));
            System.out.println(user.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
