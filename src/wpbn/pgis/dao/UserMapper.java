package wpbn.pgis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import wpbn.pgis.entity.User;
import wpbn.pgis.entity.UserExample;

public interface UserMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	long countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	User selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Mon Jun 19 12:53:52 IST 2017
	 */
	int updateByPrimaryKey(User record);

	@Select("SELECT * FROM user WHERE USERNAME =#{uname} AND PASSWORD=#{pword}")
    @ResultMap(value =    "BaseResultMap")
    User findByUsernameAndPassword(@Param("uname") String username, @Param("pword") String password);

	
}