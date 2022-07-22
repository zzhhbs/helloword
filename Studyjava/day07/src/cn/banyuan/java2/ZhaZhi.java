package cn.banyuan.java2;

/**
 * 在调用方法的时候，实参个个数顺序和数据类型都必须要和形参保持一致。
 */
public class ZhaZhi {

    /*榨汁机方法*/
    public String zha(String fruit,int num){
        String fru=fruit+"汁"+num+"杯";
        return fru;
    }

    public static void main(String[] args) {
        ZhaZhi z=new ZhaZhi();
        String zhi=z.zha("桃子",2);
        System.out.println(zhi);
    }

}
