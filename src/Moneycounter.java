import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface MoneyCntr {
    //  private int bills;
    //  private int coins;
    void initBillsAndCoins(int billsAndCoins);

    void calcBillsAndCoins();

    int getBills();

}

class MoneyCntrImpl implements MoneyCntr {
    //  public static final int[] VctBills = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    public static final int[] VctCoins = {50, 20, 10, 5, 2, 1};

    private int bills;
    private int coins;


    public MoneyCntrImpl() {
    }

    public void initBillsAndCoins(int billsAndCoins) { // 14 euro 70 cent = 1470
        bills = billsAndCoins /*/ 100*/;
        // coins = billsAndCoins % 100;
        System.out.println("\nDer Eurowert beträgt " + bills/* + " und der Centwert " + coins*/);
    }

    public int getBills() {
        return bills;
    }

    public int getCoins() {
        return coins;
    }

    public void calcBillsAndCoins() {
        List<Integer> values = new ArrayList<Integer>();
        values.add(500);
        values.add(200);
        values.add(100);
        values.add(50);
        values.add(20);
        values.add(10);
        values.add(5);
        values.add(2);
        values.add(1);
        Iterator it = values.iterator();

        List<Integer> cntBills = new ArrayList<Integer>();


        // while (it.hasNext())
        //   int value = it.next()

        System.out.println("Output in Euro: ");
        for (int money : values) {
            //     while (it.hasNext())
            //       cntBills = it.next()
            cntBills.add(bills / money);
            //       cntBills.add(it.next())
            bills = bills % money;
            //   if (cntBills[i] != 0)
            System.out.println(cntBills + "x");
        }
       /* System.out.println("Output in Cent: ");
        for (int n = 0; n < 6; n++) {
            cntCoins[n] = coins / VctCoins[n];
            coins = coins % VctCoins[n];
            if (cntCoins[n] != 0)
                System.out.println(cntCoins[n] + "x" + VctCoins[n]);
        }
        */
    }
}

public class Moneycounter {
    public static void main(String[] args) {
        MoneyCntr counter = new MoneyCntrImpl();
        int number;
        number = 14;

        if (number > 0 && number < 10000) {

            // objekt erstellt und typpiesieren als Moneycounter
            counter.initBillsAndCoins(number);
            counter.calcBillsAndCoins();
            number = counter.getBills();


        }
    }
}
