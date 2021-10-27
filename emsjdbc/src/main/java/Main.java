import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cogent.emsjdbc.dto.Employee;
import com.cogent.emsjdbc.repository.EmployeeRepository;
import com.cogent.emsjdbc.repository.EmployeeRepositoryImpl;
import com.cogent.emsjdbc.service.EmployeeService;
import com.cogent.emsjdbc.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("101", "Alex", "Hales",new Date(97,11,13), new Date(90,10,15), 2000.0f);
		Employee emp2 = new Employee("102", "Buck", "Wick", new Date(121, 7, 18), new Date(101, 8, 16), 40000.0f);		
		EmployeeService es;
	//	e.addEmployee(emp);
	//	e.deleteEmployeeById("101");
	//	e.deleteAllEmployees();
	//	e.getEmployeeById("101");
		
		//es.updateEmployee("101", emp2);
	Optional<Employee> op = es.getEmployeeById("102");
		
	if (op.isPresent()) {
		System.out.println(op);
		Employee employee = op.get();
		System.out.println(employee);
		
	}
	}

}
