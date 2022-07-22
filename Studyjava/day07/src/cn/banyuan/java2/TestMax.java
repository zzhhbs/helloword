package cn.banyuan.java2;

public class TestMax {

    public int max( int [] arr){
        int m=arr[0];

        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }



        return m;
    }


    public static void main(String[] args) {
        TestMax t=new TestMax();
        int [] list ={11,21,8,66};
       int max= t.max(list);
        System.out.println("最大值是："+max);
    }

}
