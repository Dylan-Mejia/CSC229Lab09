package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("The first number to have over 5 divisors is " + findTriangleNumberWithDivisors(5));
        System.out.println("The first number to have over 100 divisors is " + findTriangleNumberWithDivisors(100));
    }
    public static int findTriangleNumberWithDivisors(int n) {
        int x = 1;
        int y = 0;
        int i = 1;
        while (true) {
            y += x;
            int num = 0;
            for (i = 1; i <= Math.sqrt(y); i++){
                if (y % i == 0) {
                    if (y/i == i) {
                        num++;
                    }
                    else
                        num+=2;
                }
            }
            if (num > n){
                return y;
            }
            x++;
        }
    }
    }
