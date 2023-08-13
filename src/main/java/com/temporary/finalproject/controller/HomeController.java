package com.temporary.finalproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
public class HomeController {

	@RequestMapping("/")
	public String test(){
		log.info("HomeController.payments.execute");
		return "payments/payments";
	}
}
