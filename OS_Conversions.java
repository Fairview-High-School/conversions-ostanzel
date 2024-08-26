import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Owen Stanzel
 * @version 8/41/2025
 */
public class OS_Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Meters to Owen Lengths");
        System.out.println("8. Owen Lengths to Meters");
        System.out.println("9. Denver Lengths to Owen Lengths");
        System.out.println("10. Owen Lengths to Denver Lengths");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Farenheit: ");
            double farenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (farenheit-32) * 5/9;
            System.out.println(farenheit + " degrees farenheit is " + celsius + " degrees fahrenheit");
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection ==3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/3.281;
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection ==4)
        {
            System.out.println("Enter Meters: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet*3.281;
            System.out.println(feet + " meters is " + meters + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces* 29.574;
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter milliliters: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces/29.574;
            System.out.println(ounces + " milliliters is " + milliliters + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double owens = meters/1.7272;
            System.out.println(meters + " meters is " + owens + " owen lengths");
        }
        if (selection == 8)
        {
            System.out.println("Enter Owens: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double owens = meters*1.7272;
            System.out.println(meters + " owens lengths is " + owens + " meters");
        }
        if (selection == 9)
        {
            System.out.println("Enter Denvers: ");
            double denvers = keyboard.nextDouble();
            keyboard.nextLine();
            double owens = denvers/0.93793103448;
            System.out.println(denvers + " Denver lengths is " + owens + " Owen Lengths");
        }
        if (selection == 10)
        {
            System.out.println("Enter Owens: ");
            double denvers = keyboard.nextDouble();
            keyboard.nextLine();
            double owens = denvers*0.93793103448;
            System.out.println(denvers + " Owen lengths is " + owens + " Denver Lengths");
        }
        //add more if statements here.
    }
}