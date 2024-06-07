package com.effectivejava.item9;

import java.io.*;

public class Copy {
    private static final int BUFFER_SIZE = 8 * 1024;

    public static void copy (String src, String dest) throws IOException {
        // try-finally
        FileInputStream fileInputStream = new FileInputStream(src);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(dest);
            try {
                byte[] buffer = new byte[BUFFER_SIZE];
                int n;
                while ((n = fileInputStream.read(buffer)) >= 0) {
                    fileOutputStream.write(buffer, 0, n);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            fileInputStream.close();
        }
    }

    public static void copyTryWithResources (String src, String dest) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(src);
             FileOutputStream fileOutputStream = new FileOutputStream(dest)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int n;
            while ((n = fileInputStream.read(buffer)) >= 0) {
                fileOutputStream.write(buffer, 0, n);
            }
        }
    }
}
