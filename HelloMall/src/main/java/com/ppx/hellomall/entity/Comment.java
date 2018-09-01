package com.ppx.hellomall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品评论
 * </p>
 *
 * @author hucongting
 * @since 2018-09-01
 */
public class Comment extends Model<Comment> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户id
     */
	private Integer uid;
    /**
     * 商品id
     */
	private Integer product_id;
    /**
     * 内容评论
     */
	private String content;
    /**
     * 评分字段
     */
	private Integer score;
    /**
     * 评论图片
     */
	private String img;

	
	

	public Comment() {
		super();
	}

	public Comment(Integer id, Integer uid, Integer product_id, String content, Integer score, String img) {
		super();
		this.id = id;
		this.uid = uid;
		this.product_id = product_id;
		this.content = content;
		this.score = score;
		this.img = img;
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

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", uid=" + uid + ", product_id=" + product_id + ", content=" + content + ", score="
				+ score + ", img=" + img + "]";
	}
	

}
