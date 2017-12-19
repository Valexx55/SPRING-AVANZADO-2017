package edu.val.spring.tdd.testingbasico;

public class Account {
	
	private String name;
	private long id;
	
	public Account (String name)
	{
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Account ac = (Account) obj;
		return ac.name.equals(this.name);
	}
	
	

}
