package com.xhf;

import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        System.out.println(Test.class.getClassLoader().getResource("./"));
        Properties result = new Properties();
        InputStream in = null;
        try {
            in = Test.class.getClassLoader().getResourceAsStream("./config/a.properties");
            result.load(in);
            System.out.println(result.getProperty("test"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
