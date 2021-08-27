package com.java.methodrt;

public class ReturnDemo {
    public static int one(){
        return 1;
        //return 2;
        //return 3;
    }

    public static void main(String[] args) {
        System.out.println(one());
    }
}
/*
*
* 위의 코드는 컴파일 조차 되지 않는다. 왜냐하면, return은 메소드를 종료시키는 역할을 하므로 return
* 이 처음 등장한 이후의 구문은 실행되지 않기 때문이다. 하지만 아래의 예제는 문제가 전혀없다.(ReturnDemo2)*/