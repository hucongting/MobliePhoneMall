package com.ppx.hellomall.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 订单
 * </p>
 *
 * @author hucongting
 * @since 2018-09-01
 */
public class Order_master extends Model<Order_master> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	private String order_id;
    /**
     * 买家名字
     */
	private String buyer_name;
    /**
     * 买家电话
     */
	private String buyer_phone;
    /**
     * 买家地址
     */
	private String buyer_address;
    /**
     * 买家userid
     */
	private String buyer_userid;
    /**
     * 订单总金额
     */
	private BigDecimal order_amount;
    /**
     * 订单状态, 默认为新下单
     */
	private Integer order_status;
    /**
     * 支付状态, 默认未支付
     */
	private Integer pay_status;
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

	
	

	public Order_master() {
		super();
	}

	public Order_master(String order_id, String buyer_name, String buyer_phone, String buyer_address,
			String buyer_userid, BigDecimal order_amount, Integer order_status, Integer pay_status, String created_user,
			Date created_time, String modified_user, Date modified_time) {
		super();
		this.order_id = order_id;
		this.buyer_name = buyer_name;
		this.buyer_phone = buyer_phone;
		this.buyer_address = buyer_address;
		this.buyer_userid = buyer_userid;
		this.order_amount = order_amount;
		this.order_status = order_status;
		this.pay_status = pay_status;
		this.created_user = created_user;
		this.created_time = created_time;
		this.modified_user = modified_user;
		this.modified_time = modified_time;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getBuyer_name() {
		return buyer_name;
	}

	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	public String getBuyer_phone() {
		return buyer_phone;
	}

	public void setBuyer_phone(String buyer_phone) {
		this.buyer_phone = buyer_phone;
	}

	public String getBuyer_address() {
		return buyer_address;
	}

	public void setBuyer_address(String buyer_address) {
		this.buyer_address = buyer_address;
	}

	public String getBuyer_userid() {
		return buyer_userid;
	}

	public void setBuyer_userid(String buyer_userid) {
		this.buyer_userid = buyer_userid;
	}

	public BigDecimal getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(BigDecimal order_amount) {
		this.order_amount = order_amount;
	}

	public Integer getOrder_status() {
		return order_status;
	}

	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}

	public Integer getPay_status() {
		return pay_status;
	}

	public void setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
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
		return this.order_id;
	}

	@Override
	public String toString() {
		return "Order_master [order_id=" + order_id + ", buyer_name=" + buyer_name + ", buyer_phone=" + buyer_phone
				+ ", buyer_address=" + buyer_address + ", buyer_userid=" + buyer_userid + ", order_amount="
				+ order_amount + ", order_status=" + order_status + ", pay_status=" + pay_status + ", created_user="
				+ created_user + ", created_time=" + created_time + ", modified_user=" + modified_user
				+ ", modified_time=" + modified_time + "]";
	}
	
	

}
