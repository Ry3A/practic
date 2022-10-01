package lab5;
import java.util.Scanner;
public class Rec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = 0;
        for(int i = 0; i <= num; i++){
            for(int j = 0; j != i; j++){
                if(k == num) {
                    break;
                }
                System.out.println(i);
                k++;
            }
        }
        System.out.println("hi");
    }
}
