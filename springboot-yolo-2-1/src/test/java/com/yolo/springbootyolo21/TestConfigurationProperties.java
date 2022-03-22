package com.yolo.springbootyolo21;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootYolo21Application.class)
@EnableConfigurationProperties(TestConfigurationProperties.class)
@ConfigurationProperties(prefix = "book")
public class TestConfigurationProperties {

    private String name;
    private String author;

    @Test
    public void testEnv(){
        System.out.println(name +"-" + author);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
