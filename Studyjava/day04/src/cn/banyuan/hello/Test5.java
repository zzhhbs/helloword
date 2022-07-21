package cn.banyuan.hello;





public class Test5 {

    public static void main(String[] args) {

        int arr[]={12,2,1,78,55};
        //假设最大值是第一个数
        int max= arr[0];

        for(int i=0;i<arr.length;i++){
            //如果最大值比其中某个值还小 则将大的值赋值给max
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println("最大值是："+max);


    }
}
