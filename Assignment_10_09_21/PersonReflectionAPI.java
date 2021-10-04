package com.yash.array_interface;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflectionAPI {
	public static void main(String[] Args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person =new Person();
		Class personData1=person.getClass();
		
		ClassLoader load1=ClassLoader.getSystemClassLoader();
		Class personData2 = load1.loadClass("com.yash.array_interface.Person");
		Class personData3 = Class.forName("com.yash.array_interface.Person");
		
		//listing constructor in Class Person
		Constructor[] constructors= personData1.getConstructors();
		System.out.println("Construcors are:");
		for(Constructor obj : constructors){
			System.out.println(obj);

		}

		//Dynamic initialization of the Class Person
		Person person2= (Person)personData3.newInstance();
		
		//Serialization Implementation
		Class[] ser= personData2.getInterfaces();

		if(ser.equals("Serializable")){
			System.out.println("Person class implements Serializable interface");
		}
		else{
			System.out.println("Person class does not implement Seializable interface");
		}

		//Using getter & Setter methods
		Method[] methods = personData3.getMethods();
		int i=1;
		for (Method method : methods) {
			if(method.getName().startsWith("get") || method.getName().startsWith("set")) {
				System.out.println("Method "+i+" : "+method);					
				i++;
			}
		}
	}
}