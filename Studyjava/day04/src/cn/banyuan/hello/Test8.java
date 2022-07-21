package cn.banyuan.hello;

public class Test8 {
    public static void main(String[] args) {
        int [][]list={{1,2,3,4},{2,3,4},{3,4,5}};

        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                System.out.print(list[i][j]+" ");
            }
        }
    }
}
