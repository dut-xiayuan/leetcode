package me.cwuyi;

public class CountPrimes {

    /**
     * Leetcode 204
     *
     * 主要在于计算一个数是否是素数，素数只可能出现在6的倍数的两侧，
     * 之后在遍历到sqrt(n)之前，有部分数也可以不用判断
     * 推导见：https://blog.csdn.net/huang_miao_xin/article/details/51331710
     *
     * 不过这题是找出小于n的素数的个数，不用遍历去判断一个数是否是素数，比较好的解答见
     * https://leetcode.com/problems/count-primes/discuss/57588/My-simple-Java-solution
     *
     * @param n
     * @return
     */

    public int countPrimes(int n) {

        int ret = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrimes(i)) {
                ret++;
            }
        }

        return ret;
    }

    public boolean isPrimes(int x) {

        if (x == 2 || x == 3) {
            return true;
        }

        if (x % 6 != 1 && x % 6 != 5) {
            return false;
        }

        double tmp = Math.sqrt(x);

        for (int i = 5; i <= tmp; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
