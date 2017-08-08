package com.rahul.sp;

public class Topics {
   
	private String id;
	private String desc;
	private String name;
	
	public Topics() {
		
	}
	
	public Topics(String id, String desc, String name) {
		super();
		this.id = id;
		this.desc = desc;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
