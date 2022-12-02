package mainPackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MakeReservation
{
    String firstname;
    String lastname;
    String address;
    Integer zipcode;
    String payment;
    //String check_in_date;
    MyDate check_in_date;
    MyDate check_out_date;
    //String check_out_date;
    private boolean confAvailability;
    private static final int max = 999999;



     static int confNum;

    public MakeReservation(String firstname, String lastname, String address, Integer zipcode, String payment) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.zipcode = zipcode;
        this.payment = payment;
        //this.check_in_date = check_in_date;
        //this.check_out_date = check_out_date;
        check_in_date = new MyDate();
        check_out_date = new MyDate();
    }


    public void createReservation(/* insert necessary variables*/)
    {
        // call appropriate methods or constructors
    }

    public void setConfNum(int num)
    {
        confNum = num;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }



    public void setCheck_in_date(int month, int day, int year)
    {
        check_in_date.SetDate(month, day, year);
    }

    public MyDate getCheck_in_date()
    {
        return check_in_date;
    }



    public void setCheck_out_date(int month,int day,int year)
    {
//        MyDate date1 = new MyDate(month,day,year);
//        check_out_date = String.valueOf(date1.GetDate());
//        System.out.println(check_out_date);
        check_out_date.SetDate(month, day, year);
    }
    //public String getCheck_out_date()
    public MyDate getCheck_out_date()
    {
        return check_out_date;
    }

   public int setConfNUm(){
       int min = 111111;
       confNum = (int) (Math.random()*(max- min +1)+ min);
       return confNum;
   }

    public int getConfNum() {
        return confNum;
    }

    public static void main(String[] args)
    {

    }

}
