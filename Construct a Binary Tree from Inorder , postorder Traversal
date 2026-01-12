package org.example;
import com.sun.source.tree.BinaryTree;

import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    static int idx=-1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
    }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;

    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void  main(String[] args){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     Main  m=new Main();
        Node roots = m.buildTree(nodes);
        m.preOrder(roots);
        System.out.println();
        m.inOrder(roots);
        System.out.println();
        m.postOrder(roots);
    }

}




