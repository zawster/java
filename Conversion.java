// class Conversion{
// 	public static void main(String args[]){
// 		String str="12";
// 		int a = Integer.parseInt(str);  // string to integer
// 		float b=Float.parseFloat(str);  //  String to Float

// 		//System.out.println(a+3);
// 		//System.out.println(b+3.2);

// 		int x=123;
// 		String s=String.parseString(x);

// 		System.out.println(s+"asd");
// 	}
// }

//
//  Comand line arguments
//
class Conversion{
	Conversion(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String arg[]){
		int sum=Integer.parseInt(arg[0])* Integer.parseInt(arg[1]);
		System.out.println(sum);

				Conversion obj=new Conversion(6,7);

	}
}