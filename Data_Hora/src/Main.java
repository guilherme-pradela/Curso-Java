import java.util.Locale;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2025-07-04");
		LocalDateTime d05 = LocalDateTime.parse("2025-07-04T04:13:20");
	    Instant d06 = Instant.parse("2025-07-08T01:18:20z");
	    Instant d07 = Instant.parse("2025-07-04T04:13:20-03:00");
	    
	    LocalDate d08 = LocalDate.parse("04/07/2025", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("04/07/2025 04:24", fmt2);

		LocalDate d010 = LocalDate.of(2025, 7, 04);
		LocalDateTime d011 = LocalDateTime.of(2025, 7, 04, 4, 28);
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDate past1 = d04.minusDays(7);
		LocalDate future1 = d04.plusDays(7);
		
		LocalDateTime past2 = d05.minusDays(7);
		LocalDateTime future2 = d05.plusDays(7);
		
		Instant past3 = d06.minus(7, ChronoUnit.DAYS);
		Instant future3 = d06.plus(7, ChronoUnit.DAYS);

		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("r1 = "  + r1);
		System.out.println("r2 = "  + r2);
		System.out.println("r3 = "  + r3);
		System.out.println("r4 = "  + r4);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d010 = " + d010); 		
		System.out.println("d011 = " + d011);
		
		System.out.println("d04 dia = "  + d04.getDayOfMonth());
		System.out.println("d04 mês = "  + d04.getMonthValue());
		System.out.println("d04 ano = "  + d04.getYear());
		System.out.println("d05 hora = "  + d05.getHour());
		System.out.println("d05 minutos = "  + d05.getMinute());

        System.out.println("past1 = " + past1);
        System.out.println("future1 = " + future1);
        System.out.println("past2 = " + past2);
        System.out.println("future2 = " + future2);
        System.out.println("past3 = " + past3);
        System.out.println("future3 = " + future3);

         Duration t1 = Duration.between(past1.atStartOfDay(), d04.atStartOfDay());
         Duration t2 = Duration.between(past2, d05);
         Duration t3 = Duration.between(past3, d06);
         Duration t4 = Duration.between(d06, past3);


         System.out.println("t1 dias = " + t1.toDays());
         System.out.println("t2 dias = " + t2.toDays());
         System.out.println("t3 dias = " + t3.toDays());
         System.out.println("t4 dias = " + t4.toDays());

	}

}
