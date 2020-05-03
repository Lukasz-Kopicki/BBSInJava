package sample;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import java.util.ArrayList;

public class Blum extends TestyZliczanie{

    private static final BigInteger two = BigInteger.valueOf(2L);
    private static final BigInteger three = BigInteger.valueOf(3L);
    private static final BigInteger four = BigInteger.valueOf(4L);


    /**
     * main parameter
     */
    private BigInteger n;
    int jedynki;
    int zera;
    int previous_bit;
    private BigInteger state;

    TestyZliczanie obj_one = new TestyZliczanie();
    TestyZliczanie obj_zero = new TestyZliczanie();
    TestyZliczanie single_test = new TestyZliczanie();
    ArrayList<Integer> result_list = new ArrayList<Integer>();

    private static BigInteger getPrime(int bits, Random rand) {
        BigInteger p;
        while (true) {
            p = new BigInteger(bits, 20000, rand);
            if (p.mod(four).equals(three))
                break;
        }
        return p;
    }

    private static Integer  checkPrime(int x) {
        if (x < 2) {
            return 0;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return x;
    }



    public static BigInteger generowanieN(int bits, Random rand) {

        BigInteger x =  getPrime(bits / 2, rand);
        BigInteger y = getPrime(bits / 2, rand);


        while ((x.equals(y))) {
            y = getPrime(bits, rand);
        }
        System.out.println("Liczby P oraz Q");
        System.out.println("p = "+x+"");
        System.out.println("q = "+y+"");

        BigInteger z;
        z=x.multiply(y);

        return z;
    }

    public Blum(int bits) {
        this(bits, new Random());
    }

    public Blum(int bits, Random rand) {
        this(generowanieN(bits, rand));
    }


    public Blum(BigInteger n) {
        this(n, SecureRandom.getSeed(n.bitLength() / 8));
    }

    public Blum(BigInteger n, byte[] seed) {

        this.n = n;
        setSeed(seed);
    }

    public void setSeed(byte[] seedBytes) {
        // ADD: use hardwired default for n
        BigInteger seed = new BigInteger(1, seedBytes);
        state = seed.mod(n);
        System.out.println("Seed = "+seed);
    }

    public int next(int numBits) {

            int result = 0;
            state = state.modPow(two, n);
            result = (state.testBit(0) == true ? 1 : 0);

        if (result ==1) {
            jedynki++;
            obj_one.addOne();
            obj_one.results_table(obj_one.getArray_counter());
        }
        else if (result==0) {
            obj_one.getArray_counter().clear();
            }

        if (result ==0) {
            zera++;
            obj_zero.addOne();
            obj_zero.results_table(obj_zero.getArray_counter());
        }
        else if (result==1){
            obj_zero.getArray_counter().clear();
        }
            previous_bit = result;
        return result;
    }

    public static void main(String[] args) {

  /*      double x;

        x=53;
        for(int i=0; i<20000; i++){
            x = (x * x) % 77;
            System.out.println(""+i+". ["+x+"]");
        }
                SecureRandom r = new SecureRandom();
  r.nextInt();
  System.out.println(getPrime(10,r));

    */

        SecureRandom r = new SecureRandom();

        r.nextInt();

        int bitsize = 8;
        BigInteger nval = Blum.generowanieN(bitsize, r);

        System.out.println("n = "+nval);



        byte[] seed = new byte[bitsize / 8];

           // Generacja losowej 8 bitowej liczby?




        int seed_var;
        int seed_f;
        do {
            r.nextBytes(seed);
            BigInteger seed_v = new BigInteger(1, seed);
            seed_var = seed_v.intValue();
            seed_f = checkPrime(seed_var);


        }while (seed_f==0);

        int j;
        int k;
        int var;
        Blum blumblums = new Blum(nval, seed);
        System.out.println("********************************************************");
        System.out.println("********************************************************");
        // and do something
        System.out.println("Generowanie  20000 bitów");
        for (int i = 0; i < 20000; ++i) {
            //System.out.println("" + i + ". " + bbs.next(1) + "");
            //(seed*seed) mod nval
            var = blumblums.next(1);
            blumblums.result_list.add(var);
            System.out.print(var);
             j = i+1;
            if (j>3) {
                k= j % 4;
                if (k == 0) System.out.print(", ");
              k = j % 120;
                if (k == 0) System.out.println("");
            }
        }


        System.out.println();

    System.out.println("Ilosc 1: "+blumblums.jedynki+"");
    System.out.println("Ilosc 0: "+blumblums.zera+"\n");


      /*  for(int x: bbs.result_list){
            System.out.print(x);
        }*/
       //display_one_results(blumblums.obj_one);
      // display_zero_results(blumblums.obj_zero);

      System.out.println("********************************************************");
        System.out.println("********************************************************");

       // single_test( blumblums.result_list,9725,10250);

 System.out.println("\n********************************************************");
        System.out.println("********************************************************\n");
        System.out.println("\n");

      /*  blumblums.single_test.results_table_seria(1,20000,(blumblums.result_list));
        display_one_results(blumblums.single_test);


        blumblums.single_test.results_table_seria(1500,3050,(blumblums.result_list));
        display_one_results(blumblums.single_test);
        System.out.println("");
        System.out.println("");
        blumblums.single_test.results_table_seria(1350,3005,(blumblums.result_list));
        display_one_results(blumblums.single_test);
        System.out.println("");
        System.out.println("");
        blumblums.single_test.results_table_seria(1315,4065,(blumblums.result_list));
        display_one_results(blumblums.single_test);
        System.out.println("");
        System.out.println("");
        blumblums.single_test.results_table_seria(1114,2386,(blumblums.result_list));
        display_one_results(blumblums.single_test);
*/
        blumblums.single_test.results_table_seria(1,20000,(blumblums.result_list));

        WiecejNiz26(blumblums.single_test);





        //System.out.println("test przeszedł");

        /*

        System.out.println("");
        System.out.println("");
        blumblums.single_test.results_table_seria(5270,7230,(blumblums.result_list));
        display_one_results(blumblums.single_test);
        System.out.println("");
        System.out.println("");
        blumblums.single_test.results_table_seria(2400,3840,(blumblums.result_list));
        display_one_results(blumblums.single_test);

        System.out.println("");
        System.out.println("");
        blumblums.single_test.results_table_seria(1030,3209,(blumblums.result_list));
        display_one_results(blumblums.single_test);
*/
        //System.out.println(bbs.single_test.getTable());
    }

}

