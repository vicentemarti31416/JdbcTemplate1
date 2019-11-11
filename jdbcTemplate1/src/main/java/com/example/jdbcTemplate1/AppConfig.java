package com.example.jdbcTemplate1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.example.jdbcTemplate.*"})
@Import(DataConfig.class)
public class AppConfig {

}
