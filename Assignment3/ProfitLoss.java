import java.util.*;

class ProfitLoss
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double costp, sellp, diff, lossper, profitper;

        System.out.println("Enter cost price :");
        costp = in.nextDouble();

        System.out.println("Enter selling price:");
        sellp = in.nextDouble();

        if(costp == sellp)
        {
            System.out.println("No profit loss");
        }
        else if(costp > sellp)
        {
            diff = sellp - costp;
            lossper = diff * 100 / costp;
            System.out.println("Loss percentage:" + lossper + "%");
        }
        else
        {
            diff = sellp - costp;
            profitper = diff * 100 / costp;
            System.out.print("Profit percent is:" + profitper + "%");
        }
    }
}
