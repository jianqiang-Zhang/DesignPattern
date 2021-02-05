package Prototype;

import java.util.HashMap;

public class Shape implements Cloneable{
    String name;
    HashMap<Integer,String> hashMap = new HashMap<>();
    public void setName(String n){
        name = n;
        hashMap.put(1,name);
    }
    public String getName(){
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object clone1() throws CloneNotSupportedException {
        Shape shape1 =null;
        try{
            shape1 = (Shape) super.clone();
            shape1.hashMap=new HashMap<>();

        }catch (CloneNotSupportedException e){
            e.getMessage();
        }
        return shape1;
    }


    public void printAddress(){
        System.out.println("name："+name+"   hashMap："+hashMap.get(1));
    }
}
