class Employee extends Person{
    private double annualsalary;
    private int year;
    private String insurance;
    Employee(String n,double a,int y,String i){
        super(n);
        annualsalary=a;
        year=y;
        insurance=i;
    }
    public double getannualsalary(){
        return annualsalary;
    }
    public void setannualsalary(double a){
        annualsalary=a;
    }
    public int getyear(){
        return year;
    }
    public void setyear(int y){
        year=y;
    }
    public String getinsurance(){
        return insurance;
    }
    public void setinsurance(String i){
        insurance=i;
    }
}