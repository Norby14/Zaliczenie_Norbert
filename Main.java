import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int rok;
        System.out.println("podaj rok do sprawdzenia");
        Scanner in = new Scanner(System.in);
        rok = Integer.parseInt(in.nextLine());
        if((rok%4==0 && rok%100!=0) || rok%400==0) {
            System.out.println(rok+" jest przestępny");


        }
        else
        {
            System.out.println(rok+" rok nie jest przestepny");
        }
    }
}