package com.huyouxiao.space.dao.entity;

public class UserCredentialEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credential.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credential.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credential.credential_value
     *
     * @mbggenerated
     */
    private String credentialValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credential.credential_type
     *
     * @mbggenerated
     */
    private String credentialType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credential.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credential.salt
     *
     * @mbggenerated
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credential.data_status
     *
     * @mbggenerated
     */
    private String dataStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credential.id
     *
     * @return the value of user_credential.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credential.id
     *
     * @param id the value for user_credential.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credential.user_id
     *
     * @return the value of user_credential.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credential.user_id
     *
     * @param userId the value for user_credential.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credential.credential_value
     *
     * @return the value of user_credential.credential_value
     *
     * @mbggenerated
     */
    public String getCredentialValue() {
        return credentialValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credential.credential_value
     *
     * @param credentialValue the value for user_credential.credential_value
     *
     * @mbggenerated
     */
    public void setCredentialValue(String credentialValue) {
        this.credentialValue = credentialValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credential.credential_type
     *
     * @return the value of user_credential.credential_type
     *
     * @mbggenerated
     */
    public String getCredentialType() {
        return credentialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credential.credential_type
     *
     * @param credentialType the value for user_credential.credential_type
     *
     * @mbggenerated
     */
    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credential.status
     *
     * @return the value of user_credential.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credential.status
     *
     * @param status the value for user_credential.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credential.salt
     *
     * @return the value of user_credential.salt
     *
     * @mbggenerated
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credential.salt
     *
     * @param salt the value for user_credential.salt
     *
     * @mbggenerated
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credential.data_status
     *
     * @return the value of user_credential.data_status
     *
     * @mbggenerated
     */
    public String getDataStatus() {
        return dataStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credential.data_status
     *
     * @param dataStatus the value for user_credential.data_status
     *
     * @mbggenerated
     */
    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }
}