package com.ppx.hellomall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 测试类 图书类型
 * </p>
 *
 * @author hucongting
 * @since 2018-08-31
 */
public class Booktype extends Model<Booktype> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 图书类型名称
     */
	private String typename;
    /**
     * 类型描述
     */
	private String bookdesc;

	
	/**
	 * 存储子表，为了多表联查
	 */
	private List<Bookinfo> bookInfoList;
	
	
	
	public List<Bookinfo> getBookInfoList() {
		return bookInfoList;
	}

	public void setBookInfoList(List<Bookinfo> bookInfoList) {
		this.bookInfoList = bookInfoList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getBookdesc() {
		return bookdesc;
	}

	public void setBookdesc(String bookdesc) {
		this.bookdesc = bookdesc;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}
	
	public Booktype() {
		super();
	}

	public Booktype(Integer id, String typename, String bookdesc) {
		super();
		this.id = id;
		this.typename = typename;
		this.bookdesc = bookdesc;
	}

	@Override
	public String toString() {
		return "Booktype [id=" + id + ", typename=" + typename + ", bookdesc=" + bookdesc + "]";
	}
	

}
