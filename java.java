
	import java.util.Scanner;
	import java.io.*;

	class ZadaniePolaFP
	{
	public static void main(String [] a)
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println(" kwadrat - prostokat - exit ");
			String wybor = sc.nextLine();
			wybor.toUpperCase();
		
			if(wybor.equals("kwadrat"))
			{
			
			int bok = 0;
			System.out.println("wybrano: kwadrat");
			while (bok <=0){
				System.out.println("Podaj bok kwadratu: ");
				bok = sc.nextInt();
			}
			int pole = bok*bok;
			System.out.println("Pole = " + pole);
			
			String tekst = "Pole = " + pole;
			
			bok = bok-1;
			for(int i=0;i<=bok;i++){
				for(int j=0;j<=bok;j++){
					if(i==0||j==0||i==bok||j==bok){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		
			
			}else if(wybor.equals("prostokat"))
			{
			
			int bok1=0;
			int bok2=0;
			System.out.println("wybrano: prostokat");
			while (bok1 <=0){
				System.out.println("Podaj 1-szy bok prostokatu: ");
				bok1 = sc.nextInt();
			}
			while (bok2 <=0){
				System.out.println("Podaj 2-gi bok prostokatu: ");
				bok2 = sc.nextInt();
			}
			
			int pole = bok1*bok2;
			System.out.println("Pole = " + pole);
			
			
			
			bok1 = bok1-1;
			bok2 = bok2-1;
			for(int i=0;i<=bok1;i++){
				for(int j=0;j<=bok2;j++){
					if(i==0||j==0||i==bok1||j==bok2){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
			
		}
		else if(wybor.equals("exit"))
		{
			System.out.println("Zegnam");
		}else
		{
			System.out.println("blad");
		}
	}
}