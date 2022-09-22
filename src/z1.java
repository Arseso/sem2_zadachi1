import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {

        int a=input();
        if(a == 0) return;
        printresult(a);

    }

    private static void printresult(int a) {
        System.out.println("Полученные числа:");
        for (int i = 100; i < 1000; i++) {
            int sum = (i % 10) + ((i / 10) % 10) + ((i / 100) % 10);
            if (a == sum) {
                System.out.println(""+i);
            }
        }
    }

    private static int input() {
        int a = 0;
        System.out.print("Введите сумму цифр трёхзначного числа: ");
        Scanner console = new Scanner(System.in);
        if(!console.hasNextInt() || (a=console.nextInt())<0 || a>=28){
            System.out.println("Указан неверный параметр.");
            return 0;
        }
        return a;
    }

}
