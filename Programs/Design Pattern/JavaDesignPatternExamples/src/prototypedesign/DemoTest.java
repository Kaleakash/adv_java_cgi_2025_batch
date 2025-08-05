package prototypedesign;

public class DemoTest {

	public static void main(String[] args) {
	Document doc1 = new Document();
	Document doc2 = new Document();
	doc2.setHeight(150);
	doc2.setWidth(150);
	Document doc3 = doc1;
	System.out.println(doc1);
	System.out.println(doc2);
	doc3.setHeight(120);
	System.out.println(doc1);
	System.out.println(doc3);
	
	Document doc4 = doc2.clone();
	System.out.println("After clone created");
	System.out.println(doc2);
	System.out.println(doc4);
	doc4.setHeight(200);
	doc4.setWidth(200);
	System.out.println(doc2);
	System.out.println(doc4);
	}

}
