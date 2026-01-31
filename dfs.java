package org.example;
import java.util.*;
public class Main {
    static class Edge{
        int dest;
        Edge(int dest){
            this.dest = dest;
        }
    }
public static void dfs(ArrayList<Edge>[] graph,int V) {
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited = new boolean[V];
    q.add(0);
    visited[0] = true;
    while (!q.isEmpty()) {
        int curr = q.remove();
        System.out.println(curr + " ");
        for (Edge e : graph[curr]) {
            if (!visited[e.dest]){
                q.add(e.dest);
                visited[e.dest] = true;
            }
        }
    }
}
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(1));
        graph[0].add(new Edge(2));
        graph[0].add(new Edge(3));
        graph[0].add(new Edge(4));
        dfs(graph, V);
        }
    }

