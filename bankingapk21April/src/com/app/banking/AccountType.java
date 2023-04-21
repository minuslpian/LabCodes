package com.app.banking;

public enum AccountType {SAVING(1000),CURRENT(5000),DEMAT(500),LOAN(1500),NRE(200),NRO(400);
	private int minAmt;
	private AccountType(int minAmt) {
		this.minAmt = minAmt;
	}
	public int getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(int minAmt) {
		this.minAmt = minAmt;
	}
};



