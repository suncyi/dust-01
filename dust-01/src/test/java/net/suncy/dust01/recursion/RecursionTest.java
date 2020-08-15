package net.suncy.dust01.recursion;

import net.suncy.dust01.base.bean.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @auther suncy
 * @Date 2020/8/15  17:04
 */
public class RecursionTest {

    Recursion01 recu = new Recursion01();

    @Test
    public void treeInorderTest(){
        TreeNode root = new TreeNode(5);
        root.addLeft(4).addLeft(3).addLeft(2).addLeft(1);
        root.addRight(6).addRight(7).addRight(8).addRight(9) ;
//        recu.inorderTraversal(root );
        recu.preorderTraversal(root );
    }
}
