package com.yy.bean.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DDZ {
    public static void main(String[] args) {
        //♧♢♢♢♠♥♦♣
        List<String> collers=new ArrayList<>();
        collers.add("♠");
        collers.add("♣");
        collers.add("♥");
        collers.add("♦");
        List<String> Ak=new ArrayList<>();
        Ak.add("A");
        Ak.add("J");
        Ak.add("Q");
        Ak.add("K");
        List<String> nu=new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            for (int j = 0; j < 4; j++) {
                nu.add(i+collers.get(j));
            }
        }
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                nu.add(collers.get(i)+Ak.get(j));
            }
        }
        nu.add("大王");
        nu.add("小王");
        Collections.shuffle(nu);
        List<String> A1=new ArrayList<>();
        List<String> A2=new ArrayList<>();
        List<String> A3=new ArrayList<>();

        Random random = new Random();
        int i1 = random.nextInt(51);
        for (int i = 0; i <nu.size()-3;) {

                if(i<51) {
                    A1.add(nu.get(i));
                    dz(nu, A1, i1, i);
                    i++;
                    A2.add(nu.get(i));
                    dz(nu, A2, i1, i);
                    i++;
                    A3.add(nu.get(i));
                    dz(nu, A3, i1, i);
                    i++;
                }
            }
        System.out.println("A3 = " + A3);
        System.out.println("A2 = " + A2);
        System.out.println("A1 = " + A1);
        System.out.println("nu = " + nu);
    }

    private static void dz(List<String> nu, List<String> a1, int i1, int i) {
        if (i==i1){
            System.out.println();
            a1.add(nu.get(51));
            a1.add(nu.get(52));
            a1.add(nu.get(53));
        }
    }
}
