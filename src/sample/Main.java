/*
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main extends Application {
    private BigInteger state;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static double average(double x, double ... var){
    double sum = x;
    for ( double v : var) sum += v;
    return var.length == 0 ? 0 : sum/(var.length+1);
    };

    public int next(int numBits) {
        // TODO: find out how many LSB one can extract per cycle.
        //   it is more than one.
        int result = 0;
        System.out.println(numBits);
        for (int i = numBits; i != 0; --i) {
            //state = state.modPow(2L, 77L);
            result = (result << 1) | (state.testBit(0) == true ? 1 : 0);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        Integer var_1 = in.nextInt();
        int reversed = 0;

        while( var_1 != 0){
            int digit = var_1 % 10;
            reversed = reversed * 10 + digit;
            var_1 /= 10;
        }
        System.out.println(reversed);
        System.out.printf("%x", reversed);
        //launch(args);

        System.out.println(average(40,10));

        int y2 = 60;
        String xd = Integer.toBinaryString(y2);
        char bit = xd.charAt(xd.length()-1);
        System.out.println(bit);

        y2 = 8;
        y2 = (y2 << 2);
        System.out.println(y2);


    }


}

package sample;

        import java.math.BigInteger;
        import java.security.SecureRandom;
        import java.util.Random;
        import java.util.ArrayList;

        import java.util.Random;
        import java.security.SecureRandom;
        import java.math.BigInteger;


*/
/*
 * Copyright 2005, Nick Galbreath -- nickg [at] modp [dot] com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *   Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 *   Neither the name of the modp.com nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * This is the standard "new" BSD license:
 * http://www.opensource.org/licenses/bsd-license.php


/**
 * The Blum-Blum-Shub random number generator.
 *
 * <p>
 * The Blum-Blum-Shub is a "cryptographically secure" random number
 * generator.  It has been proven that predicting the ouput
 * is equivalent to factoring <i>n</i>, a large integer generated
 * from two prime numbers.
 * </p>
 *
 * <p>
 * The Algorithm:
 * </p>
 * <ol>
 * <li>
 *  (setup) generate two secret prime numbers <i>p</i>, <i>q</i> such that
 *   <i>p</i> &ne; <i>q</i>, <i>p</i> &equiv; 3 mod 4, <i>q</i> &equiv; 3 mod 4.
 * </li>
 * <li> (setup) compute <i>n</i> = <i>pq</i>.  <i>n</i> can be re-used, but
 *   <i>p</i>, and <i>q</i> are secret and should be disposed of.</li>
 * <li> Generate a (secure) random seed <i>s</i> in the range [1, <i>n</i> -1]
 *   such that gcd(<i>s</i>, <i>n</i>) = 1.
 * <li> Compute <i>x</i> = <i>s</i><sup>2</sup> mod <i>n</i></li>
 * <li> Compute a single random bit with:
 *   <ol>
 *   <li> <i>x</i> = <i>x</i><sup>2</sup> mod <i>n</i></li>
 *   <li> return Least-Significant-Bit(<i>x</i>) (i.e. <i>x</i> & 1)</li>
 *   </ol>
 * Repeat as necessary.
 * </li>
 * </ol>
 *
 * <p>
 * The code originally appeared in <a href="http://modp.com/cida/"><i>Cryptography for
 * Internet and Database Applications </i>, Chapter 4, pages 174-177</a>
 * </p>
 * <p>
 * More details are in  the <a href="http://www.cacr.math.uwaterloo.ca/hac/"><i>Handbook of Applied Cryptography</i></a>,
 * <a href="http://www.cacr.math.uwaterloo.ca/hac/about/chap5.pdf">Section 5.5.2</a>
 * </p>
 *
 * @author Nick Galbreath -- nickg [at] modp [dot] com
 * @version 3 -- 06-Jul-2005
 *
 *//*

public class Blum extends CountingResults{

    // pre-compute a few values
    private static final BigInteger two = BigInteger.valueOf(2L);

    private static final BigInteger three = BigInteger.valueOf(3L);

    private static final BigInteger four = BigInteger.valueOf(4L);



    */
