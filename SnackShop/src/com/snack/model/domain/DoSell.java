package com.snack.model.domain;

import java.util.Date;

public class DoSell {

	

    private String s_name;
    private String s_type;
    private String s_pictureUrl;
    private double s_price;
    private double num;
    private double counts; 
    private Date o_time;
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_type() {
		return s_type;
	}
	public void setS_type(String s_type) {
		this.s_type = s_type;
	}
	public String getS_pictureUrl() {
		return s_pictureUrl;
	}
	public void setS_pictureUrl(String s_pictureUrl) {
		this.s_pictureUrl = s_pictureUrl;
	}
	public double getS_price() {
		return s_price;
	}
	public void setS_price(double s_price) {
		this.s_price = s_price;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public double getCounts() {
		return counts;
	}
	public void setCounts(double counts) {
		this.counts = counts;
	}
	public Date getO_time() {
		return o_time;
	}
	public void setO_time(Date o_time) {
		this.o_time = o_time;
	}

    
    
}
