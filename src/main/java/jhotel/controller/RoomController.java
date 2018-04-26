package jhotel.controller;
import jhotel.Hotel;
import jhotel.Room;
import jhotel.DatabaseRoom;
import jhotel.DatabaseHotel;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

public class RoomController
{
    public ArrayList<Room> vacantRooms()
    {
        return DatabaseRoom.getVacantRooms();
    }

    public Room getRoom(int id_hotel, String nomor_kamar)
    {
        return DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
    }
}

