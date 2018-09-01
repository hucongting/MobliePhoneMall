package com.ppx.hellomall.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品详细信息
 * </p>
 *
 * @author hucongting
 * @since 2018-09-01
 */
public class Product_info extends Model<Product_info> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	private String product_id;
    /**
     * 关联品牌的品牌编号
     */
	private Integer brandtype_id;
    /**
     * 商品名称
     */
	private String product_name;
    /**
     * 单价
     */
	private BigDecimal product_price;
    /**
     * 库存
     */
	private Integer product_stock;
    /**
     * 描述
     */
	private String product_description;
    /**
     * 主图片
     */
	private String product_icon;
    /**
     * 商品状态,0正常1下架
     */
	private Integer product_status;
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

	

	public Product_info() {
		super();
	}

	public Product_info(String product_id, Integer brandtype_id, String product_name, BigDecimal product_price,
			Integer product_stock, String product_description, String product_icon, Integer product_status,
			String created_user, Date created_time, String modified_user, Date modified_time) {
		super();
		this.product_id = product_id;
		this.brandtype_id = brandtype_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_stock = product_stock;
		this.product_description = product_description;
		this.product_icon = product_icon;
		this.product_status = product_status;
		this.created_user = created_user;
		this.created_time = created_time;
		this.modified_user = modified_user;
		this.modified_time = modified_time;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public Integer getBrandtype_id() {
		return brandtype_id;
	}

	public void setBrandtype_id(Integer brandtype_id) {
		this.brandtype_id = brandtype_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public BigDecimal getProduct_price() {
		return product_price;
	}

	public void setProduct_price(BigDecimal product_price) {
		this.product_price = product_price;
	}

	public Integer getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(Integer product_stock) {
		this.product_stock = product_stock;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getProduct_icon() {
		return product_icon;
	}

	public void setProduct_icon(String product_icon) {
		this.product_icon = product_icon;
	}

	public Integer getProduct_status() {
		return product_status;
	}

	public void setProduct_status(Integer product_status) {
		this.product_status = product_status;
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
		return this.product_id;
	}

	@Override
	public String toString() {
		return "Product_info [product_id=" + product_id + ", brandtype_id=" + brandtype_id + ", product_name="
				+ product_name + ", product_price=" + product_price + ", product_stock=" + product_stock
				+ ", product_description=" + product_description + ", product_icon=" + product_icon
				+ ", product_status=" + product_status + ", created_user=" + created_user + ", created_time="
				+ created_time + ", modified_user=" + modified_user + ", modified_time=" + modified_time + "]";
	}
	

}
