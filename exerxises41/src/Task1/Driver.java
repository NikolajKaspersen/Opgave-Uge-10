package Task1;

public class Driver {
    private String Name;
    private int Age;

    public Driver(String name,int Age)
    {
        this.Name = name;
        this.Age = Age;
    }
    @Override
    public String toString(){
        return "Is driven by: \nname "+ Name +"\nage "+ Age+"\n";

    }



}
