/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;


public class Status {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (ZERO, ONE, TWO, THREE):");

        // Read the user input as an enum
        StatusCode code = StatusCode.fromInput(in.next().toUpperCase());
        
        StausUser userStatus = new StausUser();
        userStatus.statusDetail(code);
    }
}
