package com.jd.api;

import org.springframework.stereotype.Service;

@Service
public class FeginUserError implements FeginUserService {

	@Override
	public String user(String name) {
		return "调用用户系统出错"+name+"!  sorry ,error !";
	}
}
