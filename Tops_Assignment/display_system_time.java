package Tops_Assignment;

import java.time.LocalDateTime;
import java.util.Date;

public class display_system_time {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(LocalDateTime.now());
		System.out.println(date);
	}

}
