package net.suncy.dust01.base.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @auther suncy
 * @Date 2020/8/15  16:16
 */
@Getter
@Setter
public class TreeNode<T extends Comparable> {

    private T val ;
    private TreeNode left ;
    private TreeNode right ;
    private int height;

    public TreeNode(T val) {
        this.val = val;
    }

    public TreeNode addLeft(T val ){
        this.left =  new TreeNode(val);
        return this.left ;
    }

    public TreeNode addRight(T val ) {
        this.right = new TreeNode( val ) ;
        return this.right ;
    }

}
