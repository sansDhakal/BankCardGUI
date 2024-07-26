/**
 * Write a description of class CreditGUI here.
 *
 * @author (22067553 Sanskriti Dhakal)
 * @version (a version number or a date)
 **/

/**
1. Create a class that implements the ListenerInterface
- by implementing the ListnerInterface in the inner class
- use the interface ActionListener (to listen to click events) in the inner class
- implement abstract method actionPerformed(ActionEvent e) of the ActionListener interface in the innerclass

2. Add or register the listener to the source
- create an instance (obj) of the inner class
- pass the object in the addActionListener() method

3. Implement the ActionListener interface method to receive and process the event
 **/
/**
 * ========EXCEPTION HANDLING======
 * STEP1: : TRY to see if there is an exception
 * step 2: if there is an exception THROW the exception
 * step 3: CATCH the exception to handel the exception
 * =========EXCEPTION HANDLING========
 */

// Step 0: Import
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;

public   class BankGUI implements ActionListener{
    private JFrame myFrame;
    //declaration of CreditCard and  DebitCard

    //buttons
    private JButton setButton ,cancelButton,ClearButton,creditlimitdisplayButton,
    ClearallButton,creditaddButton,addBankButton,AddDebButton,withButton,withdisButton;

    //labels
    private JLabel BankCardLabel,CardidLabel,ClientNameLabel,IssuerBankLabel,BankAccountLabel,BalanceamtLabel,CVCLabel,
    InterestLabel,expLabel,CreditCardLabel,CreditLiLabel,CreditlimitLabel,GraceLabel,
    PinLabel,withdrawanLabel,DebitCardLabel,withdrawLabel,dateofwithdrawLabel;

    //TextField
    private JTextField CardidText,ClientNameText,IssuerBankText,BankAccountText,BalanceamtText,CreditlimitText,GraceText,CVCnumberText,
    InterestText,ExpirationText,PinText,withdrawanText;

    //JCombo
    private JComboBox expirationdayCombo,expirationmonthCombo,expirationyrCombo,withdrawdayCombo,withdrawmonthCombo,withdrawyrCombo;

    //Arraylist
    private ArrayList<BankCard>cards=new ArrayList<BankCard>();

