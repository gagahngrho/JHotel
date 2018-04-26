package jhotel.controller;
import jhotel.Hotel;
import jhotel.DatabaseHotel;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class HotelController
{
    public ArrayList<Hotel> hotelList()
    {
        return DatabaseHotel.getHotelDatabase();
    }

    public Hotel getHotel(int id_hotel)
    {
        return DatabaseHotel.getHotel(id_hotel);
    }
}

