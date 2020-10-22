package com.company;

public class Main {

    public static void main(String[] args) {

       long result1 = Factorial(2) * Factorial(6);
       long result2 = Permutation(11,10);
        System.out.println("First-level task result: "+result1);
        System.out.println("Secong-level task result: "+result2+" (not correct value, because long is not long enough to display such value)");
    }

    public static long Factorial(int n){
        long factorial;
        if(n==0){
            return n+1;
        }
        factorial = n * Factorial(n-1);
        return factorial;
    }
    public static long Combination(int n, int m){
        return Factorial(n)/(Factorial(m) * Factorial(n-m));
    }
    public static long Permutation(int n, int k){
        return (int)Math.pow(n,k);
    }
}
