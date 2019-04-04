package service;

import model.dao.DaoFactory;
import model.dao.RoomDao;
import model.entity.Room;

import java.util.List;

public class RoomService {

    DaoFactory daoFactory = DaoFactory.getInstance();

    public List<Room> getAllRooms(){
        try (RoomDao dao = daoFactory.createRoomDao()) {
            return dao.findAll();
        }
    }
}
