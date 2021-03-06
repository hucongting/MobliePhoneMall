package com.ppx.hellomall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 收货地址
 * </p>
 *
 * @author hucongting
 * @since 2018-09-01
 */
public class Address extends Model<Address> implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 绑定用户id
     */
	private Integer uid;
    /**
     * 用户名
     */
	private String recv_name;
    /**
     * 省份
     */
	private String recv_province;
    /**
     * 城市
     */
	private String recv_city;
    /**
     * 区/县
     */
	private String recv_area;
    /**
     * 详细地址
     */
	private String recv_address;
    /**
     * 省市县
     */
	private String recv_district;
    /**
     * 收货电话
     */
	private String recv_phone;
    /**
     * 邮政编码
     */
	private String recv_zip;
    /**
     * 选择地址
     */
	private String tag;
    /**
     * 默认地址
     */
	private Integer is_default;
    /**
     * 创建
     */
	private String created_user;
    /**
     * 创建时间 
     */
	private Date created_time;
    /**
     * 修改人
     */
	private String modified_user;
    /**
     * 修改时间
     */
	private Date modified_time;

	

	public Address() {
		super();
	}

	public Address(Integer id, Integer uid, String recv_name, String recv_province, String recv_city, String recv_area,
			String recv_address, String recv_district, String recv_phone, String recv_zip, String tag,
			Integer is_default, String created_user, Date created_time, String modified_user, Date modified_time) {
		super();
		this.id = id;
		this.uid = uid;
		this.recv_name = recv_name;
		this.recv_province = recv_province;
		this.recv_city = recv_city;
		this.recv_area = recv_area;
		this.recv_address = recv_address;
		this.recv_district = recv_district;
		this.recv_phone = recv_phone;
		this.recv_zip = recv_zip;
		this.tag = tag;
		this.is_default = is_default;
		this.created_user = created_user;
		this.created_time = created_time;
		this.modified_user = modified_user;
		this.modified_time = modified_time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getRecv_name() {
		return recv_name;
	}

	public void setRecv_name(String recv_name) {
		this.recv_name = recv_name;
	}

	public String getRecv_province() {
		return recv_province;
	}

	public void setRecv_province(String recv_province) {
		this.recv_province = recv_province;
	}

	public String getRecv_city() {
		return recv_city;
	}

	public void setRecv_city(String recv_city) {
		this.recv_city = recv_city;
	}

	public String getRecv_area() {
		return recv_area;
	}

	public void setRecv_area(String recv_area) {
		this.recv_area = recv_area;
	}

	public String getRecv_address() {
		return recv_address;
	}

	public void setRecv_address(String recv_address) {
		this.recv_address = recv_address;
	}

	public String getRecv_district() {
		return recv_district;
	}

	public void setRecv_district(String recv_district) {
		this.recv_district = recv_district;
	}

	public String getRecv_phone() {
		return recv_phone;
	}

	public void setRecv_phone(String recv_phone) {
		this.recv_phone = recv_phone;
	}

	public String getRecv_zip() {
		return recv_zip;
	}

	public void setRecv_zip(String recv_zip) {
		this.recv_zip = recv_zip;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getIs_default() {
		return is_default;
	}

	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}

	public String getCreated_user() {
		return created_user;
	}

	public void setCreated_user(String created_user) {
		this.created_user = created_user;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public String getModified_user() {
		return modified_user;
	}

	public void setModified_user(String modified_user) {
		this.modified_user = modified_user;
	}

	public Date getModified_time() {
		return modified_time;
	}

	public void setModified_time(Date modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", uid=" + uid + ", recv_name=" + recv_name + ", recv_province=" + recv_province
				+ ", recv_city=" + recv_city + ", recv_area=" + recv_area + ", recv_address=" + recv_address
				+ ", recv_district=" + recv_district + ", recv_phone=" + recv_phone + ", recv_zip=" + recv_zip
				+ ", tag=" + tag + ", is_default=" + is_default + ", created_user=" + created_user + ", created_time="
				+ created_time + ", modified_user=" + modified_user + ", modified_time=" + modified_time + "]";
	}
	
	

}
