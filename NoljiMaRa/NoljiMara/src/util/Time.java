package util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {
	
	//�ڹ��� LocalDateTime ������ Ÿ���� DB�� insert �� �� �ʿ�
	public static Timestamp localDateTimeToTimeStamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt); // ���� ��¥�� �ð�
	}
	
	//DB�� TimeStamp ������ Ÿ���� Java�� select �Ͽ� ������ �� �ʿ�
	public static LocalDateTime timeStampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime(); // ���� ��¥�� �ð�
	}
	
	public static void main(String[] args) {
		Timestamp ts = localDateTimeToTimeStamp(LocalDateTime.now());
		System.out.println("ts : "+ts);
		
		LocalDateTime ldt = timeStampToLocalDateTime(ts);
		System.out.println("ldt : "+ldt);
	}
};
