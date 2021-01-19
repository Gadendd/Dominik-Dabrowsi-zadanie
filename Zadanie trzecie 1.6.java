
import java.util.Scanner;
 
 class Zadaniebmi
 {
 
    static Scanner userInput = new Scanner(System.in);
 
    public static void main(String[] args)
	{
 
        System.out.print("Podaj swoj wzrost: ");
 
        double dd_wzrost = userInput.nextDouble();
 
        System.out.print("Podaj swoja mase ciala: ");
 
        double dd_masa = userInput.nextDouble();
 
        double dd_bmi = dd_masa/Math.pow(dd_wzrost, 2);
 
        System.out.print("Twoje BMI wynosi: "+dd_bmi);
    }
 
 
}