import org.junit.Test;

/**
 * Created by yangchangqi on 2018/3/27.
 */
public class TestDataType {
    @Test
    public void testString() {
        Object obj = null;
        String str = String.valueOf(obj);
        if (str == null) {
            System.out.println("str is null");
        } else if (str.equals("null")) {
            System.out.println("str 等于字符串 " + str);
        }
    }

    @Test
    public void testBigint() {
        Object obj = null;
        Long v = null;
        Long v1 = (Long) v;
        if (v == null) {
            System.out.println("bigint is null" + v1);
        } else if (v.equals("null")) {
            System.out.println("str 等于字符串 " + v);
        }
    }
}
