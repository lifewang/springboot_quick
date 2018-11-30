package com.example.springboot_quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明该类是一个springboot引导类
@SpringBootApplication
public class SpringbootQuickApplication {

    //java程序的入口
    public static void main(String[] args) {
        //run方法，运行springboot的引导类，参数是springboot引导类的字节码对象
        SpringApplication.run(SpringbootQuickApplication.class, args);
    }
}
