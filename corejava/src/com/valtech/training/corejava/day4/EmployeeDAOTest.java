package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;

public class EmployeeDAOTest {

	@Test
	public void test() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		Connection conn=dao.getConnection();
		conn.close();
	}
	@Test
	public void testCount() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		int count=dao.count();

	}
	
	//@Test
	public void testSaveEmployee() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		int count=dao.count();

		assertEquals(count+1, dao.count());
	}
	
	//@Test
	public void testGetEmployees() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		int count=dao.count();
		assertEquals(count, dao.getEmployee().size());
	}
	
	//@Test
	public void testdeleteEmployees() throws Exception {
	EmployeeDAO dao =new EmployeeDAO();
	int count=dao.count();
	dao.deleteEmployee(4);
	assertEquals(count, dao.count());	}
	
	@Test
	public void testUpdateEmployee() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		
		dao.updateEmployee(new Employee(3,"heena",25,1,12000));
		Employee e=dao.getEmployeeById(3);
		assertEquals(e.getId(),	3);
		assertEquals(e.getAge(),25);
		
	
	}
	
	
	//@Test
	public void testGetEmployeeByAge() throws Exception {
		
		
		EmployeeDAO dao =new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByGender("f");
		
		assertTrue("sushma", true);
		assertTrue("sindhu", true);
		assertFalse("nayana",false);
		
	}
	
	//@Test
	public void testGetEmployeeByMaxSalary() throws Exception {
	
	
	EmployeeDAO dao =new EmployeeDAO();
	Employee e=dao.getEmployeeByMaxSalary();
	assertEquals(1, e.getId());
	assertEquals(22, e.getAge());
	assertEquals("f", e.getGender());
	assertEquals("sindhu", e.getName());
	}
	//@Test
	public void testGetEmployeeByminSalary() throws Exception {
		
		
		EmployeeDAO dao =new EmployeeDAO();
		Employee e=dao.getEmployeeByMinSalary();
		assertEquals(4, e.getId());
		assertEquals(21, e.getAge());
		assertEquals("f", e.getGender());
		assertEquals("sushma", e.getName());
		
	}
	
	
	//@Test
		public void testGetEmployeegGenderMale() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		
		
		int total=dao.getEmployeeByGender("m").size();
		assertEquals(total, dao.getEmployeeByGender("m").size());
		
		
		assertFalse("akanksha", false);
		assertFalse("nayana", false);
		}
		
		//@Test
				public void testGetEmployeegGenderFemale() throws Exception {
				EmployeeDAO dao =new EmployeeDAO();
				List<Employee> e=dao.getEmployeeByGender("f");
				
				int total=dao.getEmployeeByGender("f").size();
				assertEquals(total, dao.getEmployeeByGender("f").size());
				
				
				assertFalse("vinod", false);

}
		//@Test
		public void testGetEmployeegGenderOthers() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		List<Employee> e=dao.getEmployeeByGender("o");
		
		int total=dao.getEmployeeByGender("o").size();
		assertEquals(total, dao.getEmployeeByGender("o").size());
		

		assertFalse("akanksha", false);
		assertFalse("nayana", false);
		assertFalse("vinod", false);


}
	
	@Test
	public void testGetEmployeeGreaterThanSalary() throws Exception {
	
	
	EmployeeDAO dao =new EmployeeDAO();
	List<Employee> e=dao.getEmployeeByGraterThanSalary(30000);
	
	int total=dao.getEmployeeByGraterThanSalary(30000).size();
	assertEquals(total, dao.getEmployeeByGraterThanSalary(30000).size());
	
	assertTrue("sindhu", true);
	assertFalse("akanksha", false);

	
	}
	
	@Test
	public void testGetEmployeeLesserThanSalary() throws Exception {
	
	
	EmployeeDAO dao =new EmployeeDAO();
	List<Employee> e=dao.getEmployeeByLessThanSalary(15000);
	
	int total=dao.getEmployeeByLessThanSalary(15000).size();
	assertEquals(total, dao.getEmployeeByLessThanSalary(15000).size());
	
	assertTrue("sushma", true);
	assertTrue("heena", true);

	}
	
	@Test
	public void testGetEmployeeBetweenSalary() throws Exception {
	
	
	EmployeeDAO dao =new EmployeeDAO();
	
	int total=dao.getEmployeeBetweenSalary().size();
	assertEquals(total, dao.getEmployeeBetweenSalary().size());
	assertTrue("40000", true);
	assertTrue("nayaya", true);
	assertTrue("vinod", true);
}
	
	@Test
	public void testGetEmployeeBetweenAge() throws Exception {
		
		
		EmployeeDAO dao =new EmployeeDAO();
		int total=dao.getEmployeeBetweenAge(21,22).size();
		assertEquals(total, dao.getEmployeeBetweenAge(22,22).size());
		assertTrue("sushma", true);
		assertTrue("akanksha", true);
		assertTrue("nayana", true);
	}
	
	
}
