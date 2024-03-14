package com.nikamooz.session01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileProcessor {
    String sample;
    Scanner scanner;
    File file;

    public FileProcessor(String sample, File file) {
        this.sample = sample;
        this.file = file;

    }
    public int NumberOfWord() throws FileNotFoundException {
        scanner = new Scanner(file);
        int sum = 0;
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.equals(sample)) {
                sum++;
            }
        }
        return sum;

    }

}


