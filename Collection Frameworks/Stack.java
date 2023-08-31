import java.util.*;
class main{
    public static void main(String[] args){
        Stack<String> list=new Stack<String>();
        list.add("Rama");
        list.add("Jyothi");
        list.add("Rupesh");
        System.out.println(list);
        for(String msg:list){
            String m="Hii "+msg+"!";
            System.out.println(m);
        }
        
    }
}