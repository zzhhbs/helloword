package cn.banyuan.demo1;

public class Cou {
    private Course course;


    public Course getCourse(){
        return course;
    }

    /*public void setCourse(int i){
        if(i==1)
            this.course=Course.打基础;
        else if(i==2)
            this.course=Course.可以胜任JAVA程序开发;
        else
            this.course=Course.可以胜任企业级Java开发;
    }*/

    public void setCourse(Course c){
        switch (c){
            case U1:
                System.out.println(" 打基础");
               break;
            case U2:
                System.out.println("可以胜任JAVA程序开发");
                break;
            case U3:
                System.out.println("可以胜任企业级Java开发");
                break;
        }
    }


    public static void main(String[] args) {
        Cou cou = new Cou();
        cou.setCourse(Course.U1);
        /*for(int i=1;i<=3;i++){
            cou.setCourse(i);
            System.out.println("第"+i+"单元"+cou.getCourse());
        }*/
    }
}
