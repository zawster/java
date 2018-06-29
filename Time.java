package pack;
import java.util.*;
class Time 
{
	public static void main(String args[])
	{
		Calendar obj = new GregorianCalendar();
		int hour,mint,scnds;
		hour=obj.get(Calendar.HOUR);
		mint=obj.get(Calendar.MINUTE);
		scnds=obj.get(Calendar.SECOND);

		System.out.println(hour +" : "+ mint+" : "+scnds);

		int date,month,years;
		date=obj.get(Calendar.DATE);
		month=obj.get(Calendar.MONTH);
		years=obj.get(Calendar.YEAR);

		System.out.println(date +" / "+ month+" / "+years);
	}
}