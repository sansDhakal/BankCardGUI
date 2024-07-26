
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067553 Sanskriti Dhakal)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //instance variable is defined
    private int CVCnumber;
    private double creditlimit;
    private double interestrate;
    private String ExpirationDate;
    private int Graceperiod;
    private boolean isgranted;

    //constructor
    //creditcard's constructor accepts parameters
    public  CreditCard(int Cardid,String ClientName,String bankaccount,double Balanceamount,String issuerbank,int CVCnumber,double interestrate,String ExpirationDate){
        super(Cardid,Balanceamount,bankaccount,issuerbank);
        super.setClientName(ClientName);
        this.CVCnumber = CVCnumber;
        this.interestrate = interestrate;
        this.ExpirationDate = ExpirationDate;
        this.isgranted = false;
    }

    //getter
    //providing accessor method for CVCnumber
    public int getCVCnumber(){
        return this.CVCnumber;
    }
    //providing accessor method for creditlimit
    public double getcreditlimit(){
        return this.creditlimit;
    }
    //providing accessor method for interestrate
    public double getinterestrate(){
        return this.interestrate;
    }
    //providing accessor method for expirationdate
    public String getExpirationDate(){
        return this.ExpirationDate;
    }
    //providing accessor method for graceperiod
    public int getGraceperiod(){
        return this.Graceperiod;
    }
    //providing accessor method for isgranted
    public boolean getisgranted(){
        return this.isgranted;
    }

    //setter/mutator
    //setter updates the new value
    public void setcreditlimit(double creditlimit,int Graceperiod){
        if (creditlimit <= 2.5* super.getBalanceamount())
        {
            this.isgranted = true;
            this.creditlimit = creditlimit;
            this.Graceperiod = Graceperiod;

        }else {
            System.out.println("credit is not granted");
        }

    }
    //canceling the value of creditcard 
    public void cancelCreditCard()
    {
        CVCnumber = 0;
        creditlimit = 0;
        Graceperiod = 0;
        isgranted = false;

    }
    //display
    //displaying method with the return type void and having no parameter
    public void display()
    {
        super.display();
        System.out.println("ExpirationDate:"+ExpirationDate);
        System.out.println("interestrate:"+interestrate);

        System.out.println("CVCnumber:"+CVCnumber );

        System.out.println("creditlimit:"+creditlimit);
        System.out.println("Graceperiod:"+Graceperiod);

        

    }
}
 