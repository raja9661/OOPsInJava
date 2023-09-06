import java.util.*;
public class BankingSystem
{
    String name,branch,account,mobilNo;
    int totalBalance=100000;
    int WithDrawAmunt;
    Scanner scn=new Scanner(System.in);
    void accountHolderDetails()
    {
        System.out.println("enter the Name of Account Holder:");
        name=scn.nextLine();
        System.out.println("enter  Branch name:");
        branch=scn.nextLine();
        System.out.println("enter Account Number:");
        account=scn.nextLine();
        System.out.println("enter Contact Number:");
        mobilNo=scn.nextLine();
    }
    void checkCurrentBal()
    {
        System.out.println("Your Current account Balance is:"+totalBalance);
    }
    void withdrawlBal()
    {
        System.out.println("enter withDrawing amount");
        WithDrawAmunt=scn.nextInt();
        if(WithDrawAmunt>totalBalance)
        {
            System.out.println("Insufficient Balance:");
        }
        else
        {
            totalBalance=totalBalance-WithDrawAmunt;
        }
    }
    void getDetail()
    {
        System.out.println("**********************your Details**********************");
        System.out.println("Account Holder Name:"+name);
        System.out.println("Branch name:"+branch);
        System.out.println("enter Account Number:"+account);
        System.out.println("enter Contact Number:"+mobilNo); 
    }
    public static void main(String args[])
    {
        System.out.println("********Welcome to star Bank*********");
        BankingSystem bk=new BankingSystem();
        System.out.println("Please select your options");
        System.out.println("Select 1 for account details");
        System.out.println("Select 2 check current Balance");
        System.out.println("Select 3 withdral");
        System.out.println("Select 4 for Exit:");
        Scanner sc=new Scanner(System.in);
        String options=sc.nextLine();
        switch(options)
        {
            case "1":bk.accountHolderDetails();;
                   bk.getDetail();
            break;
            case "2":bk.checkCurrentBal();
            break;
            case "3":bk.withdrawlBal();
            break;
            case "4":System.out.println("*****thanks for visiting star Bank:*****");
            break;
            default:System.out.println("please select correct option:");
        }

    }
}