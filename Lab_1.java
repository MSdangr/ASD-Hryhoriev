import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер завдання:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            default:
                System.out.println("Невірний вибір");
        }

        scanner.close();
    }

    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть швидкість першого автомобіля (V1) км/год: ");
        double V1 = scanner.nextDouble();
        System.out.print("Введіть швидкість другого автомобіля (V2) км/год: ");
        double V2 = scanner.nextDouble();
        System.out.print("Введіть час (T) в годинах: ");
        double T = scanner.nextDouble();
        double S = (V1 + V2) * T;
        System.out.println("Відстань між автомобілями через " + T + " годин: " + S + " км");
        scanner.close();
    }

    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        double y = Math.pow(x, 3) - 2 * x + 5;
        System.out.println("Значення y: " + y);
        scanner.close();
    }

    public static void task3(){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть координати першого поля (наприклад, A1): ");
        String field1 = scanner.nextLine().toUpperCase();
        System.out.print("Введіть координати другого поля (наприклад, D4): ");
        String field2 = scanner.nextLine().toUpperCase();


        if (field1.length() != 2 || field2.length() != 2) {
            System.out.println("Некоректний формат координат.");
            return;
        }


        int x1 = field1.charAt(0) - 'A';
        int y1 = field1.charAt(1) - '1';
        int x2 = field2.charAt(0) - 'A';
        int y2 = field2.charAt(1) - '1';


        boolean canMove = (Math.abs(x1 - x2) == Math.abs(y1 - y2));


        System.out.println(canMove ? "True" : "False");
    }
}
