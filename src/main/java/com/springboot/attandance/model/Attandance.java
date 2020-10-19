package com.springboot.attandance.model;

import java.util.Date;

import javax.persistence.Entity;


@Entity
public class Attandance {

public Attandance(int roll_No, String name, Date date) {
		super();
		Roll_No = roll_No;
		Name = name;
		this.date = date;
	}
public Attandance(int i, String name2, Date date2, boolean isDone) {
	// TODO Auto-generated constructor stub
}
private int Roll_No;
private String Name;
private Date date;


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Name == null) ? 0 : Name.hashCode());
	result = prime * result + Roll_No;
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Attandance other = (Attandance) obj;
	if (Name == null) {
		if (other.Name != null)
			return false;
	} else if (!Name.equals(other.Name))
		return false;
	if (Roll_No != other.Roll_No)
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	return true;
}
@Override
public String toString() {
	return "Attandance [Roll_No=" + Roll_No + ", Name=" + Name + ", date=" + date + "]";
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

public int getRoll_No() {
	return Roll_No;
}
public void setRoll_No(int roll_No) {
	Roll_No = roll_No;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
}
