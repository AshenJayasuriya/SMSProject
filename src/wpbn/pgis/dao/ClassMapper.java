package wpbn.pgis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wpbn.pgis.entity.Class;
import wpbn.pgis.entity.ClassExample;

public interface ClassMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	long countByExample(ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int deleteByExample(ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int insert(Class record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int insertSelective(Class record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	List<Class> selectByExample(ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	Class selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int updateByPrimaryKeySelective(Class record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class
	 * @mbg.generated  Mon Jun 19 12:53:53 IST 2017
	 */
	int updateByPrimaryKey(Class record);
}