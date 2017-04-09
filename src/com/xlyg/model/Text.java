package com.xlyg.model;

import java.util.Date;

public class Text implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6963217058278514849L;
	private Integer id;
	private String title;
	private String url;
	private String detaile;
	private Date createtime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDetaile() {
		return detaile;
	}
	public void setDetaile(String detaile) {
		this.detaile = detaile;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatorupdate(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((detaile == null) ? 0 : detaile.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (detaile == null) {
			if (other.detaile != null)
				return false;
		} else if (!detaile.equals(other.detaile))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	

}