/**
     * main parameter
     *//*

    private BigInteger n;

    int jedynki;
    int zera;
    int dwie_j, trzy_j, cztery_j, piec_j, szesc_j, siedem_j, dwadziescia_szesc_j;
    int dwa_z, trzy_z, cztery_z, piec_z, szesc_z, siedem_z, dwadziescia_szesc_z;
    int previous_bit;



    ArrayList<Integer> one_table = new ArrayList<Integer>();
    ArrayList<Integer> zero_table = new ArrayList<Integer>();
    ArrayList<Integer> result_list = new ArrayList<Integer>();

    ArrayList<Integer> test_one = new ArrayList<Integer>();
    ArrayList<Integer> test_zero = new ArrayList<Integer>();

    CountingResults countigone = new CountingResults(test_one);
    CountingResults countinzero = new CountingResults(test_zero);

    private BigInteger state;

    */
/**
     * Generate appropriate prime number for use in Blum-Blum-Shub.
     * <p>
     * This generates the appropriate primes (p = 3 mod 4) needed to compute the
     * "n-value" for Blum-Blum-Shub.
     *
     * @param bits Number of bits in prime
     * @param rand A source of randomness
     *//*

    private static BigInteger getPrime(int bits, Random rand) {
        BigInteger p;
        while (true) {
            p = new BigInteger(bits, 1000000, rand);
            if (p.mod(four).equals(three))
                break;
        }
        return p;
    }

    */
/**
     * This generates the "n value" -- the multiplication of two equally sized
     * random prime numbers -- for use in the Blum-Blum-Shub algorithm.
     *
     * @param bits The number of bits of security
     * @param rand A random instance to aid in generating primes
     * @return A BigInteger, the <i>n</i>.
     *//*

    public static BigInteger generateN(int bits, Random rand) {

        BigInteger p =  getPrime(bits / 2, rand);
        BigInteger q = getPrime(bits / 2, rand);

        // make sure p != q (almost always true, but just in case, check)
        while ((p.equals(q))) {
            q = getPrime(bits, rand);
        }
        return p.multiply(q);
    }

    public  void results_one (ArrayList<Integer> table){
        if (table.size()==2){
            this.dwie_j ++;
        } else if (table.size()==3) {
            this.trzy_j++;
        }
        else if (table.size()==4) {
            this.cztery_j++;
        }
        else if (table.size()==5) {
            this.piec_j++;
        }
        else if (table.size()==6) {
            this.szesc_j++;
        }
        else if (table.size()==7) {
            this.siedem_j++;
        }
        else if (table.size()==26) {
            this.dwadziescia_szesc_j++;
        }

    };

    public  void results_zero (ArrayList<Integer> table){
        if (table.size()==2){
            this.dwa_z ++;
        } else if (table.size()==3) {
            this.trzy_z++;
        }
        else if (table.size()==4) {
            this.cztery_z++;
        }
        else if (table.size()==5) {
            this.piec_z++;
        }
        else if (table.size()==6) {
            this.szesc_z++;
        }
        else if (table.size()==7) {
            this.siedem_z++;
        }
        else if (table.size()==26) {
            this.dwadziescia_szesc_z++;
        }

    };

    */
/**
     * Constructor, specifing bits for <i>n</i>
     *
     * @param bits number of bits
     *//*

    public Blum(int bits) {
        this(bits, new Random());
    }

    */
/**
     * Constructor, generates prime and seed
     *
     * @param bits
     * @param rand
     *//*

    public Blum(int bits, Random rand) {
        this(generateN(bits, rand));
    }

    */
/**
     * A constructor to specify the "n-value" to the Blum-Blum-Shub algorithm.
     * The inital seed is computed using Java's internal "true" random number
     * generator.
     *
     * @param n The n-value.
     *//*

    public Blum(BigInteger n) {
        this(n, SecureRandom.getSeed(n.bitLength() / 8));
    }

    */
/**
     * A constructor to specify both the n-value and the seed to the
     * Blum-Blum-Shub algorithm.
     *
     * @param n    The n-value using a BigInteger
     * @param seed The seed value using a byte[] array.
     *//*

    public Blum(BigInteger n, byte[] seed) {

        this.n = n;
        setSeed(seed);
    }

    */
