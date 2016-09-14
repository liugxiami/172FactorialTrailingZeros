package com.ccsi;

public class Main {

    public static void main(String[] args) {
        System.out.println(trailingZeroes1(25));
    }
    //Given an integer n,return the number of trailing zeroes in n
    //1.???
    public static int trailingZeroes(int n){
        if(n==0)return 0;
        int counter=0;
        while(n!=0){
            n/=5;
            counter+=n;
        }
        return counter;
    }
    //2.10！=1*2*3*(2*2)*5*(2*3)*7*(2*2*2)*9*(2*5)=3628800
    //对1～n每个数进行因数分解，累计每个数的分解式中的2、5的个数，每一对2、5相乘会产生一个0.
    public static int trailingZeroes1(int n){
        if(n==0)return 0;
        int num_2=0,num_5=0;
        while (n!=0){
            int i=n;
            while(i!=0){
                if(i%2==0){
                    num_2++;
                    i/=2;
                }else break;
            }

            while(i!=0){
                if(i%5==0){
                    num_5++;
                    i/=5;
                }else break;
            }
            n--;
        }
        return Math.min(num_2,num_5);
    }
}
