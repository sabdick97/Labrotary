package com.emp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Emplyoee {

	private long empId;
	private String empName;
	private double empSal;
	
	//entity reference
	
	Address address;//HAS_A Relationship
}
