package com.xxzzycq.sort;

import java.util.Arrays;

/**
 * Created by yangchangqi on 2018/3/31.
 *
 * 80 合并两个有序数组
 * 思路：考虑到a数组很大，可以直接在a数组上进行合并，但是要讲究效率。如果单纯从前往后合并，那么效率会非常低，因为a数组后面的数字需要不停的移动。
 * 换一种思路，我们采用从后往前合并，首先计算出总长度，设置一个指针从a数组最后往前移动。
 */
public class MergeSortedTwoArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int newPoint = m + n - 1;
        int point1 = m - 1;
        int point2 = n - 1;
        while (point1 >= 0 && point2 >= 0) {
            if (nums1[point1] > nums2[point2]) {
                nums1[newPoint--] = nums1[point1--];
            } else {
                nums1[newPoint--] = nums2[point2--];
            }
        }
//        while (point1 >= 0) {
//            nums1[newPoint--] = nums1[point1--];
//        }
        while (point2 >= 0) {
            nums1[newPoint--] = nums2[point2--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[30];
        for (int i = 0; i< 10; i++) {
            nums1[i] = i;
        }
        int[] nums2 = new int[20];
        for (int j = 0; j < 20; j++) {
            nums2[j] = j;
        }
        merge(nums1, 10, nums2, 20);
        Arrays.stream(nums1).forEach(i -> System.out.print(i + " "));
    }
}
