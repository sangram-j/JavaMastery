package com;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriting {

    public static void main(String[] args) throws Exception {
        String str = "demo1";
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Sangram1.Jadhav\\Downloads\\test.txt");
        //byte [] byteArr = str.getBytes();
        fos.write(str.getBytes(StandardCharsets.UTF_8));
        fos.close();
        System.out.println("file written successfully");

        //using FileInputStream
        FileInputStream fis = new FileInputStream("C:\\Users\\Sangram1.Jadhav\\Downloads\\test.txt");
        byte[] buffer = new byte[1024];  // buffer to hold the read data

        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, bytesRead));  // Convert byte array to String
        }

        //using FileReader
        FileReader fr = new FileReader("C:\\Users\\Sangram1.Jadhav\\Downloads\\test.txt");
        byte[] buf = new byte[1024];
        int charcter;
        while ((charcter = fr.read()) != -1) {
            System.out.print((char) charcter);
        }
    }
}
