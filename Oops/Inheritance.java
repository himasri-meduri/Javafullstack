class Animal{
    void eat(){
        System.out.println("I eat");
    }
    void sleep(){
        System.out.println("I sleep");
    }
}
 class Bird extends Animal{
        @Override
         void eat(){
        System.out.println("I eat");
    }
        @Override
    void sleep(){
        System.out.println("I sleep");
    }
        void fly(){
            System.out.println("I want to fly");
        }
    public static void main(String args[]){
        Animal a=new Animal();
        a.eat();
        a.sleep();
        Bird b=new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
 }
   
    