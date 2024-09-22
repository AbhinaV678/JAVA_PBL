package PBL;
import java.util.*;
//import java.lang.*;

public class CustomerRegistration {
    public static void main(String[] args) {

        ArrayList<Object> arr = new ArrayList<Object>();

        try {
        System.out.print("Enter the 7 digit customer ID: ");
        Scanner sc = new Scanner(System.in);

        int custID = sc.nextInt();
        int end = 9999999;
        int start = 1000000;

        if(String.valueOf(custID).length()!=7){         
            Random random = new Random();
            custID = random.nextInt((end - start) + 1) + start;
            System.out.println("New id generated due to inconsistent entry.");
        }
        //for consuming the left in buffer
        sc.nextLine();
        
        System.out.print("Enter the customer name: ");
        String name = sc.nextLine();
        while(name.length()>50 || name.length()<1){
            System.out.print("Re-enter the name: ");
            name=sc.nextLine();
        }

        System.out.print("Enter the customer email: ");
        String email = sc.nextLine();
        while(email.length()<1){
            System.out.print("Re-enter the email: ");
            email=sc.nextLine();
        }

        System.out.print("Enter the password: ");
        String password = sc.nextLine();
        while(password.length()<1 || password.length()>30){
            System.out.print("Re-enter the password: ");
            password=sc.nextLine();
        }

        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        while(address.length()<1 || address.length()>100){
            System.out.print("Re-enter the address: ");
            address=sc.nextLine();
        }

        System.out.print("Enter the contact number: ");
        String contactNum = sc.nextLine();

        while(!isNumber(contactNum) || contactNum.length()!=10 ){
            System.out.print("Re-enter the contact number: ");
            contactNum=sc.nextLine();
        }
        
        
        arr.add(custID);
        arr.add(name);
        arr.add(email);
        arr.add(password);
        arr.add(address);
        arr.add(contactNum);

        System.out.println("Entered customer details are as Follows:");
        for (Object x : arr) {
            System.out.println(x);
        }
        System.out.println("Customer registration is successful.");
        
        sc.close();

        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Check your inputs and restart.");
        }
        
    }

    static boolean isNumber(String x){
        try{
            Long.parseLong(x);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Enter a number!");
            return false;
        }
        
    }
}
