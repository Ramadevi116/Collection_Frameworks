import java.util.*;
class main{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("Rama");
        list.add("Jyothi");
        list.add("Rupesh");
        System.out.println(list);
        Iterator<String> msg=list.iterator();
        while(msg.hasNext()){
            String m=msg.next();
            System.out.println("hi "+m+"! ");
        }
        
        
    }
}