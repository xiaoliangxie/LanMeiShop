package org.lanmei.user.dao.mapper;

import java.util.List;
import org.lanmei.user.dao.model.OsUser;

public interface OsUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table os_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table os_user
	 * @mbg.generated
	 */
	int insert(OsUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table os_user
	 * @mbg.generated
	 */
	OsUser selectByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table os_user
	 * @mbg.generated
	 */
	List<OsUser> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table os_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(OsUser record);
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	OsUser selectById(Long  userId);
}