package mainPackage;

import java.util.LinkedList;

public class ReservationManager
{


    private LinkedList<Object> reservation_info = new LinkedList<>();


    public void setReservation_info(MakeReservation makeReservation) {
        Reservation r = new Reservation();
        reservation_info.add(r.getFirstname());
        reservation_info.add(r.getLastname());
        reservation_info.add(r.getAddress());
        reservation_info.add(r.getZipcode());
        reservation_info.add(r.getPayment());
        reservation_info.add(r.getCheck_in_date());
        reservation_info.add(r.getCheck_out_date());
        reservation_info.add(r.getConfirmation_num());



    }


    public LinkedList<Object> getReservation_info() {
        return reservation_info;
    }
}
