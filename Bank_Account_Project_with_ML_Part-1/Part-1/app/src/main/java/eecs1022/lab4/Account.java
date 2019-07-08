package eecs1022.lab4;

/**
 * Created by user on 2/22/18.
 */
public class Account
{

    public Account()
    {

    }

    public String StartAcc(String C1N, String C2N, String C3N, double c1, double c2, double c3)
    {

        String A1 = "";
        A1 += "Client " + C1N + " has balance $" + String.format("%.2f", c1) + "\n";
        A1 += "Client " + C2N + " has balance $" + String.format("%.2f", c2) + "\n";
        A1 += "Client " + C3N + " has balance $" + String.format("%.2f", c3);

        return A1;

    }
}