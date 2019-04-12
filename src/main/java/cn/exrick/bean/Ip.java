package cn.exrick.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_ip")
public class Ip implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 7443942600616472162L;
	/**
	 * 唯一标识
	 */
	@Id
	@Column
	private String id;
	@Column
	private String ip;
	@Column
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
