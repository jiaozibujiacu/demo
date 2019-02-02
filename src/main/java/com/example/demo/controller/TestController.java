package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author jiaozi
* @version 创建时间：2018年8月23日 下午10:05:55
* 类说明//cesh呵呵呵
*/
//idea git测试 会如何


@RestController
public class TestController {
	
	@RequestMapping("/test")
	public String show() {
		return "success";
	}

}
