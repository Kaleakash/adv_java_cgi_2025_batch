package polymorphism;

class Bike {
	void speed() {
		System.out.println("Generic Speed : 60km/hr");
	}
}
class Honda extends Bike {
	void mailage() {
		System.out.println("Honda mailage : 70km/lt");
	}
}
class Pulsar extends Bike {
	void mailage() {
		System.out.println("Pulsar mailage : 40km/lt");
	}
	void speed() {
		System.out.println("Pulsar Speed : 90km/hr");
	}
}
class Tvs extends Bike {
	void mailage() {
		System.out.println("Tvs mailage : 40km/lt");
	}
	void speed() {
		super.speed();			// super class speed method code 
		System.out.println("TVS Speed : 20km/hr");	// sub class code ie merge both the code 
	}
}
public class MethodOverridingExample {
	public static void main(String[] args) {
	Honda hh = new Honda();
	hh.speed(); hh.mailage();
	Pulsar pu = new Pulsar();
	pu.speed(); pu.mailage();
	Tvs tvs = new Tvs();
	tvs.speed(); tvs.mailage();

	}

}
