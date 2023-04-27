package com.rlagus.trans.dto;

public class TicketDto {		// 연동할 테이블당 dto 한개 생성
	private String consumerid;
	private String countnum;
	public TicketDto() {
		super();
	}
	public TicketDto(String consumerid, String countnum) {
		super();
		this.consumerid = consumerid;
		this.countnum = countnum;
	}
	public String getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
	}
	public String getCountnum() {
		return countnum;
	}
	public void setCountnum(String countnum) {
		this.countnum = countnum;
	}	
}