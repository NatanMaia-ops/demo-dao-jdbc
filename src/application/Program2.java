package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao dp = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1 INSERT DEPARTMENT ===");
		/*
		Department department = new Department(null,"books");
		dp.insert(department);
		*/
		
		System.out.println("\n=== TEST 2: UPDATE DEPARTMENT ====");
		Department department = new Department(1,"Animes");
		dp.update(department);
		
		System.out.println("\n=== TEST 3 : FIND BY ID DEPARTMENT ====");
		Department find = dp.findById(2);
		System.out.println(find);
		
		System.out.println("\n=== TEST 4 : FIND ALL DEPARTMENT ====");
		List<Department> list = dp.findAll();
		
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 5 : DELETE BY ID ====");
		dp.deleteById(10);
	}
}
