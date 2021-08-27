package com.java.methodrt;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class MethodDemo7 {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }
        return output;
    }


    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println("result = " + result);

        try {// 무시
            //다음 행은 out.txt라는 파일에 numbering이라는 메소드가 반환한 값을 저장한다.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } // 무시

    }
}