package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.entity.Employee;
import com.cg.reposotory.EmployeeRepository;
import com.cg.service.EmployeeServiceImple;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
	
	@InjectMocks
	EmployeeServiceImple serviceImpl;
	
	@Mock
	EmployeeRepository empRepo;
	
	@Test
	public void getAllTest() {
		List<Employee> list=new ArrayList();
		
		list.add(new Employee(1,"ramesh","nanded",33333,"dhage@qwjw"));
		list.add(new Employee(2,"ganesh","mumbai",44333,"shinde@ddd"));
		list.add(new Employee(3,"datta","pune",2322,"gade@ueue"));
		
		when(empRepo.findAll()).thenReturn(list);
		
		List<Employee> actual=serviceImpl.getAll();
		
		assertEquals(list,actual);

	}
	
	@Test
	public void createEmpTest() {
		
		Employee emp=new Employee(1,"datta","pune",3333,"sdddhd@djdhd");
		
		
		when(empRepo.save(emp)).thenReturn(emp);
		
	    Employee	actual=serviceImpl.createEmp(emp);
		
		
		assertEquals(emp,actual);
		
	}
		@Test
		public void getByNameEmpTest() {
			
			List<Employee> list=new ArrayList();
			
		   list.add(new Employee(1,"datta","pune",66444,"djdahhs@112"));
		   list.add(new Employee(2,"shyam","mumbai",34433,"ddaasd@112"));
		   list.add(new Employee(3,"ram","nanded",34343,"fffjfjr@133"));
		   list.add(new Employee(4,"datta","pune",54455,"ddadk@069797"));
		   
		   when(empRepo.getByName("datta")).thenReturn(list);
		   
		   List<Employee> actualEmp=serviceImpl.getByNameEmp("datta");
		   
		   assertEquals(list,actualEmp);
		   
		}
		
		@Test
		public void getByCityEmpTest() {
			
			List<Employee> list=new ArrayList();
			
			   list.add(new Employee(1,"datta","pune",66444,"djdahhs@112"));
			   list.add(new Employee(2,"shyam","mumbai",34433,"ddaasd@112"));
			   list.add(new Employee(3,"ram","nanded",34343,"fffjfjr@133"));
			   list.add(new Employee(4,"datta","pune",54455,"ddadk@069797"));
			   
			   when(empRepo.getByCity("pune")).thenReturn(list);
			   
			  List<Employee> actualempcity= serviceImpl.getByCityEmp("pune");
			
			  assertEquals(list,actualempcity);
			  
		}
		
		
	
	
	

}
