package pkg1;

public class ClassC {

	public static void main(String[] args) 
	{
		String a="Satish";
		String b= "";
		int size = a.length();
		System.out.println(size);
		
		for(int i=size-1; i>=0; i--) 
		{
		     b = b + a.charAt(i);   
		}
		System.out.println(b);
	}

}
