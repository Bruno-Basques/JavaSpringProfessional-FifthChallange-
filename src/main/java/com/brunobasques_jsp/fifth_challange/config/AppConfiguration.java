package com.brunobasques_jsp.fifth_challange.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
} 
