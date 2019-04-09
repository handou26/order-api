package com.jd.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jd.api.FeginUserService;
import com.jd.service.OrderService;
import com.jd.util.ResponseEntity;

@RestController
public class OrderController {
	
	@Value("${server.port}")
	private String port;
	
	@Value("${spring.application.name}")
	private String hostname;
	
	@Resource
	private OrderService orderService;
	
	
	@Autowired
	public FeginUserService feginUserService;
	
	@RequestMapping("order")
	public String order(@RequestParam String name){
		
		 return "你好，" + name + "我是订单系统，" + hostname + ",端口是" + port +feginUserService.user(name);
		
	}
	
	@RequestMapping("orderlist")
	public ResponseEntity orderlist(){
		
		 return orderService.orderlist();
		
	}
}
