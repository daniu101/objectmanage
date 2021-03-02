package com.daniu101;

public class DogTest {

    public static void main(String[] args) {

        //创建狗对象：哈士奇
        Dog hashiqi = new Dog("哈士奇小6");
        hashiqi.work();

        // 输出对象，做研究
        System.out.println(hashiqi);

        WorkSpace workSpace = new WorkSpace();
        workSpace.hereWord();

    }

}
