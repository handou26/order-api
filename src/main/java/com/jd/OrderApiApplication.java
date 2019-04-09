package com.jd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 *  @SpringBootApplication
 *	@EnableDiscoveryClient   等于这个  @SpringCloudApplication
 *	@EnableCircuitBreaker  开启断路器
 */
@EnableFeignClients     //EnableFeignClients调用其他服务的api
@SpringCloudApplication //开启断路器功能  eureka客户端  boot
@MapperScan("com.jd.mapper")
public class OrderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApiApplication.class, args);
	}
}

