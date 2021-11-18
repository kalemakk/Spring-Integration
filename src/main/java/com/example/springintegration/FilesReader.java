package com.example.springintegration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FilesReader {

    public void print(File file) {

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();

            } catch (Exception e) {

            }
        }
    }
}
