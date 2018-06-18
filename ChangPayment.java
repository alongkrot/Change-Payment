
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author POND
 */
public class ChangPayment {
    int money;
    while(true) {
        try{
            Scanner in = new Scanner(System.in); 
            System.out.println("Money to Chang :");
            money = in.nextInt();
            if (money >= 0) {
                break;    
            }
        }catch(Exception e){}
    }
    int[] pay = new int[7];
    int[] numpay = new int [] {500,100,50,20,10,5,1};
    for (int i =0; i < pay.length; i++){
    pay[] = money/numpay[i];
    money = money % numpay[i];
}
    System.out.println("500 : " + pay[0]); 
    System.out.println("100 : " + pay[1]);
    System.out.println("50 : " + pay[2]);
    System.out.println("20 : " + pay[3]);
    System.out.println("10 : " + pay[4]);
    System.out.println("5 : " + pay[5]);
    System.out.println("1 : " + pay[6]);
    
}

