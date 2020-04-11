package com.fowzis;

public class BinaryTree {

    private BTNode btRoot;

    private class BTNode {
        public BTNode left;
        public BTNode right;
        public Integer data;

        public BTNode(Integer data)
        {
            this.data = data;
            this.left = this.right = null;
        }

        /**
         * @return the left
         */
        public BTNode getLeft() {
            return left;
        }

        /**
         * @return the right
         */
        public BTNode getRight() {
            return right;
        }

        /**
         * @return the data
         */
        public Integer getData() {
            return data;
        }
    }

    public BTNode getTree() {
        return btRoot;
    }

    public void CreateBinaryTree(Integer[] dataArray)
    {
        // Error Checking
        if (dataArray.length <= 0 ) {
            // can throw an exception
            throw new IllegalArgumentException("Data set is empty");
        }

        // 2. Recursively, divide the list into 2,
        // taking the middle element and inserting it as the root
        // Insert left elements as the root left child of the root.
        // Insert right elements to the root right child of the root.
        btRoot = BuildBT(dataArray,0, dataArray.length-1);
    }

    private BTNode BuildBT(Integer[] dataArray, int low, int high)
    {
        if (low > high)
            return null;

        int mid = low + (high-low)/2;
        BTNode head = new BTNode(dataArray[mid]);
        head.left = BuildBT(dataArray, low, mid-1);
        head.right = BuildBT(dataArray,mid+1, high);
        return head;
    }
}