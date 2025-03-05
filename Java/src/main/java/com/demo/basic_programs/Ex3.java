package com.sj.demo.basic_programs;

public class Ex3 {

    public static void main(String[] args) {
        int a[] = {1, 2, 0, 8, 0, 4, 0, 5, 0, 0, 5, 62};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] == 0) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        for (int aa : a) {
            System.out.println(aa);
        }
        System.out.println("---------------");
        System.out.println(count);

    }

}
