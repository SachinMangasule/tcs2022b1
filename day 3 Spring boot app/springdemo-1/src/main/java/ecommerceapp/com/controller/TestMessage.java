package ecommerceapp.com.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMessage {

	@GetMapping(value = "/shoemessge")
	String Message() {
		return "hi how are you";
		
	}
}
