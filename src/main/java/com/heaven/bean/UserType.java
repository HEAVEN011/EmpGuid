package com.heaven.bean;

public class UserType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type.id
     *
     * @mbg.generated Sat Apr 13 00:37:32 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type.user_type
     *
     * @mbg.generated Sat Apr 13 00:37:32 CST 2019
     */
    private String userType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type.id
     *
     * @return the value of user_type.id
     *
     * @mbg.generated Sat Apr 13 00:37:32 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type.id
     *
     * @param id the value for user_type.id
     *
     * @mbg.generated Sat Apr 13 00:37:32 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type.user_type
     *
     * @return the value of user_type.user_type
     *
     * @mbg.generated Sat Apr 13 00:37:32 CST 2019
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type.user_type
     *
     * @param userType the value for user_type.user_type
     *
     * @mbg.generated Sat Apr 13 00:37:32 CST 2019
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}