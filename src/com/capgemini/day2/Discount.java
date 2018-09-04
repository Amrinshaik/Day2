package com.capgemini.day2;

public class Discount {

	

	public static double calculateDiscount(double actualprice, double discount) {
		double newItemPrice=0;
		newItemPrice=actualprice-(actualprice*(discount/100));
		return newItemPrice;
	}

}