/**
     * Sets or resets the seed value and internal state
     *
     * @param seedBytes The new seed.
     *//*

    public void setSeed(byte[] seedBytes) {
        // ADD: use hardwired default for n
        BigInteger seed = new BigInteger(1, seedBytes);
        state = seed.mod(n);
    }

    */
/**
     * Returns up to numBit random bits
     *
     * @return int
     *//*



    public int next(int numBits) {
        // TODO: find out how many LSB one can extract per cycle.
        //   it is more than one.
        int result = 0;
        state = state.modPow(two, n);
        result = (state.testBit(0) == true ? 1 : 0);//(result << 1) | (state.testBit(0) == true ? 1 : 0);
        // Mnozenie *2  -> <<1 przesuniecie liczby o 1 bit w lewo, to jest np 0000 1000 (8) <<1 = 0001 0000 (16)



        if (result ==1) {
            jedynki++;
            one_table.add(1);
            countigone.table_counter.add(1);
            results_one(one_table);

        }
        else if (result==0) one_table.clear();


        if (result ==0) {
            zera++;
            zero_table.add(1);
            results_zero(zero_table);
        }
        else if (result==1) zero_table.clear();
        previous_bit = result;
        return result;
    }

    */
/**
     * A quickie test application for BlumBlumShub.
     *//*

    public static void main(String[] args) {
        */
/*
        // First use the internal, stock "true" random number
        // generator to get a "true random seed"
        SecureRandom r = new SecureRandom();
        System.out.println("Generating stock random seed");
        r.nextInt(); // need to do something for SR to be triggered.

        // Use this seed to generate a n-value for Blum-Blum-Shub
        // This value can be re-used if desired.

  /*      double x;

        x=53;
        for(int i=0; i<20000; i++){
            x = (x * x) % 77;
            System.out.println(""+i+". ["+x+"]");
        }
                SecureRandom r = new SecureRandom();
  r.nextInt();
  System.out.println(getPrime(10,r));

    *//*


        SecureRandom r = new SecureRandom();
        System.out.println("Generating stock random seed");
        r.nextInt(); // need to do something for SR to be triggered.
        System.out.println("Generating N");
        int bitsize = 512;
        BigInteger nval = Blum.generateN(bitsize, r);
        //System.out.println(nval);

        // now get a seed
        byte[] seed = new byte[bitsize / 8]; //Tablica na 512 bitowa liczbe
        r.nextBytes(seed); // Generacja losowej 4 bitowej liczby?
        Blum bbs = new Blum(nval, seed);

        // and do something
        System.out.println("Generating 20000 bytes");
        for (int i = 0; i < 20000; ++i) {
            //System.out.println("" + i + ". " + bbs.next(1) + "");
            int var = bbs.next(1);
            bbs.result_list.add(var);
            System.out.print(var);
            int j = i+1;
            if (j>3) {
                int k = j % 4;
                if (k == 0) System.out.print(" ");
                k= j % 100;
                if (k== 0) System.out.println(" ");
            }


        }
        System.out.println();
        System.out.println("Ilosc 1: "+bbs.jedynki+"");
        System.out.println("Ilosc 0: "+bbs.zera+"");

        System.out.println("Ilosc dwoch jedynek kolo siebie: "+bbs.dwie_j+"");
        System.out.println("Ilosc trzechjedynek kolo siebie: "+bbs.trzy_j+"");
        System.out.println("Ilosc czterech jedynek kolo siebie: "+bbs.cztery_j+"");
        System.out.println("Ilosc pieciu jedynek kolo siebie: "+bbs.piec_j+"");
        System.out.println("Ilosc szesciu jedynek kolo siebie: "+bbs.szesc_j+"");
        System.out.println("Ilosc siedmiu jedynek kolo siebie: "+bbs.siedem_j+"");
        System.out.println("Ilosc 26 jedynek kolo siebie: "+bbs.dwadziescia_szesc_j+"\n");


        System.out.println("Ilosc dwoch zer kolo siebie: "+bbs.dwa_z+"");
        System.out.println("Ilosc trzech zer kolo siebie: "+bbs.trzy_z+"");
        System.out.println("Ilosc czterech zer kolo siebie: "+bbs.cztery_z+"");
        System.out.println("Ilosc pieciu zer kolo siebie: "+bbs.piec_z+"");
        System.out.println("Ilosc szesciu zer kolo siebie: "+bbs.szesc_z+"");
        System.out.println("Ilosc siedmiu zer kolo siebie: "+bbs.siedem_z+"");
        System.out.println("Ilosc 26 zer kolo siebie: "+bbs.dwadziescia_szesc_z+"");

      */
