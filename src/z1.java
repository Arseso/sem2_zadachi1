import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        System.out.print("Введите сумму цифр трёхзначного числа: ");
        Scanner console = new Scanner(System.in);
        int a=0;
        if(!console.hasNextInt() || (a=console.nextInt())<0 || a>=28){
            System.out.println("Указан неверный параметр.");
            return;
        }
        System.out.println("Полученные числа:");
        for (int i = 100; i < 1000; i++) {
            int sum = (i % 10) + ((i / 10) % 10) + ((i / 100) % 10);
            if (a == sum) {
                System.out.println(""+i);
            }
        }
    }
}
