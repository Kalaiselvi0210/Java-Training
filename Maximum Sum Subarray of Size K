package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int arr=sc.nextInt();
                int[] h=new int[arr];
                for(int i=0;i<arr;i++)
                {
                    h[i]=sc.nextInt();

                }
                int k=sc.nextInt();


                int MaxArea=Integer.MIN_VALUE;
                for(int i=0;i<=arr-k;i++){
                    int Area=0;
                    for(int j=i;j<i+k;j++){
                        Area+=h[j];

                    }
                    MaxArea=Math.max(MaxArea,Area);


                }
                System.out.print(MaxArea);
            }
        }

