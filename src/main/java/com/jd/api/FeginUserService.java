package com.jd.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value="userService",fallbackFactory=FallbackUserService.class)
public interface FeginUserService {
	
	 @RequestMapping(value = "/user", method = RequestMethod.GET)
     public String user(@RequestParam("name") String name);

}

