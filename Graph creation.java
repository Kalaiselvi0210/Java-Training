package org.example;
import java.util.*;
public class Main {
    int v;
    int E;
    static int[][] Matrix;
    public Main(int nodes){
        this.v = nodes;
        this.E = 0;
        this.Matrix = new int[nodes][nodes];
    }
    public  void addEdge(int u, int v){
       Matrix[u][v]=1;
       Matrix[v][u]=1;
       E++;
    }
    public void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main m = new Main(4);
        m.addEdge(0, 1);
        m.addEdge(1, 2);
        m.addEdge(2, 3);
        m.addEdge(3, 0);
        m.print(m.Matrix);
        }
    }


