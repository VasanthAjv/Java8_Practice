package java8_Concepts.SortingUsingComparator;

public class Mobile  implements Comparable<Mobile> {
public Brand brand;
public String model;
public int memory;
public double cost;
public int megapixel;
public double displaySize;
public String color;
public int rating;

public Mobile(Brand brand, String model, int memory, double cost, int megapixel, double displaySize, String color,
		int rating) {
	this.brand = brand;
	this.model = model;
	this.memory = memory;
	this.cost = cost;
	this.megapixel = megapixel;
	this.displaySize = displaySize;
	this.color = color;
	this.rating = rating;
}

@Override
public String toString() {
	return "Mobile [brand=" + brand + ", model=" + model + ", memory=" + memory + ", cost=" + cost + ", megapixel="
			+ megapixel + ", displaySize=" + displaySize + ", color=" + color + ", rating=" + rating + "]";
}

public Brand getBrand() {
	return brand;
}

public void setBrand(Brand brand) {
	this.brand = brand;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getMemory() {
	return memory;
}

public void setMemory(int memory) {
	this.memory = memory;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public int getMegapixel() {
	return megapixel;
}

public void setMegapixel(int megapixel) {
	this.megapixel = megapixel;
}

public double getDisplaySize() {
	return displaySize;
}

public void setDisplaySize(double displaySize) {
	this.displaySize = displaySize;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public enum Brand{
	SAMSUNG,APPLE,MOTO,REALME,VIVO,GOOGLE,ONEPLUS,NOKIA,BLUEBERRY,REDMI,OPPO,IQOO,MOTOROLA,
}



@Override
public int compareTo(Mobile o) {
	// TODO Auto-generated method stub
	if(this.cost>o.cost)
	{
		return 1;
	}
	else if(this.cost<o.cost)
	{
		return -1;
	}
	else return 0;
}
}
