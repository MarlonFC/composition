package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
				
		System.out.println();
		
		System.out.println("Enter worker data: ");
		
		Worker w = new Worker();
		
		System.out.print("Name: ");
		w.setName(sc.nextLine());
		System.out.print("Level: ");
		WorkerLevel.valueOf(sc.nextLine());
		System.out.print("Base salary: ");
		w.setBaseSalary(sc.nextDouble());
		
		System.out.print("How many contracts to this worker?");
		int N;
		N = sc.nextInt();
		
		HourContract[] contracts = new HourContract[N];
		
		for(int i = 0; i<N;i++) {
			System.out.println("Enter contract #1 data:");
			System.out.print("Date (DD/MM/YYYY): ");
			SimpleDateFormat date = new SimpleDateFormat("DD/MM/YYYY");
			contracts[i].setDate(date.format(sc.nextLine()));
			//date.format(sc.nextLine());
			System.out.print("Value per hour:");
			double valuePerHour;
			valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours):");
			int hours = sc.nextInt();
			
		}
		
		
		
		
		
		
		sc.close();

	}
	

}
