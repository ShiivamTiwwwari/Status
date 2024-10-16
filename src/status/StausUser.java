/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */






/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class StausUser {

    /**
     * @param args the command line arguments
     */
   public void statusDetails(StatusCode code){
   if(code==null)
       System.out.println("NOT VALID CODE");
       return;
   }
   switch(code){
       case ZERO:
           System.out.println("REJECTED");
           break;
       case ONE:
           System.out.println("PENDING");
           break;
        case TWO:
           System.out.println("PROCESSING");
           break;
        case THREE:
           System.out.println("APPROVED");
           break;
   }
           
           }
}
