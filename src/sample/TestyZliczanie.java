package sample;
import sample.Blum;
import java.util.ArrayList;

public class TestyZliczanie{


    TestyZliczanie(){};

    private ArrayList<Integer> table = new ArrayList<Integer>();



    private ArrayList<Integer> table_counter = new ArrayList<Integer>();

    private int one = 0;
    private int two = 0;
    private int three = 0;
    private int four = 0;
    private int five = 0;
    private int six = 0;
    private int seven = 0;
    private int twentysix = 0;
    private int moreThanTwentySix=0;

    public void setMoreThanTwentySix(int moreThanTwentySix) {
        this.moreThanTwentySix = moreThanTwentySix;
    }

    public int getMoreThanTwentySix() {
        return moreThanTwentySix;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getOne() {
        return one;
    }

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

    public ArrayList<Integer> getArray_counter() {
        return table_counter;
    }

    public ArrayList<Integer> getTable() {
        return table;
    }

    public void setTable(ArrayList<Integer> table) {
        this.table = table;
    }

    public static void display_one_results(TestyZliczanie object){
        System.out.println("\n1*1 obok siebie: "+object.getOne()+"");
        System.out.println("\n2*1 obok siebie: "+object.getTwo()+"");
        System.out.println("3*1 obok siebie "+object.getThree()+"");
        System.out.println("4*1 obok siebie "+object.getFour()+"");
        System.out.println("5*1 obok siebie "+object.getFive()+"");
        System.out.println("6*1 obok siebie "+object.getSix()+"");
        System.out.println("7*1 obok siebie "+object.getSeven()+"");
        System.out.println("26*1 obok siebie "+object.getTwentysix()+"\n");
    }

    public static void WiecejNiz26(TestyZliczanie object){

        System.out.println("Nie przeszło bo wiecej niz 26 jedynek obok siebie "+object.getMoreThanTwentySix()+"\n");
    }


    public static void display_zero_results(TestyZliczanie object){

        System.out.println("\n 2 zera kolo siebie: "+object.getTwo()+"");
        System.out.println(" 3 zera kolo siebie: "+object.getThree()+"");
        System.out.println(" 4 zera kolo siebie: "+object.getFour()+"");
        System.out.println(" 5 zer kolo siebie: "+object.getFive()+"");
        System.out.println(" 6 zer kolo siebie: "+object.getSix()+"");
        System.out.println("7 zer kolo siebie: "+object.getSeven()+"");
        System.out.println("26 zer kolo siebie: "+object.getTwentysix()+"\n");
    }

    public static ArrayList<Integer> single_test(ArrayList<Integer> list, int poczPrzed, int konPrzed){
        ArrayList<Integer> list_nowa = new ArrayList<Integer>();
        int y =0;
        for (int i =poczPrzed; i<konPrzed; i++)
        {
            list_nowa.add(list.get(i));
            System.out.print(list_nowa.get(y));
            y++;
        }
        return list_nowa;
    }

    public void results_table (ArrayList<Integer> table){
        if(table.size()==1)
        {
            this.one++;
        }
        if(table.size()>26)
        {
            this.moreThanTwentySix++;

        }

    /*    else if (table.size()==2){
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
        }*/

    };

    public void results_table_seria (int poczatek, int koniec, ArrayList<Integer> results_table){
                System.out.println("Test dla przedzialu: "+poczatek+" "+koniec+":");
                this.table = single_test(results_table, poczatek, koniec);
                for (int i=0;i<table.size();i++){
                if (this.table.get(i) ==1) {
                    table_counter.add(1);
                    results_table(table_counter);
                }
                else if (table.get(i) ==0) {
                    table_counter.clear();
                }
            }
        }


    };

