import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
interface Bank{
    void CustomerCredentials();
}
class Billing implements Bank{
      @Override
      public void CustomerCredentials(){
    System.out.println("\n ``````````````````````````````Billing Payment Section``````````````````````````````````");
    Queue<String> customername = new LinkedList<>();
    //initialize the queue with values
    customername.add("Mukadus");
    customername.add("Abdulah");
    customername.add("Rabee");
    customername.add("Nofil");
    Random rd = new Random();
       for (String s : customername) 
       System.out.println("id no:"+rd.nextInt(0,30)+" bill number: "+rd.nextInt(0,1000)+" Bill Amount: "+ rd.nextInt(0,100000)+" your Bill has been payed! "+s);
          }}
class LoanTakers implements Bank{
    @Override
   
    public void CustomerCredentials() {
        System.out.println("\n ``````````````````````````````Notice To Loan Takers``````````````````````````````````");
       Stack<String> custname= new Stack<>();
       Random rd= new Random();
        custname.push("Mukadus");
        custname.push("Abdullah");
        custname.push("Rabee");
        custname.push("Malik");
        custname.push("Nofil");
        for (String s : custname) {
        System.out.println("Hey! " + s+" Your Loan Time Has Been Expired, For now "
        +"you've been Charged of: "+rd.nextInt(0,500));}
    }}
class NewAccounts implements Bank{
    @Override
    public void CustomerCredentials() {
         System.out.println("\n ``````````````````````````````Creating New Account Section``````````````````````````````````");
       ArrayList<String> name=new ArrayList<String>();
       ArrayList<String> fname=new ArrayList<String>();
       ArrayList<String> res=new ArrayList<String>();
       ArrayList<Integer> mem=new ArrayList<Integer>();
    Scanner ac=new Scanner(System.in);
    System.out.println("Enter Your Full-Name: ");
    name.add(ac.next());
    System.out.println("Enter Your Father-Name: ");
    fname.add(ac.next());
    System.out.println("Enter Your Residence: ");
    res.add(ac.next());
    System.out.println("Enter Your Family Members: ");
    mem.add(ac.nextInt());
    System.out.println("Dear Customer Your details have been stored you'll soon recieve a confirmation email!");
    final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
    System.out.println("your username is: "+name+" your password is: "+sb);
    System.out.println("Please Keep this Confidential!");} }
public class ADT {
    public static void main(String[] args){
        Billing obj1=new Billing();
        obj1.CustomerCredentials();
        NewAccounts obj2=new NewAccounts();
        obj2.CustomerCredentials();
        LoanTakers obj3 = new LoanTakers();
        obj3.CustomerCredentials();
    }
}
