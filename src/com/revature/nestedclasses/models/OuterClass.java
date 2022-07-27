package com.revature.nestedclasses.models;

public class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

   
    public class InnerClass {
        public void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }

		public String getOuterField() {
			// TODO Auto-generated method stub
			return outerField;
		}
    }

    public static class StaticNestedClass {
        public void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

   
}
