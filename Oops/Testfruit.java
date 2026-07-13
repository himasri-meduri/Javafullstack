class Fruit {
    protected String name;
    protected String taste;
    protected double size;
    Fruit(String n, String t, double s) {
        name = n;
        taste = t;
        size = s;
    }
    void eat() {
        System.out.println("name: " + name + ", taste: " + taste + ", size: " + size);
    }
}
class Apple extends Fruit {
    Apple(String n, String t, double s) {
        super(n, t, s);
    }
    @Override
    void eat() {
        System.out.println("name: " + name + ", taste: " + taste + ", size: " + size);
    }
}
class Testfruit {
    public static void main(String args[]) {
        Fruit f = new Fruit("apple", "good", 6);
        f.eat();
        Apple a = new Apple("Ooty Apple", "Sweet", 4.5);
        a.eat();
    }
}
