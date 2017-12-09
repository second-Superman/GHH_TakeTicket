package cn.ucai.server.dao;

import java.util.List;

import cn.ucai.entity.User;

public interface BaseDao<T> {
	/**
	 * 查询列表数据
	 * @param user
	 * @return
	 */
	public  List<T> selectList(T t);
	/**
	 * 根据ID查询一条数据
	 * @return
	 */
	public T selectById(Integer id);
	/**
	 * 添加一条数据
	 * @param user
	 * @return
	 */
	public boolean insert(T t);
	/**
	 * 修改一条数据
	 * @param user
	 * @return
	 */
	public boolean update(T t);
	/**
	 * 根据ID删除一条数据
	 * @param user
	 * @return
	 */
	public boolean deleteById(Integer id);
}
