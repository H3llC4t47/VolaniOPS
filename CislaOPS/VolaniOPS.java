import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class VolaniOPS {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String in;
        int sum = 0;
        int avg;

        ArrayList<String> StrList = new ArrayList<String>();
        ArrayList<Integer> IntList = new ArrayList<Integer>(StrList.size());

        do {
            System.out.println("Enter any number. When you type 'END' the program will be ended.");
            in = sc.nextLine();     
            StrList.add(in);

        } while (!in.equals("END"));

        StrList.remove("END");

        for(String myInt : StrList) {
            IntList.add(Integer.valueOf(myInt));
        }
        for(int i = 0; i < IntList.size(); i++){
            sum = sum + IntList.get(i);
        }

        avg = sum / IntList.size();

        System.out.println("Total sum of your numbers is: " + sum);
        System.out.println("The average of your numbers is: " + avg);

        System.out.println("Your biggest entered number is: " + Collections.max(IntList));
        System.out.println("Your smallest entered number is: " + Collections.min(IntList));

        
    }

}