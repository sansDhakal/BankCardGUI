
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067553 Sanskriti Dhakal)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //instance variable is defined
    private int PinNumber;
    private int withdrawalamount;
    private String dateofwithdrawal;
    private boolean haswithdrawn;
    //constructor
    //initialize the instance variable of DebitCard
    public DebitCard( int Cardid,String ClientName,double Balanceamount,String bankaccount,String issuerbank,int PinNumber)
    {
        //calling the superclass 
        super(Cardid,Balanceamount, bankaccount,issuerbank);
        // initializing attributes
        setClientName(ClientName);
        this.PinNumber = PinNumber; 
        this.haswithdrawn = false; 
    }
    
    //getter
    //providing accessor method for Pinnumber
    public int getPinNumber()
    {
        return this.PinNumber;
    }
    //providing accessor method for withdrawalamount
    public int getwithdrawalamount()
    {
        return this.withdrawalamount;
    }
    //providing accessor method for dateofwithdrawal
    public String getdateofwithdrawal()
    {
        return this.dateofwithdrawal;
    }
    //providing accessor method for haswithdrawn
    public boolean gethaswithdrawn()
    {
        return this.haswithdrawn;
    }
    //setter
    //setter updates the value 
    public void setwithdrawalamount(int withdrawalamount)
    {
        withdrawalamount = withdrawalamount;
    }
    //applying condition 
    public void withdraw(int withdrawalamount, String dateofwithdrawal, int PinNumber)
    {
        if(PinNumber != getPinNumber()){
            //display
            System.out.println("PIN Number isnot correct.");
        } else if (withdrawalamount > super.getBalanceamount()){
            //display
            System.out.println("You dont have sufficient balance.");
        } else {
            this.dateofwithdrawal = dateofwithdrawal;
            this.withdrawalamount = withdrawalamount;
            this.haswithdrawn = true;
            //calling superclass
            super.setBalanceamount(super.getBalanceamount() - withdrawalamount);
        }
    }
    //display
    //displaying with return type void and having no parameter
    public void display()
    {
        super.display();
        //applying condition
        if(haswithdrawn == true){
            // calling display method of BankCard
            
            // displaying data 
            System.out.println("PinNumber: "+PinNumber);
            System.out.println("withdrawalamount: "+withdrawalamount);
            System.out.println("dateofwithdrawal: "+dateofwithdrawal);
        } 
        else
        {
            System.out.println("Transaction has not been done");
        }
    }
}