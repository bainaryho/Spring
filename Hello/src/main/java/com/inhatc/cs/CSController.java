package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController {

	///1
	@RequestMapping("doA")
	public void doA() {
		System.out.println("doA1 Called~~~");
		
		int i = 1 ;
		int sum = 0;
		
		for (i=1; i<=10; i++) {
			sum+=i ;
			System.out.println("sum: " + sum + "\n");
		}
		
		
	}
	///2
	@RequestMapping("doB")
	public void doB() {
		System.out.println("doB Called~~~");
	}
	
}