/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class kelasinput {
    public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    System.out.print("masuikan nama:");
    person p = new person();
    p.setName(sc.nextLine());
    System.out.print("nama anda adalah = "+p.getName());
    }
}
