package com.pnc.main;

import com.pnc.bank.Emp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
		emp.setSid(4422);
		emp.setName("Shubha");
		emp.setAvg(90);
		emp.setAdress("Pttsburgh");
		
		
		
		System.out.println("Emp id : " + emp.getSid() + " Emp Name: " + emp.getName() + " Emp Avg marks: " + emp.getAvg() + " Emp adress: " + emp.getAdress());
		
	}

}
