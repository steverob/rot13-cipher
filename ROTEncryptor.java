import java.util.Scanner;

class ROT
{
	static String rotate(String text,int shift)
	{
		char[] charText=text.toCharArray();
		char[] temp;
		
		for(int i=0;i<text.length();i++)
		{
			if(Character.isLetter(charText[i]))
				if(Character.isUpperCase(charText[i]))
				{
					int ascii=charText[i];
					ascii=ascii+shift;
					if(ascii>90)
						ascii=(ascii%91)+65;
					temp=Character.toChars(ascii);
					charText[i]=temp[0];
				}
				else if(Character.isLowerCase(charText[i]))
				{
					int ascii=charText[i];
					ascii=ascii+shift;
					if(ascii>122)
						ascii=(ascii%123)+97;
					temp=Character.toChars(ascii);
					charText[i]=temp[0];
				}
		}
		return new String(charText);
	}
}

class ROTEncryptor
{
	public static void main(String arg[])
	{
		Scanner input;
		String text;
		char ch;
		System.out.println("ROT13 Encoder:\n");
		
		do
		{
			System.out.println("Enter the String to Encode: ");
			input=new Scanner(System.in);
			text=input.nextLine();
			System.out.println("Encoded String: \n"+ROT.rotate(text,13));
			System.out.print("\n\nEnter 1 to continue and 0 to quit...");
			
		}while(input.nextInt()==1);
	}
}
		