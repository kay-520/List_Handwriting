package com.wmh;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: create by wangmh
 * @projectName: Mayikt
 * @packageName: com.wmh
 * @description:
 * @date: 2019/8/7
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("********************ArrayList************************");
        MyList<String> myList=new MyArrayList<String>();
        myList.add("第一个元素");
        myList.add("第二个元素");
        myList.add("第三个元素");
        myList.add("第四个元素");
        for (int i=0;i<myList.size();i++){
            System.out.println("第"+(i+1)+"个元素："+myList.get(i));
        }
        System.out.println("---------测试删除元素---------");
        myList.removeIndex(1);
        for (int i=0;i<myList.size();i++){
            System.out.println("第"+(i+1)+"个元素："+myList.get(i));
        }

        System.out.println("********************LinkedList************************");
        MyList<String> myLinkedList=new MyLinkedList<String>();
        myLinkedList.add("第一个元素");
        myLinkedList.add("第二个元素");
        myLinkedList.add("第三个元素");
        myLinkedList.add("第四个元素");
        for (int i=0;i<myLinkedList.size();i++){
            System.out.println("第"+(i+1)+"个元素："+myLinkedList.get(i));
        }
        System.out.println("---------测试删除元素---------");
        myLinkedList.removeIndex(1);
        for (int i=0;i<myLinkedList.size();i++){
            System.out.println("第"+(i+1)+"个元素："+myLinkedList.get(i));
        }
    }
}
