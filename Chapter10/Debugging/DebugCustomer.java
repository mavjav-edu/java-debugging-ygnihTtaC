public class DebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public DebugCustomer() {

       idNumber = 0;
       name = "";
       creditLimit = 0;
    }

    public DebugCustomer(int id, String name, double credit)
    {
       idNumber = id;
       this.name = name;
       creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber + " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
