/**
 * Created by yangchangqi on 2018/3/31.
 *
 * 70. 爬楼梯
 */
public class ClimbStairsSolution {
    public static int climbStairs(int n) {
        if (n <= 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int n) {
        int a = 1, b = 1;
        while (--n > 0) {
            a = a + b; //计算a+b的值给a
            b = a - b; //每次记录上一次a的值给b
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(20));
        System.out.println(climbStairs2(20));
    }
}
