package com.mk.project1;

public class Scalc {
	public int salaryCalc (int salary, boolean PE) {
		int incomeTax = 0, stampFee = 0, pensionalPayment = 0;
		
		incomeTax = salary * 22/100 ;
		
		if (salary <= 100000) stampFee = 1500;
		else if (salary <= 200000) stampFee = 3000;
		else if (salary <= 500000) stampFee = 5500;
		else if (salary <= 1000000) stampFee = 8500;
		else stampFee = 15000;
		
		if (PE) {
			if (salary <= 500000) pensionalPayment = salary * 35/1000;
			else if (salary <= 1020000) pensionalPayment = (salary * 10/100) - 32500;
			else pensionalPayment = 69500;
		}
		
		salary = salary - incomeTax - stampFee - pensionalPayment;
		return salary;
	}
}