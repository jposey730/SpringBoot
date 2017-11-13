package io.practice.topic;

public class Types {
public Types() {
	
}
	
public Types(String iD, String name, String description) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
	}
private String ID;
private String name;
private String description;
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Types [ID=" + ID + ", name=" + name + ", description=" + description + "]";
}

}
