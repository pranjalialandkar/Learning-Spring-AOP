package com.example.spring.springaop.data;

import org.springframework.stereotype.Repository;

import com.example.spring.springaop.aspects.annotations.TrackTime;



@Repository
public class DataService2 {
	
	@TrackTime
	public int[] retriveData() {
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new int[] { 111, 333, 666, 777, 888};
	}
}
