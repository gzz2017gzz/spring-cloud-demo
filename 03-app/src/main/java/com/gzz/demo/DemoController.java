package com.gzz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private IDemoClient client;

	@RequestMapping("hello")
	public String port() {
		return client.hello();
	}
}
