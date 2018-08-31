package com.capgemini.day2;
import java.text.DecimalFormat;

public class TotalAverage {

	public static int checkTotalOfStudent1(int subject1, int subject2, int subject3) {
		
		return (subject1 + subject2 + subject3);

	}

	public static int checkTotalOfStudent2(int subject1, int subject2, int subject3) {
		return (subject1 + subject2 + subject3);

	}

	public static int checkTotalOfStudent3(int subject1, int subject2, int subject3) {
		return (subject1 + subject2 + subject3);
	}

	public static double checkAverageOfStudent1(int subject1, int subject2, int subject3) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double average;
		average = (subject1 + subject2 + subject3) / 3;
		average = Double.valueOf(decimalFormat.format(average));
		return average;
	}

	public static double checkAverageOfStudent2(int subject1, int subject2, int subject3) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double average;
		average = (subject1 + subject2 + subject3) / 3;
		average = Double.valueOf(decimalFormat.format(average));
		return average;
	}

	public static double checkAverageOfStudent3(int subject1, int subject2, int subject3) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double average;
		average = (subject1 + subject2 + subject3) / 3;
		average = Double.valueOf(decimalFormat.format(average));
		return average;
	}

	public static int checkTotalOfAllInSubject1(int student1, int student2, int student3) {
		return (student1 + student2 + student3);

	}

	public static int checkTotalOfAllInSubject2(int student1, int student2, int student3) {
		return (student1 + student2 + student3);

	}

	public static int checkTotalOfAllInSubject3(int student1, int student2, int student3) {
		return (student1 + student2 + student3);

	}

	public static double checkAverageOfAllInSubject1(int student1, int student2, int student3) {

		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double average;
		average = (student1 + student2 + student3) / 3;
		average = Double.valueOf(decimalFormat.format(average));
		return average;

	}

	public static double checkAverageOfAllInSubject2(int student1, int student2, int student3) {

		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double average;
		average = (student1 + student2 + student3) / 3;
		average = Double.valueOf(decimalFormat.format(average));
		return average;

	}

	public static double checkAverageOfAllInSubject3(int student1, int student2, int student3) {

		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double average;
		average = (student1 + student2 + student3) / 3;
		average = Double.valueOf(decimalFormat.format(average));
		return average;

	}

}
