import java.util.*;
class main{
    public static void main(String[] args){
        Vector<String> list=new Vector<String>();
        list.add("Rama");
        list.add("Jyothi");
        list.add("Rupesh");
        System.out.println(list);
        Enumeration<String> msg=list.elements();
        if(msg.hasMoreElements()){
            String m="Good mrng "+msg.nextElement()+"!";
            System.out.println(m);
        }
        
        
    }
}