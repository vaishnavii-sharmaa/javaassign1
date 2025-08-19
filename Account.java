public class Account {
    String accountholder;
    int balance;
    public Account(){

    }
    public Account(String accountholder,int balance){
        this.accountholder=accountholder;
        this.balance=balance;

    }
    public static void main(String args[]){
        Account holder1=new Account();
        Account holder2=new Account();
        System.out.println(holder1.accountholder +holder1.balance);
        System.out.println(holder1.accountholder +holder2.balance);

        //  Account holder1=new Account("naman ",8999);
        //  Account holder2=new Account("kunal ",9099);
        //  System.out.println(holder1.accountholder +holder1.balance);
        //  System.out.println(holder1.accountholder +holder2.balance);
    }

    
}
