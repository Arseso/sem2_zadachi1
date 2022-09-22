import java.util.Scanner;

public class z4 {
    public static void main(String[] args){
        int[] a = input();
        if(a==null) return;
        System.out.println("Результат: "+ a[0]);
    }

    private static int[] input() {
        Scanner console = new Scanner(System.in);
        int[] sum = new int[1];
        int a = 0;
        while(true) {
            System.out.print("Введите число (для окончания ввода введите 0: ");
            if(!console.hasNextInt()){
                System.out.println("Указан неверный параметр.");
                return null;
            }
            if((a=console.nextInt())==0) break;
            if(a%2==0) sum[0]+=a*a;
        }
        return sum;
    }
}
