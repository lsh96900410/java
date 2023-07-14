package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) throws Exception {
		long currentTime = System.currentTimeMillis();
		System.out.println("System.currentTimeMillis() ==>"+currentTime);
		long startTime = System.currentTimeMillis();
		
		Thread.sleep(12);
		
		long endTime = System.currentTimeMillis();
		long duration = endTime-startTime;
		System.out.println("duration : "+ duration+"ms");
		
		/*
			java.util.Date
				-The class Date represents a specific instant in time, with millisecond precision.
		*/
		Date now=new Date();
		String nowString = now.toString();
		System.out.println(nowString);
		
		long currentTimeMillis1=now.getTime();
		System.out.println("Date.getTime()==>"+currentTimeMillis1);
		
		System.out.println("------------------- SimpleDateFormat[Date --> String] -----------------");
		/*
		  	SimpleDateFormat : Date객체의 시간을 문자열로 변경해주는 클래스
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		sdf1.applyPattern("yyyy 년 MM 월 dd 일");
		String formatStr1 = sdf1.format(now);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd/HH:mm");
		String formatStr2 = sdf1.format(now);
		System.out.println(formatStr2);
		
		sdf1.applyPattern("yyyy");
		String formatStr3 = sdf1.format(now);
		System.out.println("String:"+formatStr3);
		System.out.println("int --> "+Integer.parseInt(formatStr3));
		System.out.println("---------- SimpleDateFormat[ String-->Date ]------------");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay=sdf2.parse("2020-06-30");
		System.out.println(myBirthDay.toString());
		System.out.println(myBirthDay.toLocaleString());
		System.out.println(myBirthDay.getTime());
		
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay = sdf2.parse("1998/05/12 17:45:23");
		System.out.println(yourBirthDay.toString());
		System.out.println(yourBirthDay.toLocaleString());
		System.out.println(yourBirthDay.getTime());
		
		/**************************Calendar*************************************************/
		
		System.out.println("***************************Calendar*****************************");
		Calendar cal1=Calendar.getInstance(); 
		System.out.println(cal1);
		long currentTimeMilil3 = cal1.getTimeInMillis();
		System.out.println("Calendar.getTimeInMillis():"+currentTimeMilil3);
		int y = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH);
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		int hour = cal1.get(Calendar.HOUR);
		int minute = cal1.get(Calendar.MINUTE);
		int second = cal1.get(Calendar.SECOND);
		int msecond = cal1.get(Calendar.MILLISECOND);
		System.out.println(y+"/"+(month+1)+"/"+day+" "+hour+":"+minute+":"+second+"."+msecond);
		
		System.out.println("---------- Calendar-->Date ------------");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2021, Calendar.JANUARY, 10, 13, 59, 59);
		Date date2 = cal2.getTime();
		System.out.println("Date date2-->"+date2);
		
		System.out.println("--------------------- Date객체메쏘드 ------------------------");
		Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2023-01-03");
		Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse("2023-01-03");
		Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse("2023-01-15");
		
		System.out.println("date3.equals(date4) :"+date3.equals(date4));
		// System.out.println("date3 ==date4 :"+(date3==date4));
		System.out.println("date4.equals(date5) :"+date4.equals(date5));
		System.out.println("date3.compareTo(date4):"+date3.compareTo(date4));
		System.out.println("date4.compareTo(date5):"+date4.compareTo(date5));
		System.out.println("date5.compareTo(date4):"+date5.compareTo(date4));
		
		long gapMiliSec= date5.getTime()-date4.getTime();
		System.out.println(gapMiliSec);
		System.out.println("sec:"+gapMiliSec/1000);
		System.out.println("min:"+gapMiliSec/1000/60);
		System.out.println("hour:"+gapMiliSec/1000/60/60);
		System.out.println("day :"+gapMiliSec/1000/60/60/24);
		
		System.out.println("------------ java.util.Date --> java.sql.Date ----------");

		java.util.Date utilDate1 =new java.util.Date();
		java.util.Date utilDate2 =new java.util.Date(System.currentTimeMillis());
		
		java.sql.Date sqlDate1=new java.sql.Date(utilDate1.getTime()); //sql Date : 인자 0개짜리 생성자 X 인자 무조건 넣어줘야함
		java.sql.Date sqlDate2=new java.sql.Date(utilDate2.getTime());
		
		System.out.println(sqlDate1);
		System.out.println(sqlDate2);
		
		System.out.println("------------ java.sql.Date --> java.util.Date ----------");
		
		java.sql.Date sqlDate3 = new java.sql.Date(System.currentTimeMillis());
		java.sql.Date sqlDate4 = new java.sql.Date(new SimpleDateFormat("yyyy/MM/dd").parse("2000/05/05").getTime());
		
		System.out.println(sqlDate3);
		System.out.println(sqlDate4);
		
		java.util.Date utilDate3 = sqlDate3;
		java.util.Date utilDate4 = sqlDate4;
		
		System.out.println(utilDate3);
		System.out.println(utilDate4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
