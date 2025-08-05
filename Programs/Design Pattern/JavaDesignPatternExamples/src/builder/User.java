package builder;

public class User {
private final String name;
private final String emailid;

private final int age;
private final long phonenumber;
private final String city;				// property are immutable 

private User(Builder builder) {
		this.name=builder.name;
		this.emailid=builder.emailid;
		this.age=builder.age;
		this.phonenumber=builder.phonenumber;
		this.city=builder.city;
}


public String getName() {
	return name;
}


public String getEmailid() {
	return emailid;
}


public int getAge() {
	return age;
}


public long getPhonenumber() {
	return phonenumber;
}


public String getCity() {
	return city;
}


@Override
public String toString() {
	return "User [name=" + name + ", emailid=" + emailid + ", age=" + age + ", phoneumber=" + phonenumber + ", city="
			+ city + "]";
}


public static class Builder {
	
	private final String name;
	private final String emailid;

	private int age;
	private long phonenumber;
	private String city;
	
	public Builder(String name, String emailid) {
		this.name=name;
		this.emailid=emailid;
	}
	
	public User build() {
		return new User(this);
	}
	
	public Builder age(int age) {
		this.age = age;
		return this;
	}
	public Builder city(String city) {
		this.city = city;
		return this;
	}
	public Builder phonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
		return this;
	}
}

}