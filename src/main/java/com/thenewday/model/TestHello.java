package com.thenewday.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {
	@RequestMapping("/")
	public String getHi() {
		return " Hi";
	}
}
