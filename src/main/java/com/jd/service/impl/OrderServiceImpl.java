package com.jd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.mapper.OrderMapper;
import com.jd.service.OrderService;
import com.jd.util.ResponseEntity;

@Service(value = "orderService")
@Transactional
public class OrderServiceImpl implements  OrderService{

    @Autowired
    private OrderMapper orderMapper;

	@Override
	public ResponseEntity orderlist() {
		
		return new ResponseEntity(-1, "操作成功", orderMapper.selectlist());
	}

}
