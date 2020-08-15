package net.suncy.dust01.recursion;

import net.suncy.dust01.base.bean.TreeNode;

import java.util.List;

/**
 * 递归
 * @auther suncy
 * @Date 2020/8/15  14:07
 */
public class Recursion01 {
    //  f(n) = f(n-1) + f(n-2)
    // f(1)=f(2)=1
    public int fibonacci(int n){
        if( n== 2 || n==1 ) {
            return 1 ;
        }
        return fibonacci(n-1) + fibonacci(n-2) ;
    }

    public int removeBoxes(int[] boxes) {
        int[][][] dp = new int[100][100][100];
        return calculatePoints(boxes, dp, 0, boxes.length - 1, 0);
    }

    public int calculatePoints(int[] boxes, int[][][] dp, int l, int r, int k) {
        if (l > r) return 0;
        if (dp[l][r][k] != 0) return dp[l][r][k];
        while (r > l && boxes[r] == boxes[r - 1]) {
            r--;
            k++;
        }
        dp[l][r][k] = calculatePoints(boxes, dp, l, r - 1, 0) + (k + 1) * (k + 1);
        for (int i = l; i < r; i++) {
            if (boxes[i] == boxes[r]) {
                dp[l][r][k] = Math.max(dp[l][r][k], calculatePoints(boxes, dp, l, i, k + 1) + calculatePoints(boxes, dp, i + 1, r - 1, 0));
            }
        }
        return dp[l][r][k];
    }
    //递归乘法
    public int multiply(int a, int b) {
        if(a== 1 ) {
            return b ;
        }
        return  multiply(a-1 ,b ) + b ;
    }
    public void preorderTraversal(TreeNode node) {
        if( null == node ) {
            return;
        }
        System.out.println( node.getVal());
        if( null != node.getLeft()) {
            inorderTraversal(node.getLeft());
        }
        if( null != node.getRight()) {
            inorderTraversal(node.getRight());
        }
    }

    // 中序遍历
    public void inorderTraversal(TreeNode node) {
        if( null == node ) {
            return;
        }
        if( null != node.getLeft()) {
            inorderTraversal(node.getLeft());
        }
        System.out.println( node.getVal());
        if( null != node.getRight()) {
            inorderTraversal(node.getRight());
        }
    }

    public void aftorderTraversal(TreeNode node) {
        if( null == node ) {
            return;
        }
        if( null != node.getLeft()) {
            inorderTraversal(node.getLeft());
        }
        if( null != node.getRight()) {
            inorderTraversal(node.getRight());
        }
        System.out.println( node.getVal());
    }

    public void inorderTraversal(TreeNode node, List<Integer> res) {

    }


    public static void main(String[] args) {
        Recursion01 rr = new Recursion01();
        System.out.println( rr.multiply(3,6) );
    }
}