/*  for(int x: bbs.result_list){
            System.out.print(x);
        }*//*

    }

}



*/

/* 11.04 BLUM - 11:00

package sample;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import java.util.ArrayList;

public class Blum extends CountingResults{

    // pre-compute a few values
    private static final BigInteger two = BigInteger.valueOf(2L);

    private static final BigInteger three = BigInteger.valueOf(3L);

    private static final BigInteger four = BigInteger.valueOf(4L);
    ArrayList<Integer> test_one = new ArrayList<Integer>();
    ArrayList<Integer> test_zero = new ArrayList<Integer>();

    ArrayList<Integer> single_test_ = new ArrayList<Integer>();

    */
/**
     * main parameter
     *//*

    private BigInteger n;

    int jedynki;
    int zera;
    int previous_bit;

    CountingResults obj_one = new CountingResults(test_one);
    CountingResults obj_zero = new CountingResults(test_zero);
    CountingResults single_test = new CountingResults(single_test_);

    ArrayList<Integer> result_list = new ArrayList<Integer>();


    private BigInteger state;

    */
/**
     * Generate appropriate prime number for use in Blum-Blum-Shub.
     * <p>
     * This generates the appropriate primes (p = 3 mod 4) needed to compute the
     * "n-value" for Blum-Blum-Shub.
     *
     * @param bits Number of bits in prime
     * @param rand A source of randomness
     *//*

    private static BigInteger getPrime(int bits, Random rand) {
        BigInteger p;
        while (true) {
            p = new BigInteger(bits, 1000000, rand);
            if (p.mod(four).equals(three))
                break;
        }
        return p;
    }

    private static Integer  checkPrime(int x){
        boolean flag = false;
        for(int i = 2; i <= x/2; ++i)
        {
            // condition for nonprime number
            if(x % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(x + " is a prime number.");
            return x;
        }

        else {
            System.out.println(x + " is not a prime number.");
            return 0;
        }

    }

    */
/**
     * This generates the "n value" -- the multiplication of two equally sized
     * random prime numbers -- for use in the Blum-Blum-Shub algorithm.
     *
     * @param bits The number of bits of security
     * @param rand A random instance to aid in generating primes
     * @return A BigInteger, the <i>n</i>.
     *//*

    public static BigInteger generateN(int bits, Random rand) {

        BigInteger p =  getPrime(bits / 2, rand);
        BigInteger q = getPrime(bits / 2, rand);

        // make sure p != q (almost always true, but just in case, check)
        while ((p.equals(q))) {
            q = getPrime(bits, rand);
        }

        System.out.println("p = "+p+"");
        System.out.println("q = "+q+"");

        return p.multiply(q);
    }



    */
/**
     * Constructor, specifing bits for <i>n</i>
     *
     * @param bits number of bits
     *//*

    public Blum(int bits) {
        this(bits, new Random());
    }

    */
/**
     * Constructor, generates prime and seed
     *
     * @param bits
     * @param rand
     *//*

    public Blum(int bits, Random rand) {
        this(generateN(bits, rand));
    }

    */
/**
     * A constructor to specify the "n-value" to the Blum-Blum-Shub algorithm.
     * The inital seed is computed using Java's internal "true" random number
     * generator.
     *
     * @param n The n-value.
     *//*

    public Blum(BigInteger n) {
        this(n, SecureRandom.getSeed(n.bitLength() / 8));
    }

    */
/**
     * A constructor to specify both the n-value and the seed to the
     * Blum-Blum-Shub algorithm.
     *
     * @param n    The n-value using a BigInteger
     * @param seed The seed value using a byte[] array.
     *//*

    public Blum(BigInteger n, byte[] seed) {

        this.n = n;
        setSeed(seed);
    }

    */
