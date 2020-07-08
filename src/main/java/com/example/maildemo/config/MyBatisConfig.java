package com.example.maildemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.maildemo.mbg.mapper")
public class MyBatisConfig {
}
