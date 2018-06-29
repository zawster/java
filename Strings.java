package pack;
class Strings
{
	public static void main(String args[])
	{
		String s="Hello world !";
		String s1="Hello WOrld !";
		String s2,s3,s4;

		//   String methods

		s2=s1.toUpperCase();
		s3=s2.toLowerCase();
		int indx = s1.indexOf('o');
		int x=s1.lastIndexOf('r');
		Boolean bool =s.equals(s1);    //  also check case sensitivity
		Boolean bool1=s.equalsIgnoreCase(s1);  //  don't check case sensitivity
		s4=s1.substring(3,8);   //   crope the string  //  ends before given index

		System.out.println("to Upper Case = " + s2);
		System.out.println("to Lower Case = " + s3);
		System.out.println(indx);
		System.out.println(x);
		System.out.println(s4);
		if(bool)
		{
			System.out.println("Strings are equal ");
		}
		else
			System.out.println("Strings are not equal ");
	}
}