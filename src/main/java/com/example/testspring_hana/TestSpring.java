package com.example.testspring_hana;

import com.example.testspring_hana.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)
                applicationContext.getBean("userService");
        boolean flag =userService.login("丁真","ruike5");
        if (flag){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}