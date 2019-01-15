package cn.sxt.service;

import cn.sxt.vo.DataGridView;
import cn.sxt.vo.RoomVo;

public interface RoomService {
	
	/**
	 * 查询所有酒店所有房间
	 */
	DataGridView queryAllHotelRoom(RoomVo roomVo);
	/**
	 * 添加房间
	 * 
	 */
	void addHotelRoom(RoomVo roomVo);
	/**
	 * 删除房间
	 * 
	 */
	void deleteHotelRoom(RoomVo roomlVo);

}
