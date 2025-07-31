package lambdaexpression;
@FunctionalInterface
interface Abc {
	public void display();
	//public void display(int x);
}
class AbcImpl implements Abc {
	@Override
	public void display() {
	System.out.println("Providing body for Abc interface method using class style");
	}
}
public class LambdaSimpleExample {
	public static void main(String[] args) {
	//1st way to provide the body for display method 
	Abc obj1 = new AbcImpl();	// run time polymorphism 
	obj1.display();
	// 2nd way to provide the body for display method 
	Abc obj2 = new Abc() {
		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("1st way - Providing body for Abc interface method using anonymous class style");	
		}
	};
	obj2.display();
	
	Abc obj3 = new Abc() {
		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("2nd way - Providing body for Abc interface method using anonymous class style");	
		}
	};
	obj3.display();
	
	// 3rd way providing body for display method using lambda style 
	Abc obj4 = ()->System.out.println("Providing body for Display method using lambda style");
	obj4.display();
	}

}
