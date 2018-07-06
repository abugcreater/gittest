package com.fk;

import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.testOutMemary();

        System.out.println("Hello World");
    }

    public void testOutMemary(){

        //测试堆溢出状态
        ArrayList list=new ArrayList();
        while(true)
        {
            list.add(new HelloWorld());

        }
    }



}
