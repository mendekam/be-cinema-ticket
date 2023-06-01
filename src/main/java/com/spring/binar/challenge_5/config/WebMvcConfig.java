package com.spring.binar.challenge_5.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedMethods("*")
        .allowedOrigins("localhost:3000")
        .allowedHeaders("*")
        .allowCredentials(false)
        .maxAge(-1);
  }
}