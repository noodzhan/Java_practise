import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

class TestNull{
    public static void main(String args[]){
        List<String> ss=new ArrayList<String>();
        ss.add(null);
        ss.add("input");
        Pattern p=Pattern.compile("i");
        Matcher m=p.matcher(""+"input"+"");
        int i=0;
        while(m.find()){
            System.out.println(i++);
            System.out.println(m.group());
            if(ss.contains(null)){
                ss.add(m.group());
            }
        }
        System.out.println(ss.size());
        System.out.println(ss.get(0));
        System.out.println(ss.get(1));
        System.out.println(ss.get(2));


    }
}