package java8_Concepts.AnotherExampleForWithStreamWithoutStream;

public class Dish {
private String dishName;
private boolean isVegetarian;
private Type type;
private int price;
public enum Type {
    MAIN, DESSERT, CURRY, RICE, SNACK, DRINK
}
public String getDishName() {
	return dishName;
}
public void setDishName(String dishName) {
	this.dishName = dishName;
}
public boolean isVegetarian() {
	return isVegetarian;
}
public void setVegetarian(boolean isVegetarian) {
	this.isVegetarian = isVegetarian;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public Dish(String dishName, boolean isVegetarian, Type type, int price) {
	this.dishName = dishName;
	this.isVegetarian = isVegetarian;
	this.type = type;
	this.price = price;
}
@Override
public String toString() {
	return "Dish [dishName=" + dishName + ", isVegetarian=" + isVegetarian + ", type=" + type + ", price=" + price
			+ "]";
}


}
