package com.duan.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(searchMatrix(arr, 7));
    }
    public static boolean searchMatrix(int[][] nums, int x) {
        // Todo your code goes here...
        //行数:rowNum  列数：colNum
        int rowNum = nums.length-1, colNum = 0;
        /*
        二维数组右上角开始遍历，大于右上角数，rowNum--,小于则colNum++,等于则返回
         */
        while(rowNum >= 0 && colNum < nums[0].length)
        {
            if(nums[rowNum][colNum] == x)
                return true;
            else if(nums[rowNum][colNum] > x)
                rowNum--;
            else
                colNum++;
        }
        return false;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isTreeSymmetric(TreeNode root) {
        //TODO your code goes here...
        if(root == null)
            return true;
        return symmetric(root.left, root.right);
    }
    public static boolean symmetric(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val == right.val)
            return symmetric(left.left, right.right) && symmetric(left.right, right.left);
        return false;
    }



    /**
     * 对任意一个Map<String, Object>, 其 key 为 String,
     * 其 value 为 Map<String, Object> Object[] Number String 中的任意一种,
     * 显然叶子节点是 value 类型为 Number 或 String的节点,
     * 将 Map 转为多条字符串, 每条字符串表达其中一个叶子节点,
     * 比如:
     * {"a":{"b":["v",2,{"c":0}]},"d":[1,null,3]}
     * 将转化为以下这些字符串
     * a.b[0] = v
     * a.b[1] = 2
     * a.b[2].c = 0
     * d[0] = 1
     * d[1] = null
     * d[2] = 3
     *
     * @param map 上述的 map
     * @return 所有的字符串
     */
    public static Set<String> showMap(Map<String, Object> map) {
        //TODO your code goes here...

        return null;
    }
}


