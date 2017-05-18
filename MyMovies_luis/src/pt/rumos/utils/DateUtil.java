package pt.rumos.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	
	
	LocalDateTime currentTime = LocalDateTime.now();
	public LocalDate todayDate = currentTime.toLocalDate();
	LocalDateTime time = LocalDateTime.now().minusDays(7);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public String oneWeekAgo = time.format(formatter);

}
