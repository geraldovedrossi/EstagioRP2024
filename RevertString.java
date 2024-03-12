/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class RevertString
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira sua String");
		String str = scanner.nextLine();
		
		char[] strArray = str.toCharArray();
		
		char[] newStrArray = new char[str.length()];
		
		int n = 0;
		for(int i = str.length() - 1; i >= 0; i--){
		    newStrArray[n] = strArray[i];
		    n++;
		}
		
		System.out.println(newStrArray);
	}
}
