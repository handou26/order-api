package com.jd.api;

import org.springframework.stereotype.Service;

import com.jd.util.GsonUtil;
import com.jd.util.ResponseEntity;

import feign.hystrix.FallbackFactory;

@Service
public class FallbackUserService  implements FallbackFactory<FeginUserService> {

	@Override
	public FeginUserService create(Throwable exception) {
		
		return new FeginUserService() {
			
			@Override
			public String user(String name) {
				
				return GsonUtil.GsonString(new ResponseEntity(-1, "服务器异常，已开启服务降级", exception.getMessage()));
			}
		};
		
		
	}

}
