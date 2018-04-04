package com.xxzzycq.heap;

import java.util.PriorityQueue;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class TopK {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(k);
        for (int num : nums) {
            if (minQueue.size() < k || num > minQueue.peek())
                minQueue.offer(num);
            if (minQueue.size() > k)
                minQueue.poll();
        }
        return minQueue.peek();
    }

    public static void main(String[] args) {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = (int) (Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        int k = findKthLargest(nums, 100);
        long end = System.currentTimeMillis();
        System.out.println("k = " + k + " " + " time = " + (end - start));
    }
}
