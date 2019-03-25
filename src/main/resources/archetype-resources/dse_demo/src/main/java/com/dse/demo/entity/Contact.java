package com.dse.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author subiao_zhou
 * @since 2019-02-21
 */
@TableName("T_SYS_CONTACT")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 所属用户
     */
    private String owner;

    /**
     * 名称
     */
    private String name;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 所属组
     */
    private String contactGroup;

    /**
     * 数据类型（2:联系人、1:组）
     */
    private Double contactType;

    /**
     * 排序
     */
    private Double orderIndex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }
    public Double getContactType() {
        return contactType;
    }

    public void setContactType(Double contactType) {
        this.contactType = contactType;
    }
    public Double getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Double orderIndex) {
        this.orderIndex = orderIndex;
    }

    @Override
    public String toString() {
        return "Contact{" +
        "id=" + id +
        ", owner=" + owner +
        ", name=" + name +
        ", mobile=" + mobile +
        ", contactGroup=" + contactGroup +
        ", contactType=" + contactType +
        ", orderIndex=" + orderIndex +
        "}";
    }
}
