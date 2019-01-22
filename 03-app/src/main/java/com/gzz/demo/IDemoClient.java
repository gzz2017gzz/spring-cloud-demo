package com.gzz.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("data-server")
public interface IDemoClient {

	@GetMapping("port")
	String hello();
}
