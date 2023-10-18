package com.rameshsoft.methodref;

public class Emp {
	public int eid;
	public String ename;
	public double esal;
	
	public Emp(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	//custom filter
	public boolean salaryCheck()   //filter method or custom method, condition true filtered else not filtered
	{
		return this.esal>25000;
	}
	//custom filter
	public boolean nameCheck()   //filter method or custom method, condition true filtered else not filtered
	{
		return this.ename.startsWith("d");
	}
	

}
