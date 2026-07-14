package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
class Test{
    public static void main(String[] args) {
        System.out.println("Veena");
    Veena v=new Veena();
    v.play();
    System.out.println("saxophone");
    Saxophone s=new Saxophone();
    s.play();
    System.out.println("polymorphism");
    Playable p;
    p = v; 
     p.play();
     p=s;
     p.play();
}
}