package com.revature.nestedclasses.app;

import com.revature.nestedclasses.models.*;
import com.revature.nestedclasses.models.OuterClass.StaticNestedClass;
import com.revature.nestedclasses.models.OuterClass.InnerClass;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Inner class:");
		System.out.println("------------");
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		innerObject.accessMembers();

		System.out.println("\nStatic nested class:");
		System.out.println("--------------------");
		StaticNestedClass staticNestedObject = new StaticNestedClass();
		staticNestedObject.accessMembers(outerObject);

		System.out.println("\nTop-level class:");
		System.out.println("--------------------");

		OuterClass outerClassObj = new OuterClass();

		
//		String variable = InnerObject.outerField;

		String variable = innerObject.getOuterField();

//		String variable2 = OuterClass.StaticNestedClass.staticOuterField;

		StaticNestedClass nestedClassObj = new StaticNestedClass();

	}

}
