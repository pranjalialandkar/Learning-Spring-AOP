package com.example.spring.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
	
	public int[] retriveData() {
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new int[] {22, 44, 55, 77, 99};
	}

}
