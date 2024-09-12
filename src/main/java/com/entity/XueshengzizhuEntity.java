package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 资助记录
 *
 * @author 
 * @email
 */
@TableName("xueshengzizhu")
public class XueshengzizhuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengzizhuEntity() {

	}

	public XueshengzizhuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 标题
     */
    @TableField(value = "xueshengzizhu_name")

    private String xueshengzizhuName;


    /**
     * 资助金额
     */
    @TableField(value = "xueshengzizhu_jine")

    private Double xueshengzizhuJine;


    /**
     * 详情
     */
    @TableField(value = "xueshengzizhu_text")

    private String xueshengzizhuText;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：标题
	 */
    public String getXueshengzizhuName() {
        return xueshengzizhuName;
    }


    /**
	 * 获取：标题
	 */

    public void setXueshengzizhuName(String xueshengzizhuName) {
        this.xueshengzizhuName = xueshengzizhuName;
    }
    /**
	 * 设置：资助金额
	 */
    public Double getXueshengzizhuJine() {
        return xueshengzizhuJine;
    }


    /**
	 * 获取：资助金额
	 */

    public void setXueshengzizhuJine(Double xueshengzizhuJine) {
        this.xueshengzizhuJine = xueshengzizhuJine;
    }
    /**
	 * 设置：详情
	 */
    public String getXueshengzizhuText() {
        return xueshengzizhuText;
    }


    /**
	 * 获取：详情
	 */

    public void setXueshengzizhuText(String xueshengzizhuText) {
        this.xueshengzizhuText = xueshengzizhuText;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xueshengzizhu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xueshengzizhuName=" + xueshengzizhuName +
            ", xueshengzizhuJine=" + xueshengzizhuJine +
            ", xueshengzizhuText=" + xueshengzizhuText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
