package leetcode.FirstBadVersion;

/**
 * \* Author: sky
 * \* Date: 2019/6/17
 * \* Description:https://leetcode.com/problems/first-bad-version/
 *You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * \
 */
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));
    }
    public static boolean isBadVersion(int version) {
        if (version >= 2 ){
            return true;
        }
        return false;
    }
    public static int firstBadVersion(int n) {
        int res = 0;
        int low = 1, high = n;
        while (low <= high) {
            int mid = (low + high) / 2 ;
            if (isBadVersion(mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}