/**
     * Sets or resets the seed value and internal state
     *
     * @param seedBytes The new seed.
     *//*

    public void setSeed(byte[] seedBytes) {
        // ADD: use hardwired default for n
        BigInteger seed = new BigInteger(1, seedBytes);
        state = seed.mod(n);
        System.out.println("Seed = "+seed);
    }

    */
/**
     * Returns up to numBit random bits
     *
     * @return int
     *//*



    public int next(int numBits) {
        // TODO: find out how many LSB one can extract per cycle.
        //   it is more than one.
        int result = 0;
        state = state.modPow(two, n);
        result = (state.testBit(0) == true ? 1 : 0);//(result << 1) | (state.testBit(0) == true ? 1 : 0);
        // Mnozenie *2  -> <<1 przesuniecie liczby o 1 bit w lewo, to jest np 0000 1000 (8) <<1 = 0001 0000 (16)



        if (result ==1) {
            jedynki++;
            obj_one.addOne();
            obj_one.results_table(obj_one.getTable_counter());

        }
        else if (result==0) {
            obj_one.getTable_counter().clear();
        }


        if (result ==0) {
            zera++;
            obj_zero.addOne();
            obj_zero.results_table(obj_zero.getTable_counter());
        }
        else if (result==1){
            obj_zero.getTable_counter().clear();
        }
        previous_bit = result;
        return result;
    }



    */
/**
     * A quickie test application for BlumBlumShub.
     *//*

    public static void main(String[] args) {
        */
/*
        // First use the internal, stock "true" random number
        // generator to get a "true random seed"
        SecureRandom r = new SecureRandom();
        System.out.println("Generating stock random seed");
        r.nextInt(); // need to do something for SR to be triggered.

        // Use this seed to generate a n-value for Blum-Blum-Shub
        // This value can be re-used if desired.

  /*      double x;

        x=53;
        for(int i=0; i<20000; i++){
            x = (x * x) % 77;
            System.out.println(""+i+". ["+x+"]");
        }
                SecureRandom r = new SecureRandom();
  r.nextInt();
  System.out.println(getPrime(10,r));

    *//*


        checkPrime(6962);
        SecureRandom r = new SecureRandom();
        System.out.println("Generating stock random seed");
        r.nextInt(); // need to do something for SR to be triggered.
        System.out.println("Generating N");
        int bitsize = 8;
        BigInteger nval = Blum.generateN(bitsize, r);

        System.out.println("n = "+nval);
        //System.out.println(nval);

        // now get a seed
        byte[] seed = new byte[bitsize / 8]; //Tablica na 512 bitowa liczbe
        // Generacja losowej 8 bitowej liczby?
        int seed_variable;
        int seed_flag;
        do {
            r.nextBytes(seed); //67
            BigInteger seed_v = new BigInteger(1, seed);
            seed_variable = seed_v.intValue();
            seed_flag = checkPrime(seed_variable);


        }while (seed_flag==0);
        //BigInteger sed_var =

        Blum bbs = new Blum(nval, seed);

        // and do something
        System.out.println("Generating 20000 bytes");
        for (int i = 0; i < 20000; ++i) {
            //System.out.println("" + i + ". " + bbs.next(1) + "");
            //(seed*seed) mod nval
            int var = bbs.next(1);
            bbs.result_list.add(var);
            System.out.print(var);
            int j = i+1;
            if (j>3) {
                int k = j % 4;
                if (k == 0) System.out.print(" ");
                k = j % 100;
                if (k == 0) System.out.println(" ");
            }
        }
        System.out.println();
        System.out.println("Ilosc 1: "+bbs.jedynki+"");
        System.out.println("Ilosc 0: "+bbs.zera+"\n");


      */
