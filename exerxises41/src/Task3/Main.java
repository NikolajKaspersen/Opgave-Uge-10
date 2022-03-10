package Task3;


import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> customers = new ArrayList<>();


        public static void main(String[] args)
    {
        Customer customer1 = new Customer("Nikolaj", "Kaspersen", "Niko7443", 7);
        Customer customer2 = new Customer("Pelle","potato", "pellePotato",98);
        Customer customer3 = new Customer("Chris","Potato", "ChrisPotato", 45);
        Customer customer4 = new Customer("Aleks", "Potato", " AleksPotato",23);
        Customer customer5 = new Customer("tess","potato","tessPotato",2);
        Customer customer6 = new Customer("Tobias", "potato","tobiasPotato",1);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers();
    }
    public static void printCustomers()
    {
        for (Customer c:customers
             ) {
            System.out.println(c);

        }
    }
}