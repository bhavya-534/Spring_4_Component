package com.spring.four;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Spring will automatically scan our declared folder for Components like @Service and @Repository

@Configuration
@ComponentScan({"com.spring.four"})
public class AppConfiguration {
}
