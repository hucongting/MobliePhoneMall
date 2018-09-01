package com.ppx.hellomall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品顶级分类
 * </p>
 *
 * @author hucongting
 * @since 2018-09-01
 */
public class Product_brand extends Model<Product_brand> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="brand_id", type= IdType.AUTO)
	private Integer brand_id;
    /**
     * 关联类型的类目编号
     */
	private Integer category_id;
    /**
     * 品牌名字
     */
	private String brand_name;
    /**
     * 品牌编号
     */
	private Integer brandtype_id;
    /**
     * 创建人
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


	
	public Product_brand() {
		super();
	}

	public Product_brand(Integer brand_id, Integer category_id, String brand_name, Integer brandtype_id,
			String created_user, Date created_time, String modified_user, Date modified_time) {
		super();
		this.brand_id = brand_id;
		this.category_id = category_id;
		this.brand_name = brand_name;
		this.brandtype_id = brandtype_id;
		this.created_user = created_user;
		this.created_time = created_time;
		this.modified_user = modified_user;
		this.modified_time = modified_time;
	}

	public Integer getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public Integer getBrandtype_id() {
		return brandtype_id;
	}

	public void setBrandtype_id(Integer brandtype_id) {
		this.brandtype_id = brandtype_id;
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
		return this.brand_id;
	}

	@Override
	public String toString() {
		return "Product_brand [brand_id=" + brand_id + ", category_id=" + category_id + ", brand_name=" + brand_name
				+ ", brandtype_id=" + brandtype_id + ", created_user=" + created_user + ", created_time=" + created_time
				+ ", modified_user=" + modified_user + ", modified_time=" + modified_time + "]";
	}
	
	

}
