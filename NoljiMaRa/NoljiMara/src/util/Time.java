package util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {
	
	//자바의 LocalDateTime 데이터 타입을 DB에 insert 할 때 필요
	public static Timestamp localDateTimeToTimeStamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt); // 현재 날짜와 시간
	}
	
	//DB의 TimeStamp 데이터 타입을 Java로 select 하여 가져올 때 필요
	public static LocalDateTime timeStampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime(); // 현재 날짜와 시간
	}
	
	public static void main(String[] args) {
		Timestamp ts = localDateTimeToTimeStamp(LocalDateTime.now());
		System.out.println("ts : "+ts);
		
		LocalDateTime ldt = timeStampToLocalDateTime(ts);
		System.out.println("ldt : "+ldt);
	}
};
