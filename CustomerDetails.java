package PBL;

import java.util.*;

public class CustomerDetails {
    public static void main(String[] args) {
        HashMap<Integer,String> CustSSN = new HashMap<>();
    
        try {
        System.out.print("Enter the 7 digit Customer SSN no : ");
        Scanner sc = new Scanner(System.in);
        int SSN = sc.nextInt();
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

        System.out.print("Enter the aadhar number: ");
        String aadhar = sc.nextLine();
         while(aadhar.length()<1 || aadhar.length()>12){
            System.out.print("Re-enter the aadhar no: ");
            aadhar=sc.nextLine();
        }

        System.out.print("Enter the PAN number: ");
        String PAN = sc.nextLine();
        while(PAN.length()<1 || PAN.length()>10){
                System.out.print("Re-enter the PAN no: ");
                PAN=sc.nextLine();
            }

        System.out.print("Enter the Account number: ");
        String accountNo = sc.nextLine();
         while(accountNo.length()<1 || accountNo.length()>20){
            System.out.print("Re-enter the account no: ");
            accountNo=sc.nextLine();
        }

        String CustomerDetails= "{ "+SSN+","+name+","+email+","+address+","+contactNum+","+aadhar+","+PAN+","+accountNo+" }";
        
        CustSSN.put(SSN, CustomerDetails);

        System.out.println("Customer details entered successfully.");

        //Viewing the details using SSN id
        if(CustSSN.containsKey(SSN)){
            String x = CustSSN.get(SSN);
            System.out.println("The customer details are as follows: "+x);
        }
        //Updating the customer details using SSN
        if(CustSSN.containsKey(SSN)){
            String x = CustSSN.get(SSN);
            System.out.println("Before updation: "+x);
            System.out.println("Enter the new values for Customer Details: ");
            String newDetails = sc.nextLine();
            CustSSN.replace(SSN, newDetails);
            System.out.println("Update successful. Revised Details are as follows:");
            System.out.println(CustSSN.get(SSN));
        }
        //deleting the customer details using SSN
        System.out.println("Before deletion:");
        System.out.println(CustSSN.get(SSN));
        CustSSN.remove(SSN);
        System.out.println("Deletion Successful.");

        //Searching the deleted SSN
        if(!CustSSN.containsKey(SSN)){
            System.out.println("Customer data not available or deleted.");
        }
        sc.close();

        } catch (Exception e) {
            System.err.println(e);
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
