package Java_2K23.DSA;

public class FibnacciSeriesByRecurrsion {
    public static void PrintFib(int a,int b,int n){
    // base case
        if(n==0){
            return ;
        }// 0 1 1 2 3 5 8
        int c=a+b;// c=>1
        //c= b+c
        System.out.print(c+" ");
        PrintFib(b,c,n-1);
    }
    public static void main(String[] args){
        int a=0,b=1,n=7;
        System.out.print(a+" "+b+" ");
        PrintFib(a,b,n-2);

    }
}
