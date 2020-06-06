package com.zhaodf.GenericsClassDemo;

import java.util.ArrayList;

/**
 * 类：Generics
 * @author zhaodf
 * @date 2020/6/3
 */
public class GenericsDemo<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void noSpecifyType(){
        GenericsDemo demo = new GenericsDemo();
        demo.setT("test");
        String t = (String)demo.getT();
        System.out.println(t);
    }

    public static void specifyType(){
        GenericsDemo<String> demo = new GenericsDemo();
        demo.setT("test2");
        String t = demo.getT();
        System.out.println(t);
    }

    public static void main(String[] args){
        //noSpecifyType();
        //specifyType();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        ArrayList<Float> floats = new ArrayList<Float>();
        if (integers.getClass() == floats.getClass()) { // 泛型擦除，两个 List 类型是一样的
            System.out.println("比较成立");
        }
    }
}
