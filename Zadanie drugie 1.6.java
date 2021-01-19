
import java.util.Scanner;

 class Zadanie drugie
 {
    public static void main(String []arg)
	{
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Podaj linijke tekstu");
		
        String dd_tekst=sc.nextLine();
		
        int dd_liczba=dd_tekst.length();
		
        System.out.println("Dlugosc tekstu to: "+dd_liczba);
    }
}