/*  for(int x: bbs.result_list){
            System.out.print(x);
        }*//*

        System.out.println("Ilosc dwoch jedynek kolo siebie: "+bbs.obj_one.getTwo()+"");
        System.out.println("Ilosc trzechjedynek kolo siebie: "+bbs.obj_one.getThree()+"");
        System.out.println("Ilosc czterech jedynek kolo siebie: "+bbs.obj_one.getFour()+"");
        System.out.println("Ilosc pieciu jedynek kolo siebie: "+bbs.obj_one.getFive()+"");
        System.out.println("Ilosc szesciu jedynek kolo siebie: "+bbs.obj_one.getSix()+"");
        System.out.println("Ilosc siedmiu jedynek kolo siebie: "+bbs.obj_one.getSeven()+"");
        System.out.println("Ilosc 26 jedynek kolo siebie: "+bbs.obj_one.getTwentysix()+"\n");

        System.out.println("Ilosc dwoch zer kolo siebie: "+bbs.obj_zero.getTwo()+"");
        System.out.println("Ilosc trzech zer kolo siebie: "+bbs.obj_zero.getThree()+"");
        System.out.println("Ilosc czterech zer kolo siebie: "+bbs.obj_zero.getFour()+"");
        System.out.println("Ilosc pieciu zer kolo siebie: "+bbs.obj_zero.getFive()+"");
        System.out.println("Ilosc szesciu zer kolo siebie: "+bbs.obj_zero.getSix()+"");
        System.out.println("Ilosc siedmiu zer kolo siebie: "+bbs.obj_zero.getSeven()+"");
        System.out.println("Ilosc 26  zerkolo siebie: "+bbs.obj_zero.getTwentysix()+"\n");

        System.out.println("********************************************************");
        System.out.println("********************************************************");



        single_test( bbs.result_list,9725,10250);
        System.out.println("\n********************************************************");
        System.out.println("********************************************************\n");
        bbs.single_test.results_table_seria(
                1, 0,10,(bbs.result_list));
        System.out.println(bbs.single_test.getTable_counter());

        System.out.println("Ilosc dwoch jedynek kolo siebie: "+bbs.single_test.getTwo()+"");


    }

}
*/


/* COuntinResults 11.04 - 11:00
package sample;
import sample.Blum;
import java.util.ArrayList;

public class CountingResults {


    CountingResults(){};

    public CountingResults(ArrayList<Integer> table_counter) {
        this.table_counter = table_counter;
    }

    private ArrayList<Integer> table_counter = new ArrayList<Integer>();

    private int two = 0;
    private int three = 0;
    private int four = 0;
    private int five = 0;
    private int six = 0;
    private int seven = 0;
    private int twentysix = 0;

    public void setTable_counter(ArrayList<Integer> table_counter) {
        this.table_counter = table_counter;
    }

    public void addOne(){
        table_counter.add(1);
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public void setSeven(int seven) {
        this.seven = seven;
    }

    public void setTwentysix(int twentysix) {
        this.twentysix = twentysix;
    }

    public int getTwo() {
        return two;
    }

    public int getThree() {
        return three;
    }

    public int getFour() {
        return four;
    }

    public int getFive() {
        return five;
    }

    public int getSix() {
        return six;
    }

    public int getSeven() {
        return seven;
    }

    public int getTwentysix() {
        return twentysix;
    }

    public ArrayList<Integer> getTable_counter() {
        return table_counter;
    }

    public static ArrayList<Integer> single_test(ArrayList<Integer> list, int a, int b){
        ArrayList<Integer> list_new = new ArrayList<Integer>();
        int z =0;
        for (int i =a; i<b; i++)
        {

            list_new.add(list.get(i));
            System.out.print(list_new.get(z));
            z++;
            int j = z;
            if (j>3) {
                int k = j % 4;
                if (k == 0) System.out.print(" ");
                k = j % 100;
                if (k == 0) System.out.println(" ");
            }

        }
        return list_new;

    }

    public void results_table (ArrayList<Integer> table){
        if (table.size()==2){
            this.two ++;
        } else if (table.size()==3) {
            this.three++;
        }
        else if (table.size()==4) {
            this.four++;
        }
        else if (table.size()==5) {
            this.five++;
        }
        else if (table.size()==6) {
            this.six++;
        }
        else if (table.size()==7) {
            this.seven++;
        }
        else if (table.size()==26) {
            this.twentysix++;
        }

    };

    public void results_table_seria (int seria, int poczatek, int koniec, ArrayList<Integer> table){
        switch(seria){
            case 1: {
                ArrayList<Integer> table_new = single_test(table, poczatek, koniec);
                results_table(table_new);

            }

        }


    };
}
*/


