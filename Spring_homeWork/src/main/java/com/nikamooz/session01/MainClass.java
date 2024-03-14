package com.nikamooz.session01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        FileProcessor fileProcessor = ctx.getBean(FileProcessor.class);
        System.out.println(fileProcessor.NumberOfWord());


    }
}
