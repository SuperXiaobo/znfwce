package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 face
 * 
 * @author ruoyi
 * @date 2021-03-02
 */
public class Face extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String idtype;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String idnum;

    /** 注册电话号码 */
    @Excel(name = "注册电话号码")
    private String phonenum;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registertime;

    /** 人脸数据 */
    @Excel(name = "人脸数据")
    private String faceid;

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setIdtype(String idtype) 
    {
        this.idtype = idtype;
    }

    public String getIdtype() 
    {
        return idtype;
    }
    public void setIdnum(String idnum) 
    {
        this.idnum = idnum;
    }

    public String getIdnum() 
    {
        return idnum;
    }
    public void setPhonenum(String phonenum) 
    {
        this.phonenum = phonenum;
    }

    public String getPhonenum() 
    {
        return phonenum;
    }
    public void setRegistertime(Date registertime) 
    {
        this.registertime = registertime;
    }

    public Date getRegistertime() 
    {
        return registertime;
    }
    public void setFaceid(String faceid) 
    {
        this.faceid = faceid;
    }

    public String getFaceid() 
    {
        return faceid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("name", getName())
            .append("sex", getSex())
            .append("idtype", getIdtype())
            .append("idnum", getIdnum())
            .append("phonenum", getPhonenum())
            .append("registertime", getRegistertime())
            .append("faceid", getFaceid())
            .toString();
    }
}
