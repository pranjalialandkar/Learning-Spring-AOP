package com.example.spring.springaop.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;
import com.example.spring.springaop.data.DataService2;

@Service
public class BusinessService2 {
	
	private DataService2 dataService2;

	public BusinessService2(DataService2 dataService2) {
		super();
		this.dataService2 = dataService2;
	}
	
	public int calculateMin() {
		int[] data = dataService2.retriveData();
		return Arrays.stream(data).min().orElse(0);
	}

}
