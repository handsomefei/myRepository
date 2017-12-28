package com.itheima.entity;

import java.util.Arrays;

public class LBSPoint {
//	{"status":0, "total":1, "size":1, "contents":[]}
	
	private Integer status;
	private Integer total;
	private Integer size;
	private PointMsg[] contents;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public PointMsg[] getContents() {
		return contents;
	}

	public void setContents(PointMsg[] contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "LBSPoint [status=" + status + ", total=" + total + ", size=" + size + ", contents="
				+ Arrays.toString(contents) + "]";
	}
}
