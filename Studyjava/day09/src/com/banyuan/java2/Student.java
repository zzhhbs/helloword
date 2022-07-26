package com.banyuan.java2;

public class Student {
    private int sid;
    private String name;


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }


    /**
     * 判断地址值 是否相同
     * 判断内容是否相同
     * @param obj
     * @return
     */
    public boolean equals(Object obj) {
        /*比较当前类 s1 和 s2的地址值是否相同*/
        if(this == obj){
             return true;
         }

        /*判断内容是否相同
        * instanceof 判断两个是否为同一个类型对象
        *
        * */
        if(obj instanceof  Student){
            /*向下转型*/
            Student student =(Student) obj;
            /*obj  --->s2  比较两个对象的每个属性值是否相同*/
            if(student.sid==this.sid && student.name.equals(this.name)){
                return  true;
            }
        }
        return  false;
    }
}
