package org.example

class Person {

	String name
	Integer age
	
    static constraints = {
		name(blank:false,nullable:false,email:true)
		age(blank:false)
    }
}
