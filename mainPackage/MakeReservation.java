package mainPackage;

/**
 *
 */

public class MakeReservation extends Reservation {

    /**
     *
     * @param firstname
     * @param lastname
     * @param room_type
     * @param room_rate
     * @param payment
     * @param month
     * @param day
     * @param year
     * @param checkout_month
     * @param checkout_day
     * @param checkout_year
     * @param wantConfNum
     */
    public MakeReservation(String firstname, String lastname, String room_type, Integer room_rate, String payment, int month, int day, int year, int checkout_month, int checkout_day, int checkout_year, Boolean wantConfNum) {
        super.firstname = firstname;
        super.lastname = lastname;
        super.room_type = room_type;
        super.room_rate = room_rate;
        super.payment = payment;
        MyDate date1 = new MyDate(month, day, year);
        super.check_in_date = date1.GetMonth() + "/" + date1.GetDay() + "/" + date1.GetYear();
        MyDate date2 = new MyDate(checkout_month, checkout_day, checkout_year);
        super.check_out_date = date2.GetMonth() + "/" + date2.GetDay() + "/" + date2.GetYear();
        if (wantConfNum == true){
            int min = 111111;
            int max = 999999;
            super.confirmation_num = (int) (Math.random() * (max - min + 1) + min);
        }


    }


    public void setFirstname(String str) {
        Reservation r = new Reservation();
        r.firstname = str;
        //super.firstname = firstname;
    }

    public void setLastname(String str1) {
        Reservation r = new Reservation();
        r.firstname = str1;
        //super.lastname = lastname;
    }


    public void setRoomType(String str2) {
        Reservation r = new Reservation();
        r.room_type = str2;
        //super.address = address;
    }


    public void setRoomRate(Integer int1) {
        Reservation r = new Reservation();
        r.room_rate = int1;
        //super.zipcode = zipcode;
    }


    public void setPayment(String str3) {
        Reservation r = new Reservation();
        r.payment = str3;
        //super.payment = payment;
    }


    public void setCheck_in_date(int month, int day, int year) {
        MyDate d = new MyDate(month, day, year);
        Reservation r = new Reservation();
        r.check_in_date = d.GetMonth() + "/" + d.GetDay() + "/" + d.GetYear();
    }


    public void setCheck_out_date(int month, int day, int year) {
        MyDate d1 = new MyDate(month, day, year);
        Reservation r = new Reservation();
        r.check_out_date = d1.GetMonth() + "/" + d1.GetDay() + "/" + d1.GetYear();
    }

    public void setConformationNum() {
        int min = 111111;
        int max = 999999;
        Reservation r = new Reservation();
        r.confirmation_num = (int) (Math.random() * (max - min + 1) + min);
    }



}
