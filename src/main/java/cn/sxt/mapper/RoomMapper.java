package cn.sxt.mapper;

import java.util.List;

import cn.sxt.domain.Room;

public interface RoomMapper {
    int deleteByPrimaryKey(Integer roomid);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer roomid);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
    /**
     * 查询所有酒店所有房间
     */
    List<Room> queryAllHotelRooms(Room room);
}