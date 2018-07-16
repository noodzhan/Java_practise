import java.util.*;
class Set{
    public static void main(String []args){
        HashSet <String>s =new HashSet <String> ();
        s.add("你好");
        s.add("你好");
        Iterator<String> iter=s.iterator();
        System.out.println(s.size());
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}