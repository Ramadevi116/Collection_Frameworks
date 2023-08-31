import java.util.*;
class main{
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add("Rama");
        list.add("Jyothi");
        list.add("Rupesh");
        System.out.println(list);
        ListIterator<String> msg=list.listIterator();
        while(msg.hasNext()){
            String m=msg.next();
            System.out.println("hi "+m+"! ");
        
        }
        
        
    }
}