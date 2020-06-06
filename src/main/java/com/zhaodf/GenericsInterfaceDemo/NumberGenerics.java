package com.zhaodf.GenericsInterfaceDemo;

import java.util.Random;

/**
 * 类：NumberGenerics
 * @author zhaodf
 * @date 2020/6/5
 */
public class NumberGenerics implements GenericsInterface<Integer> {
    private Integer[] args = {1,2,3};
    @Override
    public Integer text() {
        Random r = new Random();
        return args[r.nextInt(3)];
    }

    public static void main(String[] args){
        NumberGenerics numberGenerics = new NumberGenerics();
        System.out.println(numberGenerics.text());
    }
}
