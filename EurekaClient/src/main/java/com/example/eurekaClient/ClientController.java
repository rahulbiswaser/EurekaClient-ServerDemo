package com.example.eurekaClient;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
	
@Autowired
RestTemplate restTemplate;

@RequestMapping("/")
public String hello()
{
	return "Hello world";
}

@RequestMapping("/checkRestWithAppName")
public String getRestResultName() {
	String result="";
	result=restTemplate.getForObject("http://target/client2",String.class);
	result=result+":::::I got the result from client2";
	return result;
}

}
