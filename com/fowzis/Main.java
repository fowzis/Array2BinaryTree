// fowzi shakkour
package com.fowzis;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Integer[] dataArray = {13, 7, 6, 45, 21, 9, 101, 102, 15};
        BinaryTree bt = new BinaryTree();

        bt.CreateBinaryTree(dataArray);
        System.out.println("Completed Successfully");
    }
}