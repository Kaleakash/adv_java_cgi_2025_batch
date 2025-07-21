package encapsulation;

public class Customer {
private int cid;
private String cname;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Customer(int cid, String cname) {
	this.cid = cid;
	this.cname = cname;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

}
