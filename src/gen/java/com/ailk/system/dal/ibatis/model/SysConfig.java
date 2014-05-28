package com.ailk.system.dal.ibatis.model;

import java.sql.Timestamp;

public class SysConfig extends SysConfigKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.CFG_VALUE
     *
     * @mbggenerated
     */
    private String cfgValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.CFG_COMMENT
     *
     * @mbggenerated
     */
    private String cfgComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.UPDATE_FLAG
     *
     * @mbggenerated
     */
    private String updateFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Timestamp updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.CFG_VALUE
     *
     * @return the value of sys_config.CFG_VALUE
     *
     * @mbggenerated
     */
    public String getCfgValue() {
        return cfgValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.CFG_VALUE
     *
     * @param cfgValue the value for sys_config.CFG_VALUE
     *
     * @mbggenerated
     */
    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue == null ? null : cfgValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.CFG_COMMENT
     *
     * @return the value of sys_config.CFG_COMMENT
     *
     * @mbggenerated
     */
    public String getCfgComment() {
        return cfgComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.CFG_COMMENT
     *
     * @param cfgComment the value for sys_config.CFG_COMMENT
     *
     * @mbggenerated
     */
    public void setCfgComment(String cfgComment) {
        this.cfgComment = cfgComment == null ? null : cfgComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.UPDATE_FLAG
     *
     * @return the value of sys_config.UPDATE_FLAG
     *
     * @mbggenerated
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.UPDATE_FLAG
     *
     * @param updateFlag the value for sys_config.UPDATE_FLAG
     *
     * @mbggenerated
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag == null ? null : updateFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.UPDATE_TIME
     *
     * @return the value of sys_config.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.UPDATE_TIME
     *
     * @param updateTime the value for sys_config.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}