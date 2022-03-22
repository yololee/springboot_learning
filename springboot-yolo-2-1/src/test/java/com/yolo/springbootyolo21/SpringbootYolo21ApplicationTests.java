package com.yolo.springbootyolo21;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootYolo21Application.class)
public class SpringbootYolo21ApplicationTests {

    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;

    @Value("#{20-2}")
    private Integer age;

    @Value("上海")
    private String address;

    @Test
    public void contextLoads() {
        System.out.println(name +"-"+ author+"-"+age+"-"+address);
    }

    @Autowired
    private Environment env;

    @Test
    public void testEnv(){
        System.out.println(env.getProperty("book.name"));
        System.out.println(env.getProperty("book.author"));
    }

}
