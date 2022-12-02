package mainPackage;// insert package name here

public class CustomerInfo
{
    private String Firstname;
    private String Lastname;
    private String Address;
    private String paymentType;

    public CustomerInfo(String fname, String lname, String address, String type)
    {
        Firstname = fname;
        Lastname = lname;
        Address = address;
        paymentType = type;
    }

    public String getFirstName()
    {
        return Firstname;
    }

    public void setFirstName(String name)
    {
        Firstname = name;
    }

    public String getLastName()
    {
        return Lastname;
    }

    public void setLastName(String name)
    {
        Lastname = name;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }

    public String getPaymentType()
    {
        return paymentType;
    }

    public void setPaymentType(String type)
    {
        paymentType = type;
    }
}
