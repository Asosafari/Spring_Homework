package com.nikamooz.session01;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Scanner;

@Component
@PropertySource("classpath:/config.properties")
public class FileProcessorFactoryBean  implements FactoryBean<FileProcessor> {
    @Value("${Sample}")
    String sample;

    @Override
    public FileProcessor getObject() throws Exception {
        return new FileProcessor(sample,new File("src/main/resources/session01.txt"));
    }

    @Override
    public Class<?> getObjectType() {
        return FileProcessor.class;
    }
}
