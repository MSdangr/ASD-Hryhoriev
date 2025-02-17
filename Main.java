import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вкажіть номер лабораторної роботи: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Lab_1.main(args); 
                break;
            //case 2:
                //Lab_2.main(args);
                //break;
            default:
                System.out.println("Wrong number. Try again.");
                break;
        }

        scanner.close();
    }
}
