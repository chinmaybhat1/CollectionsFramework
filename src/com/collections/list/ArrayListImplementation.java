package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.collections.model.Employee;

public class ArrayListImplementation {

	public static void main(String[] args) {

		/*
		 * Static array In a static array the size of the array is always fixed Example
		 * -- int[] a = new int[2];
		 */

		/*
		 * Dynamic Array -- ArrayList
		 * 
		 * Can contain duplicate value/elements Maintains insertion order Synchronized
		 * Allows random access as it stores values on the basis of index
		 */
		List genericArrayList = new ArrayList();
		genericArrayList.add(1);
		genericArrayList.add(2);
		genericArrayList.add(3);
		genericArrayList.add("Hello");
		genericArrayList.add('z');
		genericArrayList.add(true);

		// Get size of an array list
		System.out.println("Array list size " + genericArrayList.size());

		// Get value stored in particular index
		System.out.println("Array at index " + 3 + " is " + genericArrayList.get(3));

		// Looping array list
		// Method 1 -- Using simple for loop
		for (int i = 0; i < genericArrayList.size(); i++) {
			System.out.println("Element at index " + i + " is " + genericArrayList.get(i));
		}
		
		List<Integer> nonGenericArrayList = new ArrayList<Integer>();
		nonGenericArrayList.add(10);
		nonGenericArrayList.add(20);
		nonGenericArrayList.add(30);

		// Method 2 -- Using Iterator
		Iterator<Integer> numberIterator = nonGenericArrayList.iterator();
		while (numberIterator.hasNext()) {
			int value = numberIterator.next();
			System.out.println(value);
		}

		Employee employee1 = new Employee(10000001L, "Harish", "harish@oracle.com", "Software Engineer");
		Employee employee2 = new Employee(10000002L, "Ramesh", "ramesh@oracle.com", "Test Automation Engineer");
		Employee employee3 = new Employee(10000003L, "Girish", "girish@oracle.com", "Business Analyst");
		Employee employee4 = new Employee(10000004L, "Lata", "lata@oracle.com", "Software Engineer");
		Employee employee5 = new Employee(10000005L, "Reshma", "reshma@oracle.com", "Test Automation Engineer");
		Employee employee6 = new Employee(10000006L, "John", "john@oracle.com", "Lead Test Automation Engineer");
		Employee employee7 = new Employee(10000007L, "Ganesh", "ganesh@oracle.com", "Lead Software Engineer");

		List<Employee> developerList = new ArrayList<Employee>();
		developerList.add(employee1);
		developerList.add(employee4);
		developerList.add(employee7);
		
		List<Employee> testerList = new ArrayList<Employee>();
		testerList.add(employee2);
		testerList.add(employee5);
		testerList.add(employee6);
		
		List<Employee> businessAnalyst = new ArrayList<Employee>();
		businessAnalyst.add(employee3);
		
		List<Employee> culturalSquadList = new ArrayList<Employee>();
		culturalSquadList.add(employee3);
		culturalSquadList.add(employee4);
		culturalSquadList.add(employee5);
		culturalSquadList.add(employee7);
		
		List<Employee> hiringCommittee = new ArrayList<Employee>();
		hiringCommittee.add(employee6);
		hiringCommittee.add(employee7);
		
		
		// AddAll -- Adds one arraylist to another
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.addAll(developerList);
		employeeList.addAll(testerList);
		employeeList.addAll(businessAnalyst);
		System.out.println("******** All Employee details ********");
		for(Employee employee: employeeList) {
			System.out.println("Employee --> id: " + employee.getEmployeeId() + ", name: " + employee.getEmployeeName()
			+ ", email: " + employee.getEmployeeEmail() + ", role: " + employee.getRole());
		}
		
		//Remove all -- removes element from given array list
		employeeList.removeAll(culturalSquadList);
		System.out.println("******* Employees not in Cultural squad ******");
		for(Employee employee: employeeList) {
			System.out.println("Employee --> id: " + employee.getEmployeeId() + ", name: " + employee.getEmployeeName()
			+ ", email: " + employee.getEmployeeEmail() + ", role: " + employee.getRole());
		}
		
		//Retain all -- retains the common elements in both array list
		employeeList.retainAll(hiringCommittee);
		System.out.println("******* Employees in Hiring commitee but not in Cultural squad ******");
		for(Employee employee: employeeList) {
			System.out.println("Employee --> id: " + employee.getEmployeeId() + ", name: " + employee.getEmployeeName()
			+ ", email: " + employee.getEmployeeEmail() + ", role: " + employee.getRole());
		}
	}
}
