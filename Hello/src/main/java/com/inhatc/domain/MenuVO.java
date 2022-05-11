package com.inhatc.domain;

public class MenuVO {
	private int mid ;
	private String mkinds ;
	private String mname ;
	private int mprice ;
	public MenuVO(int mid, String mkinds, String mname, int mprice) {
		super();
		this.mid = mid;
		this.mkinds = mkinds;
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "MenuVO [mid=" + mid + ", mkinds=" + mkinds + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	public MenuVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMkinds() {
		return mkinds;
	}
	public void setMkinds(String mkinds) {
		this.mkinds = mkinds;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
}
