package basics;

import objactclass.Util;

public class Student {
      String name;
      int age;
      
     
      
      public Student() {}
      
      public Student(String name) {
    	  this.name = name;
      }
      
      public Student(String name,int age) {
    	  super();
    	  this.name = name;
    	  this.age = age+2;
    	  this.age = Util.incrementByTen(age);
      }
      static String COLLEGE_NAME = "IIT";
      
      public String getName() {
    	  return name;
      }
      
      public void setName(String name) {
    	  this.name = name;
      }
      
      public int getAge() {
    	  return age;
    	 
      }
    public void setAge(int age) {
    	this.age = age;
    }
}
