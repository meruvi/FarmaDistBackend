package com.cofar.backendapolo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = "classpath:mybatisContext.xml")
public class MyBatisConfig {
   
}

