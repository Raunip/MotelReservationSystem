package mainPackage;// insert package name here

public class Room
{
    private String roomType;
    private int roomNumber;

    public Room (String type, int num)
    {
        roomType = type;
        roomNumber = num;
    }
    
    public String getRoomType()
    {
        return roomType;
    }
    
    public void setRoomType(String type)
    {
        roomType = type;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int num)
    {
        roomNumber = num;
    }
}
