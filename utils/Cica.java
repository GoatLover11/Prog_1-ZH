package utils;

public class Main {

    public static void main(String[] args) {
        System.out.println(g(1));
        int []t = new int[8];
        int h = 0;
        int k = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 2)
                k++;
            if (t[i] == 3)
                h++;
        }
        if (k == 2 || h ==3)
            return true;
        else
            return false;
    }

    public double sorozat(double a, double dq, double n, boolean igaz){
        if (!igaz){
            return a+(n-1)*dq;
        }
        else {
            return a*Math.pow(dq,n-1);
        }
    }

    public static double g(int x){
        double d = 0.0;
        if (x > 1){
            d = (2*x)/(x-1);
        }
        else{
            d = Math.exp(x-1);
        }
        return d;
    }
}
 class Cica{
    String nev;
    Cica (String nev){
        this.nev = nev;
    }
    void nyavog(){
        System.out.println(this.nev + ": "+ "miau");
    }
 }
