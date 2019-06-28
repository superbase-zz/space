package com.huyouxiao.space.dao.entity;

public class PoetryFieldEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry_field.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry_field.poetry_id
     *
     * @mbggenerated
     */
    private Long poetryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry_field.field
     *
     * @mbggenerated
     */
    private String field;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry_field.pinyin
     *
     * @mbggenerated
     */
    private String pinyin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poetry_field.pinyin_abridge
     *
     * @mbggenerated
     */
    private String pinyinAbridge;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry_field.id
     *
     * @return the value of poetry_field.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry_field.id
     *
     * @param id the value for poetry_field.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry_field.poetry_id
     *
     * @return the value of poetry_field.poetry_id
     *
     * @mbggenerated
     */
    public Long getPoetryId() {
        return poetryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry_field.poetry_id
     *
     * @param poetryId the value for poetry_field.poetry_id
     *
     * @mbggenerated
     */
    public void setPoetryId(Long poetryId) {
        this.poetryId = poetryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry_field.field
     *
     * @return the value of poetry_field.field
     *
     * @mbggenerated
     */
    public String getField() {
        return field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry_field.field
     *
     * @param field the value for poetry_field.field
     *
     * @mbggenerated
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry_field.pinyin
     *
     * @return the value of poetry_field.pinyin
     *
     * @mbggenerated
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry_field.pinyin
     *
     * @param pinyin the value for poetry_field.pinyin
     *
     * @mbggenerated
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poetry_field.pinyin_abridge
     *
     * @return the value of poetry_field.pinyin_abridge
     *
     * @mbggenerated
     */
    public String getPinyinAbridge() {
        return pinyinAbridge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poetry_field.pinyin_abridge
     *
     * @param pinyinAbridge the value for poetry_field.pinyin_abridge
     *
     * @mbggenerated
     */
    public void setPinyinAbridge(String pinyinAbridge) {
        this.pinyinAbridge = pinyinAbridge;
    }
}