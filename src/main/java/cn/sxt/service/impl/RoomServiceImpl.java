package cn.sxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sxt.domain.Room;
import cn.sxt.mapper.RoomMapper;
import cn.sxt.service.RoomService;
import cn.sxt.vo.DataGridView;
import cn.sxt.vo.RoomVo;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomMapper roomMapper;
	
	/**
	 * 加载所有房间数据
	 */
	@Override
	public DataGridView queryAllHotelRoom(RoomVo roomVo) {
		List<Room> list = this.roomMapper.queryAllHotelRooms(roomVo);
		return new DataGridView(list);
	}
	/**
	 * 添加房间
	 * 
	 */
	@Override
	public void addHotelRoom(RoomVo roomVo) {
		this.roomMapper.insertSelective(roomVo);
	}
	/**
	 * 删除房间
	 * 
	 */
	@Override
	public void deleteHotelRoom(RoomVo roomlVo) {
		this.roomMapper.deleteByPrimaryKey(roomlVo.getRoomid());
	}

}
