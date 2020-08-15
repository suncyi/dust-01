package net.suncy.dust01.base.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @auther suncy
 * @Date 2020/8/15  16:16
 */
@Getter
@Setter
public class TreeNode {

    private int val ;
    private TreeNode left ;
    private TreeNode right ;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode addLeft(int val ){
        this.left =  new TreeNode(val);
        return this.left ;
    }

    public TreeNode addRight(int val ) {
        this.right = new TreeNode( val ) ;
        return this.right ;
    }

}
