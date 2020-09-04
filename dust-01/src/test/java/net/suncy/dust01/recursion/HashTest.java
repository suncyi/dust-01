package net.suncy.dust01.recursion;

import org.junit.jupiter.api.Test;

/**
 * @auther suncy
 * @Date 2020/8/24  15:08
 */
public class HashTest {


    @Test
    public void hashTest(){
        Integer a = 1233;
        System.out.println( a.hashCode());
        String b = "bb";
        String b2 = "bbbbb";
        System.out.println( b.hashCode());
        System.out.println( b2.hashCode());
        b.equals(b2);
    }
}
