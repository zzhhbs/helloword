package cn.banyuan.hello;

public class Test1 {

    public static void main(String[] args) {
        //数组的声明  方式一
        int num[]=new int[7];
        int [] age;

        num[0]=12;
        num[1]=22;
        num[2]=32;
        num[3]=321;

       // System.out.println(num.length);

        //数组的声明  方式二
        int score[]=new int[]{22,33,44,55};
        //score[]=new int[]{22,33,44,55};


        //数组的声明  方式s三
        String names[]={"aa","bb","cc"};
       // names[]={"aa","bb","cc"};

        //遍历数组
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }








    }



}
