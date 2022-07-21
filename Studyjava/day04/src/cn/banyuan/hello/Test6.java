package cn.banyuan.hello;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {

        int arr1[]={1,3,5,7,9};
        int arr2[]={1,3,5,7,9};
        int arr3[]={1,77,3,5,7};

        //equals(a1,a2)   比较两个数组 a1 a2 是否相等
        boolean result=Arrays.equals(arr1,arr2);
        boolean result1=Arrays.equals(arr1,arr3);
      //  System.out.println(result+" "+result1);

        //sort(arr)  //对arr排序
        //toString()将一个数组转换为一个字符串

       /* Arrays.sort(arr3);  //对数组进行排序
        System.out.println(Arrays.toString(arr3));*/


        //fill(arr,val)  将数组arr中的值替换为val

       /* Arrays.fill(arr3,11);
        System.out.println(Arrays.toString(arr3));*/

       //copyOf(array,length)  将数组array  扩容成一个长度为leanth的新数组
      /*int arr[] =  Arrays.copyOf(arr3,7);
        //System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

        Arrays.sort(arr3);
         int index=  Arrays.binarySearch(arr3,1);
        System.out.println(index);
    }
}
