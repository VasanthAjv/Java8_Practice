package java8_Concepts.OptionalClass;

public class Person {

	private String name;
	private Car car;
	private Insurance insurance;
	public Person(String name, Car car, Insurance insurance) {
		this.name = name;
		this.car = car;
		this.insurance = insurance;
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", insurance=" + insurance + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	
	public String getCarBrandDetails(Person person)
	{
		Car car=person.getCar();
		if(car!=null)
		{
			return car.getBrand();
		}
		return "this is null";
	}
	

}
