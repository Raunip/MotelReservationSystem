package mainPackage;// insert package name here

public class FindAvailableRoom
{
    private int availRoomNum;
    private String availRoomType;

    public FindAvailableRoom(int room_num, String room_type)
    {
        availRoomNum = room_num;
        availRoomType = room_type;
    }

    public int getAvailRoomNum()
    {
        return availRoomNum;
    }

    public String getAvailRoomType()
    {
        return availRoomType;
    }
}
