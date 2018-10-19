/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package income.tax;

import java.util.Scanner;

/**
 * Nicolas Lei
 * October 3, 2018
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        double salary,decimal = 0,incometax;
        
        System.out.println("Please put your salary?");
        salary = keyedInput.nextInt();
        
            if (salary <= 46605) {
                decimal = 0.15;
            }
            if (salary > 46605) {
                if (salary <= 93208) {
                decimal = 0.205;
                }
            }
        if (salary <= 144489) {
                decimal = 0.26;
            }
        if (salary <= 205842) {
            decimal = 0.29;
        }
        if (salary >= 205842) {
            decimal = 0.33;
        }
        incometax = salary * decimal; 
        
        System.out.println("Your income tax is " + incometax);
    }
}