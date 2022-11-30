// insert package name here

public class CheckOut
{
    private int roomNum;
    private String customerFirstName;
    private String customerLastName;

    public CheckOut(int num, String first_name, String last_name)
    {
        roomNum = num;
        customerFirstName = first_name;
        customerLastName = last_name;
    }

    public void getReservation()
    {
        // call retrieveResInfo()
    }

    public Boolean confirmCheckIn()
    {
        return true; // placeholder
        // function will call retrieveResInfo()?
    }
}
