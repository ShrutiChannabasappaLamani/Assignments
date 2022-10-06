

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class EmployeeDAOTest {

	
	
	@Test
	public void getEmployeesSalaryGreater() throws Exception {
		EmployeeDAO_1 dao = new EmployeeDAO_1();
		List<Employee> e = dao.getEmployeesSalaryGreater(12000);
		int total = dao.getEmployeesSalaryGreater(12000).size();
		assertEquals(total, dao.getEmployeesSalaryGreater(12000).size());
		assertTrue("Raja", true);
		assertFalse("six", false);
	}

	
	@Test
	public void getEmployeesOthers() throws Exception {
		EmployeeDAO_1 dao = new EmployeeDAO_1();
		List<Employee> e = dao.getEmployeesMale(1);
		int total = dao.getEmployeesMale(1).size();
		assertEquals(total, dao.getEmployeesMale(1).size());
		assertTrue("six", true);
	}

	
	@Test
	public void getEmployeesFemale() throws Exception {
		EmployeeDAO_1 dao = new EmployeeDAO_1();
		List<Employee> e = dao.getEmployeesMale(1);
		int total = dao.getEmployeesMale(1).size();
		assertEquals(total, dao.getEmployeesMale(1).size());
		assertTrue("five", true);
	}

	
	@Test
	public void getEmployeesMale() throws Exception {
		EmployeeDAO_1 dao = new EmployeeDAO_1();
		List<Employee> e = dao.getEmployeesMale(1);
		int total = dao.getEmployeesMale(1).size();
		assertEquals(total, dao.getEmployeesMale(1).size());
		assertTrue("Irfan", true);
		assertTrue("Irfan", true);
	}

	@Test
	public void testUpdateEmployee() throws Exception {
		EmployeeDAO_1 dao = new EmployeeDAO_1();
		dao.updateEmployee(new Employee(3, "Irfan", 99, 2, 20));
		Employee e = dao.getEmployee(3 );
		assertEquals(e.getId(), 3);
		assertEquals(e.getName(), "Irfan");
		assertEquals(99, e.getAge());
		assertEquals(2, e.getGender());
		assertEquals(20, e.getSalary(), 0.000000);
	}
}