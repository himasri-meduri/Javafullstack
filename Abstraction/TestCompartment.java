abstract class Compartment{
    public abstract String notice();
}
    class Firstclass extends Compartment{
        @Override
        public String notice(){
         return "Notice:This is first class";   
        }
    } 
    class Ladies extends Compartment{
        @Override
        public String notice(){
         return "Notice:This is ladies class";   
    } 
    }
    class General extends Compartment{
        @Override
        public String notice(){
         return "Notice:This is general class";   
    } 
    }
    class Luggage extends Compartment{
        @Override
        public String notice(){
         return "Notice:This is luggage class";   
    }    
    }

class TestCompartment{
    public static void main(String args[]){
        Compartment a[]=new Compartment[10];
        a[0]=new Luggage();
        a[1]=new Ladies();
        a[2]=new General();
        a[3]=new Firstclass();
        for(int i=0;i<a.length;i++){
            if (a[i] != null) {
        System.out.println(a[i].notice());
        }
    }

    }
}