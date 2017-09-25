
public class apstrings {

	public static void main(String[] args) 
	{
		String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		System.out.println(alphabet);
		
		//every other letter
		
		String test = "";
		for (int i = 0; i < alphabet.length(); i += 2)
		{
			test += alphabet.charAt(i);
		}
		String test2 = "";
		for (int j = 0; j < test.length(); j += 2)
		{
			
			test2 += test.charAt(j);
			
		}
		System.out.println(test2.replaceAll("", " ").trim());
		
		//Print out only every other letter starting with b without spaces.
		
		String test3 = "";
		for (int c = 0; c < test.length(); c +=2)
		{
			test3 = test.substring(1);
			test3 += test.charAt(c);			
		}
		String test4 = "";
		for (int i = 0; i < test3.length(); i += 2)
		{
			test4 += test3.charAt(i);
		}
		System.out.println(test4.replaceAll("", " ").trim());
		
		//vertically
		
		for (int i = 0; i < alphabet.length() - 25; i++)
		{
			System.out.println(test.charAt(i));
		}
		System.out.println();
		System.out.println("The number of characters with spaces: " + alphabet.length());
		int spaces = alphabet.length() - 26;
		System.out.println();
		System.out.println("The number of spaces is: " + spaces);
		
	}

	
}
