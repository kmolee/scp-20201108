package customer.kmolee2.handlers;

import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.employeeservice.EmployeeService_;
import cds.gen.employeeservice.EmployeeSrv;
import cds.gen.employeeservice.EmployeeSrv_;


@Component
@ServiceName(EmployeeService_.CDS_NAME)
public class EmployeeServiceHandler implements EventHandler {


//@After : data handling
// event : inquiry event
// entity : EmployeeService.EmployeeSrv

	@After(event = CdsService.EVENT_READ, entity = {EmployeeSrv_.CDS_NAME})
	public void highSalary(Stream<EmployeeSrv> Employees) {
        Employees.filter(b -> b.getName() != null && b.getSalary() != null)
        .filter(b -> b.getSalary() >= 100)
        .forEach(b -> b.setName(b.getName() + " (High Salary)"));
	}

}