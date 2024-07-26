
/**
 * Write a description of class BankCard here.
 *
 * @author (22067553 Sanskriti Dhakal)
 * @version (1.0.0)
 */
public class BankCard
{
     //instance variable is defined
    
    private int Cardid;
    private String ClientName ;
    private double Balanceamount;
    private String bankaccount;
    private String issuerbank;
    
    //constructor 
    //initialize the instance variable of BankCard Class
   
   public BankCard (int Cardid, double Balanceamount,String bankaccount,String issuerbank){
       this.Cardid = Cardid;
       this.ClientName = "";
       this.Balanceamount = Balanceamount;
       this.bankaccount = bankaccount;
       this.issuerbank = issuerbank;
   }
   
   
       //getter 
    //providing accessor method for cardid
   public int getCardid(){
     return this.Cardid;  
   }
   //providing accessor method for clientname
   public String getClientName(){
       return this.ClientName;
   }
   //providing accessor method for balanceamount
   public double getBalanceamount(){
       return this.Balanceamount;
       
   }
   //providing accessor method for bankaccount
   public String getbankaccount(){
       return this.bankaccount;
   }
   //providing accessor method for issuerbank
   public String getissueraccount(){
       return this.issuerbank; 
       
    } 
    //setter 
    //setter updates the value of balanceamount
   public void  setBalanceamount(double newbalanceamount){
        
    Balanceamount= newbalanceamount;
       
    
   }
   //setter updates the value of Clientname
   public void setClientName(String newclientName){
       if (newclientName ==""){
           System.out.print ("invalid clientname");
       }else {
           ClientName= newclientName;
       }
    }
    //display
    //display method with return type void and having no parameter 
   public void display()
    {
        System.out.println("Cardid is:"+this.Cardid);
        System.out.println("Balanceamount is:"+this.Balanceamount);
        System.out.println("Bankaccount is:"+this.bankaccount);
        System.out.println("Issuerbank is :"+this.issuerbank);
        if(ClientName != " "){
            System.out.println("ClientName: "+this.ClientName);
        }
        else{
                System.out.println("clientName is empty");
        }
    }
}
   

