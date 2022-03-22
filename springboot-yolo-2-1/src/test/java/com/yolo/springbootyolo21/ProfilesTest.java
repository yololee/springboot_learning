package com.yolo.springbootyolo21;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootYolo21Application.class)
public class ProfilesTest {

    @Value("${server.port}")
    private String port;

    @Test
    public void test01(){
        System.out.println(port);
    }
}
