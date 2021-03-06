package com.heaven.dao;

import com.heaven.bean.GuidType;
import com.heaven.bean.GuidTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuidTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    long countByExample(GuidTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int deleteByExample(GuidTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int insert(GuidType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int insertSelective(GuidType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    List<GuidType> selectByExample(GuidTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    GuidType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") GuidType record, @Param("example") GuidTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int updateByExample(@Param("record") GuidType record, @Param("example") GuidTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int updateByPrimaryKeySelective(GuidType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guid_type
     *
     * @mbg.generated Wed May 08 21:04:08 CST 2019
     */
    int updateByPrimaryKey(GuidType record);
}