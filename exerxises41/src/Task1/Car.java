package Task1;


public class Car {
    private String Make;
    private String Model;
    private  int Year;
    private String BodyStyle;
    private String Driver;



    public Car(String Make, String Model , int Year, String BodyStyle)
    {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.BodyStyle = BodyStyle;

    }
    public String getDriver()
    {
        return Driver;
    }
    public void setDriver(String newDriver)
    {
        this.Driver = newDriver;
    }
    @Override
    public String toString(){
        return "make: "+ Make + "\nModel: " + Model + " \n(Year), " +Year+ "\nBodyStyle:  " +BodyStyle + "\n"+Driver;

    }

}
