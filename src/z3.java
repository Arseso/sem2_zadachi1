import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class z3 {

    public static void main(String[] args){

        int[] obj = input();
        if(obj[0]==1) return;


        ArrayList arr = gen_random(obj[1],obj[2]);

        printResult(arr);

    }

    private static void printResult(ArrayList<Integer> arr) {
        System.out.println("Полученные числа:");
        for(int i = 0; i<3; i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Максимальное: "+ Collections.max(arr));
        System.out.println("Минимальное: "+ Collections.min(arr));
    }

    private static int[] input() {
        Scanner console = new Scanner(System.in);
        int a=0;
        int b=0;
        int err = 0;
        System.out.print("Введите параметр a: ");
        if(!console.hasNextInt()){
            System.out.println("Указан неверный параметр.");
            err = 1;
            return new int[]{err, a,b};
        }
        a = console.nextInt();
        System.out.print("Введите параметр b: ");
        if(!console.hasNextInt()){
            System.out.println("Указан неверный параметр.");
            err = 1;
            return new int[]{err, a,b};
        }
        b = console.nextInt();

        if(b<a){
            System.out.println("Диапозон указан неверно.");
            err = 1;
            return new int[]{err, a,b};
        }
        return new int[]{err, a,b};
    }

    private static ArrayList<Integer> gen_random(int a, int b){
      ArrayList arr = new ArrayList<Integer>();
      Random r = new Random();
      for(int i = 0; i<3; i++){
          arr.add(r.nextInt(b-a)+a);
      }
      return arr;
    }

}
