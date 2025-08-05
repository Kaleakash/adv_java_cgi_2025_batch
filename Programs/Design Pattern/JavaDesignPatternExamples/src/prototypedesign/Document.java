package prototypedesign;

public class Document implements Cloneable{
private int width=100;
private int height=100;
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public Document() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("memory created..");
}
public Document(int width, int height) {
	super();
	this.width = width;
	this.height = height;
}

public Document clone() {
	try {
	Object obj	 = super.clone();			// clone method part of object class. 
	Document doc = (Document)obj;
	return doc;
	} catch (Exception e) {
		System.err.println(e);
		return null;
		// TODO: handle exception
	}
}
@Override
public String toString() {
	return "Document [width=" + width + ", height=" + height + "]";
}

}
