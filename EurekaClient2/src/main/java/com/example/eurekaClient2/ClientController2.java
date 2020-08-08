package com.example.eurekaClient2;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController2 {
	@RequestMapping("/client2")
	public String getmessage() {
		return "Iam in the second client";
	}

}
