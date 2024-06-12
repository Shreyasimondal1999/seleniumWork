package basicsOfJava;

class BankAccount{
public String accNO;
public String name;
public String address;
public String phoneno;
public String dob;
public long balance;
public BankAccount(){}
public BankAccount(String AccNo,String name, String Address,String DOB){
	
accNO=AccNo;
this.name = name;
address= Address;
dob= DOB;
}
public void setPhoneNO(String phoneNo){
phoneno = phoneNo;
}
public String getAccno(){
return accNO;
}
public String getName(){
return name;
}
 
public String getAddress(){
return address;
}
 
public String getPhoneno(){
return phoneno;
}
public String getDOB(){
return dob;
}
 
}
 
class Savingsaccount extends BankAccount{
    public Savingsaccount(String AccNo,String name, String Address,String DOB){
    
//    super.accNO=AccNo;
//    super.name = name;
//    super.address= Address;
//    super.dob= DOB;
    	super(AccNo,name,Address,DOB);
}

    public void depositBalance(long Balance){
    super.balance = Balance;
    }
    public void withdrawBalance(long Balance ){
    super.balance = balance - Balance;
    }
    @Override
     public String toString(){
return "\nAccount no : " + accNO + "\n Name : " + name + "\nAddress" + address + "\nPhone no " + phoneno + "\nDate of birth : "+ dob +"\nbalance: " +balance;
}
}



public class inheritancebankaccount {
    public static void main(String[] args) {
        // TODO code application logic here
        Savingsaccount Cus1 = new Savingsaccount("123456789","shreyash","Raghunathganj","12-26-1999");
        Savingsaccount cus2=  new Savingsaccount("1234567890","shreyash","Raghunathganj","12-26-1999");
        Cus1.setPhoneNO("9734650389");
        Cus1.depositBalance(183264387);
        System.out.println(cus2);
        
    }
}
