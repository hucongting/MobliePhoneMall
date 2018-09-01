package com.ppx.hellomall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品分类
 * </p>
 *
 * @author hucongting
 * @since 2018-09-01
 */
public class Product_category extends Model<Product_category> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 类目名字
     */
	private String category_name;
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


	
	
	public Product_category() {
		super();
	}

	public Product_category(Integer id, String category_name, String created_user, Date created_time,
			String modified_user, Date modified_time) {
		super();
		this.id = id;
		this.category_name = category_name;
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

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
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
		return "Product_category [id=" + id + ", category_name=" + category_name + ", created_user=" + created_user
				+ ", created_time=" + created_time + ", modified_user=" + modified_user + ", modified_time="
				+ modified_time + "]";
	}

	
	
}
