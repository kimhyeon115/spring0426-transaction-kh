package com.rlagus.trans.dto;

public class CardDto {			// 연동할 테이블당 dto 한개 생성
	private String consumerid;
	private String amount;
	public CardDto() {
		super();
	}
	public CardDto(String consumerid, String amount) {
		super();
		this.consumerid = consumerid;
		this.amount = amount;
	}
	public String getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}	
}