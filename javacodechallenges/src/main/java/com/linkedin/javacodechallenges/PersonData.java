package com.linkedin.javacodechallenges;

public class PersonData {
  private String firstName;
  private String lastName;
  int age;

public PersonData(String firstName, String lastName, int age ){
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
}
public int getAge(){
  return this.age;
}

public void setAge(int age){
  if (age < this.age) {
    System.out.println("You can't make a person younger !" +
        "not set");
  }else {
    this.age =age;
  }
  }
public String getFirstName(){
return firstName;
}
public void setFristName(String firstName){
  this.firstName = firstName;
}
public String getLastName(){
  return lastName;
}
public void setLastName(String lastName){
this.lastName = lastName;
}
public void introdueYouself(){
  System.out.println("Hi, my name is " + getFirstName() + 
  getLastName() + " " + "and I'm " + getAge() + " year old");
}
}
