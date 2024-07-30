import java.util.Scanner;

class Date{ 
	int date,month,year;
	Scanner s=new Scanner(System.in);
	Date()
	{
	}
	Date(int dt, int mon, int yr)
	{
		date=dt;
		month=mon;
		year=yr;
	}
	void setd()
{
	date = s.nextInt();
}
	void setm()
	{
	month=s.nextInt();
	}
	void sety()
	{
	year=s.nextInt();
	}
	int getd()
	{
		return date;
	}
	int getm()
	{
		return month;
	}
	int getyear()
	{
		return year;
	}

	void DisplayDate()
	{
		System.out.println(date+"/"+month+"/"+year);
		
	}

}

class Datetest{
	public static void main(String args[])
{

	Date d1 = new Date();

	d1.setd();
	d1.setm();
	d1.sety();
	d1.DisplayDate();
	
}
	
}
