package com.A9SpringConfigurationWithJavaCodeNoXMLPureJava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.A9SpringConfigurationWithJavaCodeNoXMLPureJava") // Optional  // Package to scan through
@PropertySource("classpath:teacherInfo.properties")
public class ConfigurationClass { // pass this class name to the ClassPath...constructor insted of xml file name while creating container/context

}
