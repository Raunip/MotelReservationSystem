package mainPackage;

public class CustomerInfo
{
    private String Firstname;
    private String Lastname;
    private String RoomType;
    private int RoomRate;
    private String Payment_Type;
    private String Check_In_Date;
    private String Check_Out_Date;
    private int Confirmation_Number;

    public CustomerInfo(String firstname, String lastname, String roomType, Integer roomRate, String paymentType, String check_In_Date, String check_Out_Date, Integer confirmation_Number) {
        Firstname = firstname;
        Lastname = lastname;
        RoomType = roomType;
        RoomRate = roomRate;
        Payment_Type = paymentType;
        Check_In_Date = check_In_Date;
        Check_Out_Date = check_Out_Date;
        Confirmation_Number = confirmation_Number;
    }





    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public Integer getRoomRate() {
        return RoomRate;
    }

    public void setRoomRate(Integer roomRate) {
        RoomRate = roomRate;
    }

    public String getPayment_Type() {
        return Payment_Type;
    }

    public void setPayment_Type(String payment_Type) {
        Payment_Type = payment_Type;
    }

    public String getCheck_In_Date() {
        return Check_In_Date;
    }

    public void setCheck_In_Date(String check_In_Date) {
        Check_In_Date = check_In_Date;
    }

    public String getCheck_Out_Date() {
        return Check_Out_Date;
    }

    public void setCheck_Out_Date(String check_Out_Date) {
        Check_Out_Date = check_Out_Date;
    }

    public Integer getConfirmation_Number() {
        return Confirmation_Number;
    }

    public void setConfirmation_Number(Integer confirmation_Number) {
        Confirmation_Number = confirmation_Number;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", RoomType='" + RoomType + '\'' +
                ", RoomRate=" + RoomRate +
                ", Payment_Type='" + Payment_Type + '\'' +
                ", Check_In_Date='" + Check_In_Date + '\'' +
                ", Check_Out_Date='" + Check_Out_Date + '\'' +
                ", Confirmation_Number=" + Confirmation_Number +
                '}';
    }
}
