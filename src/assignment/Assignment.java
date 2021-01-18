/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author NAVTTC07
 */
public class Assignment {

   
    public static void main(String[] args) {
        
        System.out.println("1.Addition\n 2.Subtraction \n 3.Multiplication \n 4.Division");
        Scanner user=new Scanner(System.in);
        System.out.println("Enter any choice ");
        int option=user.nextInt();
        int num1,num2,ans;
        double ans1,num3,num4;
        
       if(option==1)
       {
           System.out.println("Enter 1st number ");
           num1=user.nextInt();
           System.out.println("Enter 2nd number ");
           num2=user.nextInt();
           ans=num1+num2;
           System.out.println("Addition of "+num1+" and "+num2+" = "+ans);
       }
       else if(option==2){
           
           System.out.println("Enter 1st number ");
           num1=user.nextInt();
           System.out.println("Enter 2nd number ");
           num2=user.nextInt();
           ans=num1-num2;
           System.out.println("Subtraction of "+num1+" and "+num2+" = "+ans);
           
       }
         else if(option==3){
           
           System.out.println("Enter 1st number ");
           num1=user.nextInt();
           System.out.println("Enter 2nd number ");
           num2=user.nextInt();
           ans=num1*num2;
           System.out.println("Multilplication of "+num1+" and "+num2+" = "+ans);
           
       }
         else if(option==4){
           
           System.out.println("Enter 1st number ");
           num1=user.nextInt();
           System.out.println("Enter 2nd number ");
           num2=user.nextInt();
           
           if((num1%num2)==0){
               ans=num1/num2;
               System.out.println("Division of "+num1+" and "+num2+" = "+ans);
           }
           else{
               ans1=(double)num1/num2;
               System.out.println("Division of "+num1+" and "+num2+" = "+String.format("%.2f",ans1 ));
           }
           
           
           
           
       }
         else {
             System.out.println("Invalid option");
         }
       
       if(option >=1 && option <=4){
           
       }
       else
       {
           System.out.println("Invalid");
       }
      
    }
    
}
