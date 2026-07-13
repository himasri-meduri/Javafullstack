import java.util.StringJoiner;
import java.util.ArrayList;
class Concatenate {
    public static void main(String args[]) {
        ArrayList <String>n=new ArrayList<>();
        n.add("hima");
        n.add("sri");
        n.add("sirisha");
       StringJoiner sj=new StringJoiner(", ", "{","}");
       for(String names:n){
        sj.add(names);
       }
        System.out.println(sj.toString());
       
    }
}