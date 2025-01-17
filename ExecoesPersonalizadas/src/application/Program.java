package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy):");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy):");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkOut)) {
			System.out.println("ERRO, a Data de Check-0ut deve ser posteior a de Check-In!");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva: ");
			System.out.println("Room number: ");
			number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
		}
		
		
		
		
		sc.close();
	}

}
