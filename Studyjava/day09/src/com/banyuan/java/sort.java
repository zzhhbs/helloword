package com.banyuan.java;

import java.util.Arrays;

public class sort {
    public static void main(String[] args)
    {
        int[] arr = {22,3,51,1,23,6,78,34};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println("");
        int[] arr1 = sort(arr);
        System.out.println("使用插入排序后得到的数组");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
    //传进来一个未排序数组，返回一个经过插入排序排序的数组
    public static int[] sort(int[] array){
/*
1. 外层循环，这次不从array[0]开始了，因为我们默认第一个元素是排好序的（那必须的）
2. 内层循环，将现在选中的这个数和前面的数比较，如果小于前面的数，就互换，如此循环
可以保证内层循环结束时，下标为j及之前的数都是从小到大排好的，3.这个交换在array[j]比array[j-1]大时就会停止，因为如果array[j]>array[j-1]，由于前面的元素都是排好序的，所以array[j]一定大于array[j-2]....
 */
        for(int i=1; i<array.length; i++){
            for(int j=i; j>0; j--){
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else{
                    break;
                }
            }
            System.out.println("第"+i+"轮的排序结果是"+ Arrays.toString(array));
        } return array; }
}
