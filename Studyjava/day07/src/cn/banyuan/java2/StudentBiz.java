package cn.banyuan.java2;

public class StudentBiz {
    String names [] =new String[30];

    Student [] stus= new Student[30];

    /*编写增加学生对象的方法*/
    public void addStus(Student stu){
        //遍历数组  判断是否有空位置
        for(int i=0;i<stus.length;i++){
            //判断是否有空位置
            if(stus[i]==null){
                stus[i]=stu;
                break;
            }
        }


    }


    /*显示学生的方法*/
    public void showStus(){
        System.out.println("学生是：");
        for(int i=0;i<names.length;i++){
            if(stus[i]!=null){
                stus[i].show();
            }
        }
    }





    /*编写增加学生的方法*/
    public void addName(String name){
        //遍历数组  判断是否有空位置
        for(int i=0;i<names.length;i++){
            //判断是否有空位置
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }


    }


    /*显示学生的方法*/
    public void showName(){
        System.out.println("学生的姓名是：");
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){
                System.out.print(names[i]+" ");
            }
        }
    }

    /*在用户指定的区间找学生*/
    public boolean  searchName(int start,int end,String name){
        boolean isFind=false;

        for(int i=start-1;i<end-1;i++){
            //使用数组中的名称轮流和用户输入的名字进行对比
            if(names[i].equals(name)){
                isFind=true;
                break;
            }
        }



        return isFind;

    }





}
