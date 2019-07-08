package eecs1022.lab4;

/**
 * Created by user on 2/21/18.
 */
public class Bank
{
    String CN1;
    String CN2;
    String CN3;

    double CB1;
    double CB2;
    double CB3;

    public Bank()
    {

    }
    public void Receive(String C1N, String C2N, String C3N, double c1, double c2, double c3)
    {
        this.CN1 = C1N;
        this.CN2 = C2N;
        this.CN3 = C3N;

        this.CB1 = c1;
        this.CB2 = c2;
        this.CB3 = c3;


    }

    public String BankChange(String s1, String s2, String s3,double amount){
      String t = "";
        if (s1.equals("deposit")){
            if (s3.equals("client 1")){
               this.CB1 += amount;
            }else if (s3.equals("client 2")){
                this.CB2 += amount;
            }else if (s3.equals("client 3")){
                this.CB3 += amount;
            }

        }else if(s1.equals("withdraw")){
            if (s2.equals("client 1")){
                this.CB1 -= amount;
            }else if (s2.equals("client 2")){
                this.CB2 -= amount;
            }else if (s2.equals("client 3")){
                this.CB3 -= amount;
            }

        }else if(s1.equals("transfer"))
        {
            if (s2.equals("client 1"))
            {
                this.CB1 -= amount;
                if (s3.equals("client 2"))
                {
                    this.CB2 += amount;
                } else if (s3.equals("client 3"))
                {
                    this.CB3 += amount;
                }
            } else if (s2.equals("client 2"))
            {
                this.CB2 -= amount;
                if (s3.equals("client 1"))
                {
                    this.CB1 += amount;
                } else if (s3.equals("client 3"))
                {
                    this.CB3 += amount;
                }
            } else if (s2.equals("client 3"))
            {
                this.CB3 -= amount;
                if (s3.equals("client 2"))
                {
                    this.CB2 += amount;
                } else if (s3.equals("client 1"))
                {
                    this.CB1 += amount;
                }
            }
        }
        t = StateAcc();

       return t;
    }

    public String StateAcc()
    {

        String A1 = "";
        A1 += "Client " + this.CN1 + " has balance $" + String.format("%.2f", this.CB1) + "\n";
        A1 += "Client " + this.CN2 + " has balance $" + String.format("%.2f", this.CB2) + "\n";
        A1 += "Client " + this.CN3 + " has balance $" + String.format("%.2f", this.CB3);

        return A1;

    }


}