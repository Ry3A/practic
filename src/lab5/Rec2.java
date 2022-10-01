package lab5;

import java.util.Scanner;

public class Rec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nfirst = in.nextInt();
        int nsecond = in.nextInt();
        for(int i = nfirst; i <= nsecond; i++){
            System.out.println(i);
        }
    }
}
