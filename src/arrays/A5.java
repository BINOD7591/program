// wap to read n no. of books and check wheather user entered book is present or not in your list ?
package arrays;

import java.util.Scanner;

public class A5
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Specify number of book:-");
		int size=s.nextInt();
		String[] book=new String[size];
		System.out.println("Enter the  book name:-");
		s.nextLine();
		for(int i=0;i<book.length;i++)
		{
			book[i]=s.nextLine();
		}
		System.out.println("Entered book to be search:- ");
		String key=s.nextLine();
		int count=0;
		for(int i=0;i<book.length;i++)
		{
			if(book[i].equalsIgnoreCase(key))
			{
				count=1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Book is found.");
		}
		else
		{
			System.out.println("Book is not found.");
		}
	}

}
