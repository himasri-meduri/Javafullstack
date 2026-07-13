import java.util.StringJoiner;
class Stringjoiner2 {
    public static void main(String args[]) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("gudlavalleru").add("gudivada");
        StringJoiner s2 = new StringJoiner("-");
        s2.add("machilipatnam").add("vijayawada");
        s1.merge(s2);
        System.out.println(s1.toString());
    }
}
