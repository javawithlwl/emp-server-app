package com.careerit.ems.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig {

      @Bean
      public ObjectMapper objectMapper(){
            return new ObjectMapper();
      }
      @Bean
      public WebMvcConfigurer corsConfig() {
            return new WebMvcConfigurer() {
                  @Override
                  public void addCorsMappings(CorsRegistry registry) {
                        registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
                  }
            };
      }
}
