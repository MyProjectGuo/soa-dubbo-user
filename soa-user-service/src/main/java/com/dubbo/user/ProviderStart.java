package com.dubbo.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.dubbo.user.dao")
@ImportResource(value = {"classpath:com/dubbo/user/resources/dubbo-reference.xml"})
@EnableTransactionManagement
@EnableCaching
@EnableRabbit
public class ProviderStart {

	public static void main(String[] args) {
		SpringApplication.run(ProviderStart.class, args);
	}
}
