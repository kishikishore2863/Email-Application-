package emailapp;


import java.util.Scanner;

public class Email { private String firstName;private String lastName;
   private String password;
   private String department;
   private int mailboxCapacity =500;
   private String alternateEmail;
   private int  defaultPassword =8;
   private String email;
   private String companySuffix= "anyCompany.com";

   public Email(String firstName,String lastName){
       this.firstName = firstName;
       this.lastName =lastName;

       System.out.println("Email Created: "+this.firstName+" "+this.lastName);

       this.department = setDepartment();
       System.out.println("Department: "+ this.department);

       this.password =randomPassword(this.defaultPassword);
       System.out.println("your password is: " +this.password);

       this.email = firstName.toLowerCase() +""+ lastName.toLowerCase() + "@" +department+"."+companySuffix;
       System.out.println("your email is: "+this.email);
   }

   private String setDepartment() {
       System.out.println("Department Codes \n1 for sales \n2 for Development \n0 for none \nenter the code: ");
       Scanner in = new Scanner(System.in);
       int depChoice = in.nextInt();
       if (depChoice == 1) {return "sales";}
       else if (depChoice == 2) {return "dev";}
       else if (depChoice == 3) {return "act";}
       else {return "";}

   }
   private String randomPassword(int length){
       String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@$%";
       char[] password =new char[length];
       for(int i =0;i<length;i++){
           int rand = (int)(Math.random()*passwordSet.length());
           password[i]=passwordSet.charAt(rand);
       }
       return new String(password);

   }

   public void setMailboxCapacity(int capacity){
       this.mailboxCapacity =capacity;
   }

   public void setAlternateEmail(String altEmail){
      this.alternateEmail =altEmail ;
   }

   public void changepassword(String password){
       this.password =password;
   }

   public int getMailboxCapacity() {return mailboxCapacity;}
   public String getAlternateEmail(){return alternateEmail;}
   public String getPassword(){return password;}
}
