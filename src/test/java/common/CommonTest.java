package common;

import org.junit.Test;

/**
 * Created by hzq on 2018/4/28.
 */
public class CommonTest {

    @Test
    public void testString(){
        String str = new String("");
        String str2 = "";
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }


}
