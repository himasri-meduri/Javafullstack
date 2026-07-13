class Shape{
    void draw(){
        System.out.println("Drawing Circle,Drawing Triangle,Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Circle,Erasing Traiangle,Erasing Square");
    }
    public static void main(String args[]){
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        c.draw();
        t.draw();
        s.draw();
    }
}
    class Circle extends Shape{
        @Override
         void draw(){
        System.out.println("Drawing Circle,Drawing Triangle,Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Circle,Erasing Traiangle,Erasing Square");
    }
    }
    class Triangle extends Shape{
               @Override
         void draw(){
        System.out.println("Drawing Circle,Drawing Triangle,Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Circle,Erasing Traiangle,Erasing Square");
    }
    }
    class Square extends Shape{
               @Override
         void draw(){
        System.out.println("Drawing Circle,Drawing Triangle,Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Circle,Erasing Traiangle,Erasing Square");
    }
    }
