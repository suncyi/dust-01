package net.suncy.dust01.tree;

import net.suncy.dust01.base.bean.TreeNode;

/**
 * @auther suncy
 * @Date 2020/8/26  17:05
 */
public class AvlTree<T extends Comparable> {

    private TreeNode<T> root ;

    public AvlTree(T val ){
        root = new TreeNode(val) ;
    }

    public void add(T val){
        if ( null == root ) {
            root = new TreeNode(val) ;
            return ;
        }
    }

    public void add(T val,TreeNode node ) {

    }


}