    public BankGUI(){
        //JFrame for BankGUI

        JFrame myFrame = new JFrame();

        //creating GUI for BankCard

        BankCardLabel = new JLabel ("NABIL BANK");
        BankCardLabel.setBounds(700,0,233,66);
        myFrame.add(BankCardLabel);

        //creating card id 
        CardidLabel = new JLabel("Card id:");
        CardidLabel.setBounds(535,175,50,43);
        myFrame.add(CardidLabel);

        CardidText=new JTextField();
        CardidText.setBounds(600,178,129,32);
        myFrame.add(CardidText);

        //creating clientname
        ClientNameLabel = new JLabel("Client  Name:");
        ClientNameLabel.setBounds(500,136,100,43);
        myFrame.add(ClientNameLabel);

        ClientNameText=new JTextField();
        ClientNameText.setBounds(600,139,129,32);
        myFrame.add(ClientNameText);

        //creating issuerbank 
        IssuerBankLabel = new JLabel("Issuer Bank:");
        IssuerBankLabel.setBounds(765,175,100,43);
        myFrame.add(IssuerBankLabel);

        IssuerBankText=new JTextField();
        IssuerBankText.setBounds(865,178,129,32);
        myFrame.add(IssuerBankText);

        //creating bank account
        BankAccountLabel = new JLabel("Bank Account:");
        BankAccountLabel.setBounds(500,214,100,43);
        myFrame.add(BankAccountLabel);

        BankAccountText=new JTextField();
        BankAccountText.setBounds(600,217,129,32);
        myFrame.add(BankAccountText);

        //creating balanceamount
        BalanceamtLabel = new JLabel("Balanace Amount:");
        BalanceamtLabel.setBounds(742,214,120,43);
        myFrame.add(BalanceamtLabel);

        BalanceamtText=new JTextField();
        BalanceamtText.setBounds(865,217,129,32);
        myFrame.add(BalanceamtText);

        //creating GUI for Credit Card
        //CreditCard details
        CreditCardLabel = new JLabel ("CREDIT CARD  Details");
        CreditCardLabel.setBounds(350,300,233,66);
        myFrame.add(CreditCardLabel);

        //Creditlimit
        CreditLiLabel = new JLabel ("CREDIT LIMIT");
        CreditLiLabel.setBounds(400,460,233,66);
        myFrame.add(CreditLiLabel);

        //cvcNumber
        CVCLabel = new JLabel("CVC Number:");
        CVCLabel.setBounds(120,370,100,43);
        myFrame.add(CVCLabel);

        CVCnumberText=new JTextField();
        CVCnumberText.setBounds(220,373,129,32);
        myFrame.add(CVCnumberText);

        //interest rate
        InterestLabel = new JLabel("Interest Rate:");
        InterestLabel.setBounds(120,409,100,43);
        myFrame.add(InterestLabel);

        InterestText=new JTextField();
        InterestText.setBounds(220,411,129,32);
        myFrame.add(InterestText);

        //creating expiration date 
        expLabel = new JLabel("Expiration Date:");
        expLabel.setBounds(400,370,120,43);
        myFrame.add(expLabel);

        expirationdayCombo = new JComboBox();
        for(int expday=1; expday<=31; expday++){
            expirationdayCombo.addItem(expday);

        }
        //month
        expirationmonthCombo = new JComboBox();
        for (int expmonth=1; expmonth<=12; expmonth++){
            expirationmonthCombo.addItem(expmonth);
        }

        //year
        expirationyrCombo = new JComboBox();
        for(int expyear=2000; expyear<=2023; expyear++){
            expirationyrCombo.addItem(expyear);
        }
        //seting bounds and adding to myframe

        expirationdayCombo.setBounds(530,373,50,32);
        myFrame.add(expirationdayCombo);
        expirationdayCombo.setEditable(true);

        expirationmonthCombo.setBounds(580,373,60,32);
        myFrame.add(expirationmonthCombo);
        expirationmonthCombo.setEditable(true);

        expirationyrCombo.setBounds(650,373,60,32);
        myFrame.add(expirationyrCombo);
        expirationyrCombo.setEditable(true);

        //credit card add button
        creditaddButton = new JButton("ADD CREDIT");
        creditaddButton.setBounds(480,430,100,35);
        myFrame.add(creditaddButton);

        //creating creditlimit
        CreditlimitLabel = new JLabel("Credit Limit:");
        CreditlimitLabel.setBounds(120,500,100,43);
        myFrame.add(CreditlimitLabel);

        CreditlimitText=new JTextField();
        CreditlimitText.setBounds(220,503,129,32);
        myFrame.add(CreditlimitText);

        //Graceperiod
        GraceLabel = new JLabel("Grace Period:");
        GraceLabel.setBounds(120,550,100,43);
        myFrame.add(GraceLabel);

        GraceText=new JTextField();
        GraceText.setBounds(220,553,129,32);
        myFrame.add(GraceText);

        //Setcreditlimit button
        setButton = new JButton("SET CREDIT LIMIT");
        setButton.setBounds(300,600,150,40);
        myFrame.add(setButton);

        //cancel button
        cancelButton = new JButton("CANCEL CREDIT");
        cancelButton.setBounds(500,600,120,40);
        myFrame.add(cancelButton);

        //display 
        creditlimitdisplayButton = new JButton("DISPLAY");
        creditlimitdisplayButton.setBounds(400,650,100,40);
        myFrame.add(creditlimitdisplayButton);

        //creating clear all button to clear all the text field
        ClearallButton = new JButton("CLEAR ALL");
        ClearallButton.setBounds(650,750,150,40);
        myFrame.add(ClearallButton);

        //creating DebitCard GUI
        DebitCardLabel = new JLabel ("DEBIT CARD  Details");
        DebitCardLabel.setBounds(1000,300,233,66);
        myFrame.add(DebitCardLabel);

        //pin number
        PinLabel=new JLabel ("Pin number: ");
        PinLabel.setBounds(950,370,100,43);
        myFrame.add(PinLabel);

        PinText=new JTextField();
        PinText.setBounds(1050,373,129,32);
        myFrame.add(PinText);

        //add debit button

        AddDebButton = new JButton("ADD DEBIT");
        AddDebButton.setBounds(1180,410,110,35);
        myFrame.add(AddDebButton);

        //withdrawal

        withdrawLabel = new JLabel ("WITHDRAWAL  Details");
        withdrawLabel.setBounds(1000,450,233,66);
        myFrame.add(withdrawLabel);

        withdrawanLabel = new JLabel ("Withdrawal amount:");
        withdrawanLabel.setBounds(950,510,130,43);
        myFrame.add(withdrawanLabel);

        withdrawanText=new JTextField();
        withdrawanText.setBounds(1090,513,129,32);
        myFrame.add(withdrawanText);
        AddDebButton.setBackground(new Color(146,211,110));

        //creating date of withdrawan
        dateofwithdrawLabel=new JLabel("Date of Withdrawan:");
        //day
        withdrawdayCombo = new JComboBox();
        for(int day=1; day<=31; day++){
            withdrawdayCombo.addItem(day);

        }
        //month
        withdrawmonthCombo = new JComboBox();
        for (int month=1; month<=12; month++){
            withdrawmonthCombo.addItem(month);
        }

        //year
        withdrawyrCombo = new JComboBox();
        for(int year=2000; year<=2023; year++){
            withdrawyrCombo.addItem(year);
        }
        //seting bounds and adding to myframe
        dateofwithdrawLabel.setBounds(950,550,130,43);
        myFrame.add(dateofwithdrawLabel);

        withdrawdayCombo.setBounds(1100,553,50,32);
        myFrame.add(withdrawdayCombo);
        withdrawdayCombo.setEditable(true);

        withdrawmonthCombo.setBounds(1150,553,60,32);
        myFrame.add(withdrawmonthCombo);
        withdrawmonthCombo.setEditable(true);

        withdrawyrCombo.setBounds(1230,553,60,32);
        myFrame.add(withdrawyrCombo);
        withdrawyrCombo.setEditable(true);

        //withdraw button

        withButton = new JButton("Withdraw");
        withButton.setBounds(1160,600,100,40);
        myFrame.add(withButton);

        //withdraw display

        withdisButton = new JButton("DISPLAY");
        withdisButton.setBounds(1300,600,100,40);
        myFrame.add(withdisButton);

        //creating jpanel
        JPanel  myPanel = new JPanel();
        myPanel.setBackground(new Color(190,177,177));
        myPanel.setBounds(0,0,1500,1080);
        myFrame.add(myPanel);

        //adding in actionlistener
        creditaddButton.addActionListener(this);
        ClearallButton.addActionListener(this);
        AddDebButton.addActionListener(this);
        setButton.addActionListener(this);
        withButton.addActionListener(this);
        cancelButton.addActionListener(this);
        creditlimitdisplayButton.addActionListener(this);
        withdisButton.addActionListener(this);

        myFrame.setSize(1500, 1080);
        myFrame.setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    } 

