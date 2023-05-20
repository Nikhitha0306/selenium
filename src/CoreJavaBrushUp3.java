
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
	  //string is an object //string literal
		
		//String s1 = "Rahul shetty academy";
		
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul shetty academy";
		String[] splittedString = s.split("shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		
		//if we want to get rid of white space or trim
		System.out.println(splittedString[1].trim());
		
		//charcter by charcter
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
			
		}
	}

}
