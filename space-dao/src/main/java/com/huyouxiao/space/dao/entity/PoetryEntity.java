package com.huyouxiao.space.dao.entity;

public class PoetryEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry.dynasty
     *
     * @mbggenerated
     */
    private String dynasty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry.id
     *
     * @return the value of poetry.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry.id
     *
     * @param id the value for poetry.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry.name
     *
     * @return the value of poetry.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry.name
     *
     * @param name the value for poetry.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry.dynasty
     *
     * @return the value of poetry.dynasty
     *
     * @mbggenerated
     */
    public String getDynasty() {
        return dynasty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry.dynasty
     *
     * @param dynasty the value for poetry.dynasty
     *
     * @mbggenerated
     */
    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry.content
     *
     * @return the value of poetry.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry.content
     *
     * @param content the value for poetry.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }
}