public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id , String name , int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getId (){
        return id;
    }
    public String getName (){
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int credit(int amount){
        if(amount <0){
            System.out.println("enter a positive number please ");

        }else if(amount >balance){
            System.out.println("you dont have this amount of money in your account");
        }else balance = balance-amount;
        return balance;
    }

    public int debit(int amount){
        balance = balance +amount;

        return balance;
    }
    public int transferTo (Account another ,int amount){
        if(amount <0){
            System.out.println("enter a positive number please ");

        }else if(amount >balance){
            System.out.println("you dont have this amount of money in your account");
        }else {
            setBalance(getBalance() - amount);
            another.setBalance(amount + another.getBalance());
            System.out.println("you transfer "+amount+" to "+another.getName());
        }
        return balance;
    }

    public String toString(){
        return "your name: "+name+"\nyour id: "+id+"\nyour balance: "+balance+"\n";
    }
}
