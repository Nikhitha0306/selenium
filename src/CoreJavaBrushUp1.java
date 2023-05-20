
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		// Data types
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum +  "is the value stored in myNum variable");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);
		
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 8;
		
		int[] arr2 = {1,2,3,4,5};		
		System.out.println(arr2[2]);
		
		//for loop
		/*for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}*/
		
	
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Rahul", "Shetty", "Academy"};
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
			
		}
		
		for( String s: name)
		{
			System.out.println(s);
		}
	}

}
