package com.java.methodrt;

import java.util.Arrays;

public class ReturnDemo4 {

    public static String [] getMembers(){
        String[] members = {"최진혁", "양호준", "김고은"};
        return members;
    }

    public static void main(String[] args) {
        String [] members = getMembers();
        System.out.println("members = " + Arrays.toString(members));
    }
}
