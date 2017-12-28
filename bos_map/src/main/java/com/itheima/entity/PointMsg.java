package com.itheima.entity;

import java.sql.Date;
import java.util.Arrays;

public class PointMsg {
//	{"uid":2313309298, "province":"\u5C71\u4E1C\u7701", "geotable_id":175590, "district":"\u5386\u57CE\u533A", "create_time":1504698529, "city":"\u6D4E\u5357\u5E02", "location":[117.21852800000001, 36.659157], 
//	"address":"\u5C71\u4E1C\u7701\u6D4E\u5357\u5E02\u5386\u57CE\u533A\u6E2F\u6E90\u516D\u8DEF", 
//	"title":"\u6D4E\u5357\u82CF\u5B81\u914D\u9001\u4E2D\u5FC3", 
//	"coord_type":3, "direction":"\u9644\u8FD1", 
//	"type":0, 
//	"distance":0, 
//	"weight":0}
	
	private Long uid;
	private Integer geotable_id;
	private String province;
	private String district;
	private String city;
	private Date create_time;
	private Integer[] location;
	private String address;
	private String title;
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public Integer getGeotable_id() {
		return geotable_id;
	}
	public void setGeotable_id(Integer geotable_id) {
		this.geotable_id = geotable_id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer[] getLocation() {
		return location;
	}
	public void setLocation(Integer[] location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "PointMsg [uid=" + uid + ", geotable_id=" + geotable_id + ", province=" + province + ", district="
				+ district + ", city=" + city + ", create_time=" + create_time + ", location="
				+ Arrays.toString(location) + ", address=" + address + ", title=" + title + "]";
	}
	
}
