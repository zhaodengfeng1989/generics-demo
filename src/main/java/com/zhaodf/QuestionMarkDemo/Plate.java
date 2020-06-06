package com.zhaodf.QuestionMarkDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 类：Plate
 *
 * @author zhaodf
 * @date 2020/6/5
 */
public class Plate<T> {
    private T item;
    public Plate(T t){item=t;}
    public void set(T t){
        item=t;
    }
    public T get(){
        return item;
    }
    public static void main(String[] args){
        Plate<? super Fruit> fruitsPlate = new Plate<Fruit>(new Fruit());
        fruitsPlate.set(new Fruit());
        fruitsPlate.set(new Apple());
        //Apple apple = fruitsPlate.get();
        Object fruit = fruitsPlate.get();
    }
}
