package mainPackage;// insert package name here

public class Reservation
{
    static String firstname;
    static String lastname;
    static String address;
    static Integer zipcode;
    static String payment;
    static String check_in_date;
    static String check_out_date;
    static Integer confirmation_num;

    public Reservation() {

    }

    public static String getFirstname() {
        return firstname;
    }

    public static String getLastname() {
        return lastname;
    }

    public static String getAddress() {
        return address;
    }

    public static Integer getZipcode() {
        return zipcode;
    }

    public static String getPayment() {
        return payment;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public String getCheck_out_date() {
        return check_out_date;
    }

    public Integer getConfirmation_num() {
        return confirmation_num;
    }




}
