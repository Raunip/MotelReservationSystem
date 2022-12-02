package mainPackage;

/**
 *  This class overrides the setters of MakeReservation to modify the information
 */
public class ModifyReservation extends MakeReservation
{

    /**
     * Modifies the customer information
     * @param firstname first name of customer
     * @param lastname  last name  of customer
     * @param address   address of customer
     * @param zipcode    zip code of customer
     * @param payment   payment method of customer
     */
    public ModifyReservation(String firstname, String lastname, String address, Integer zipcode, String payment,int month,int day,int year,int checkout_month,int checkout_day,int checkout_year,Boolean wantConfNum) {
        super(firstname, lastname, address, zipcode, payment,month, day, year, checkout_month,checkout_day,checkout_year,wantConfNum);
    }

    /**
     * changes the first name
     * @param firstname first name of customer
     */
    @Override
    public void setFirstname(String firstname) {
        super.setFirstname(firstname);
    }

    /**
     * changes the last name
     * @param lastname last name  of customer
     */
    @Override
    public void setLastname(String lastname) {
        super.setLastname(lastname);
    }

    /**
     *changes the address
     * @param address address of customer
     */
    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    /**
     * changes the zipcode
     * @param zipcode zip code of customer
     */
    @Override
    public void setZipcode(Integer zipcode) {
        super.setZipcode(zipcode);
    }

    /**
     * changes the payment method
     * @param payment payment method of customer cash or credit
     */
    @Override
    public void setPayment(String payment) {
        super.setPayment(payment);
    }

    /**
     * changes check in date
     * @param month month
     * @param day   day
     * @param year  year
     */
    @Override
    public void setCheck_in_date(int month, int day, int year) {
        super.setCheck_in_date(month, day, year);
        MyDate d = new MyDate(month,day,year);
        check_in_date = d.GetMonth()+"/"+d.GetDay()+"/"+d.GetYear();
    }

    /**
     * changes check out date
     * @param month month
     * @param day day
     * @param year year
     */
    @Override
    public void setCheck_out_date(int month, int day, int year) {
        super.setCheck_out_date(month, day, year);
    }
}