    //actionperformed
    public void actionPerformed(ActionEvent e){

        //ADDDEBIT
        if (e.getSource() == AddDebButton){
            if (CardidText.getText().isEmpty()||
            ClientNameText.getText().isEmpty()||
            IssuerBankText.getText().isEmpty()||
            BankAccountText.getText().isEmpty()||
            BalanceamtText.getText().isEmpty()||
            PinText.getText().isEmpty()){

                JOptionPane. showMessageDialog(myFrame,"Empty spot detected ");
            }
            else{   

                try{

                    //get the parameters from the textfield

                    int Cardid = Integer.parseInt(CardidText.getText());
                    String ClientName = ClientNameText.getText();
                    String issuerbank = IssuerBankText.getText();
                    String bankaccount = BankAccountText.getText();
                    int  Balanceamount= Integer.parseInt(BalanceamtText.getText());
                    int PinNumber=Integer.parseInt(PinText.getText());

                    boolean isadded = false;

                    for (BankCard debcard:cards){
                        if( debcard instanceof DebitCard){
                            //downcasting
                            DebitCard debobject = (DebitCard) debcard;
                            if (debobject.getCardid ()==Cardid){
                                isadded = true;
                                JOptionPane. showMessageDialog(myFrame,"Card id is already exist you cannot login .");

                            }
                        }
                    }

                    if (isadded ==false){
                        DebitCard ISADDED=new DebitCard(Cardid, ClientName, Balanceamount,bankaccount,issuerbank,PinNumber);

                        cards.add(ISADDED);
                        //show message 
                        JOptionPane. showMessageDialog(myFrame,"Card is added successfully");
                    }

                    //catching exception

                }catch(NumberFormatException ex) {
                    //show message
                    JOptionPane. showMessageDialog(myFrame, "Please Enter Valid Data") ;

                }
            }

        }

        //DISPLAYdebitcard
        if (e.getSource() == withdisButton){
            //checking arraylist is empty or not
            if(cards.isEmpty()){
                JOptionPane. showMessageDialog(null, " Array list is empty") ;
            }
            else{

                for (BankCard with:cards){
                    if( (with instanceof DebitCard)){
                        DebitCard withobject = (DebitCard) with;
                        //calling display method
                        withobject.display();

                    }
                }
                JOptionPane. showMessageDialog(null, " DISPLAY") ;  
            }
        }

        //ADDCREDIT
        if (e.getSource() == creditaddButton){
            //checking cards(array list) is  empty
            if  (CardidText.getText().isEmpty()||
            ClientNameText.getText().isEmpty()||
            IssuerBankText.getText().isEmpty()||
            BankAccountText.getText().isEmpty()||
            BalanceamtText.getText().isEmpty()||
            CVCnumberText.getText().isEmpty()||
            InterestText.getText().isEmpty()
            ){
                //show message

                JOptionPane. showMessageDialog(myFrame,"Empty spot detected ");
            }
            else{   

                try{

                    //get the parameters from the textfield
                    int Cardid = Integer.parseInt(CardidText.getText());
                    String ClientName = ClientNameText.getText();
                    String issuerbank = IssuerBankText.getText();
                    String bankaccount = BankAccountText.getText();
                    int  Balanceamount= Integer.parseInt(BalanceamtText.getText());
                    int CVCnumber = Integer.parseInt(CVCnumberText.getText());
                    int interestrate=Integer.parseInt(InterestText.getText());
                    String day = expirationdayCombo.getSelectedItem().toString();
                    String month = expirationmonthCombo.getSelectedItem().toString();
                    String year = expirationyrCombo.getSelectedItem().toString();
                    String ExpirationDate = day+ month+ year;

                    boolean isadded = false;
                    for (BankCard credcard:cards){
                        if(credcard instanceof CreditCard){
                            //downcasting
                            CreditCard credobject = (CreditCard) credcard;
                            if (credobject.getCardid ()==Cardid){

                                isadded = true;
                                //show message
                                JOptionPane. showMessageDialog(myFrame,"Card id is already exist you cannot login .");

                            }
                        }
                    }

                    if (isadded ==false){
                        CreditCard ISADDED=new CreditCard(Cardid, ClientName ,bankaccount, Balanceamount, issuerbank,CVCnumber,
                                interestrate,ExpirationDate);
                        cards.add(ISADDED);
                        JOptionPane. showMessageDialog(myFrame,"Card is added successfully");
                    }
                    //catch

                }catch(NumberFormatException ex) {
                    JOptionPane. showMessageDialog(myFrame, "Please Enter Valid Data") ;

                }
            }
        }

        //setcreditlimitbutton
        if (e.getSource() == setButton){
            try{

                //get the parameters from the textfield
                int Cardid = Integer.parseInt(CardidText.getText());
                int creditlimit =Integer.parseInt(CreditlimitText.getText());
                int Graceperiod=Integer.parseInt(GraceText.getText());

                boolean isadded = false;
                for (BankCard creditlim:cards){
                    if(!( creditlim instanceof CreditCard)){
                        continue;
                    }
                    //checking cardlid is same or not
                    if(((CreditCard)creditlim).getCardid ()== Cardid){
                        isadded=true;
                        if(creditlimit<= 2.5* ((CreditCard)creditlim).getBalanceamount()){

                            ((CreditCard)creditlim).setcreditlimit(creditlimit,Graceperiod);
                            JOptionPane. showMessageDialog(null,"CREDIT LIMIT Has been set successfully");
                        }
                        else{
                            JOptionPane. showMessageDialog(null,"CREDIT LIMIT Must be less than 2.5 times the balance amount.");
                        }
                    }
                }
                //checking if arraylist is empty

                if(cards.isEmpty()){
                    JOptionPane. showMessageDialog(null, " ArrayList is empty") ;
                }

                if (!isadded){
                    JOptionPane. showMessageDialog(null, "Cardid not found") ;
                }
                //catch 

            }catch(NumberFormatException ex) {
                JOptionPane. showMessageDialog(null, "Please Enter Valid Data") ;

            } 
        }

        //displaysetcreditlimit
        if (e.getSource() == creditlimitdisplayButton){
            if(cards.isEmpty()){
                JOptionPane. showMessageDialog(null, " ArrayList is Empty") ;
            }
            else{

                for (BankCard credlim:cards){

                    if( (credlim instanceof CreditCard)){
                        CreditCard creditobject = (CreditCard) credlim;
                        //calling display method
                        creditobject.display();

                    }
                }
            }
            //show message
            JOptionPane. showMessageDialog(null, " DISPLAY") ;  
        }

        //CancelCREDITLIMITBUTTON
        if(e.getSource()==cancelButton){
            try{
                boolean isadded = false;
                int Cardid=Integer.parseInt(CardidText.getText());
                for (BankCard obj :cards){
                    if (obj instanceof CreditCard){
                        //downcasting
                        CreditCard cObj = (CreditCard)obj;
                        if (cObj.getCardid()==Cardid){
                            isadded=true;
                            cObj.cancelCreditCard();
                            JOptionPane. showMessageDialog(null, "Credit is Cancelled") ;
                        }

                    }

                }
                if(!isadded){
                    //show message
                    JOptionPane. showMessageDialog(null, "Card id not found") ;
                }

            }catch(NumberFormatException ex) {
                //show message
                JOptionPane. showMessageDialog(null, "Please Enter Valid Data") ;

            }
        }

        //WITHDRAWbutton
        if (e.getSource() == withButton){
            try{

                //get the parameters from the textfield
                int Cardid = Integer.parseInt(CardidText.getText());
                int withdrawalamount=Integer.parseInt(withdrawanText.getText());
                int PinNumber=Integer.parseInt(PinText.getText());

                String day = withdrawdayCombo.getSelectedItem().toString();
                String month = withdrawmonthCombo.getSelectedItem().toString();
                String year = withdrawyrCombo.getSelectedItem().toString();
                String dateofwithdrawal = day +"/ "+month+"/"+year;

                boolean isadded = false;

                for (BankCard with:cards){
                    if(!( with instanceof DebitCard)){
                        continue;
                    }
                    if(((DebitCard)with).getCardid ()== Cardid){
                        isadded=true;
                        ((DebitCard)with).withdraw( withdrawalamount,dateofwithdrawal,PinNumber);
                        JOptionPane. showMessageDialog(null,"Amount has been withdrawn"); ;

                    }
                }
                //arraylist is empty or not
                if(cards.isEmpty()){
                    //show message
                    JOptionPane. showMessageDialog(null, "Array list is empty") ;
                }

                if (!isadded){
                    //show message
                    JOptionPane. showMessageDialog(null, "Cardid not found") ;
                }
                //catch

            }catch(NumberFormatException ex) {
                //show message
                JOptionPane. showMessageDialog(null, "Please Enter Valid Data") ;

            } 
        }

        //CLEAALLRBUTTON
        if(e.getSource() == ClearallButton){
            CardidText.setText("");
            ClientNameText.setText("");
            IssuerBankText.setText("");
            BankAccountText.setText("");
            BalanceamtText.setText("");
            PinText.setText("");
            withdrawanText.setText("");

            CVCnumberText.setText("");
            InterestText.setText("");
            CreditlimitText.setText("");
            GraceText.setText("");

        }
    }

    public static void main(String []args){
        //creating object of BankGUI
        BankGUI obj = new BankGUI();

    }
}

