package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Aula81 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("1972-02-08T05:35:04Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();// instanciei o calendar
		cal.setTime(d);// coloquei a data dentro dele
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		
		/*Date d1 = sdf1.parse("08/02/1972");
		Date d2 = sdf2.parse("08/02/1972 02:35:04");
		Date d4 = new Date();
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		System.out.println("d3: " + d3);
		System.out.println("d4: " + d4);
		System.out.println("-------------------------------");
		System.out.println("d1: " + sdf1.format(d1));
		System.out.println("d2: " + sdf1.format(d2));
		System.out.println("d3: " + sdf1.format(d3));
		System.out.println("d4: " + sdf1.format(d4));
		System.out.println("-------------------------------");
		System.out.println("d1: " + sdf2.format(d1));
		System.out.println("d2: " + sdf2.format(d2));
		System.out.println("d3: " + sdf2.format(d3));
		System.out.println("d4: " + sdf2.format(d4));*/
		sc.close();
	}

}
