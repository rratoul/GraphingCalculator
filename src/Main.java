import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the rizz store:");
        System.out.println("rizz: $40");
        System.out.println("what would you like to buy");
        String order = sc.nextLine();
        if (order.toLowerCase() == "rizz") {
            System.out.println("your total is $40");
            
        } else {
            System.out.println("that aint on the menu fn");
        }
    }
}