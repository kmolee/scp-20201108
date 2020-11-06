package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("EmployeeService")
public interface EmployeeService_ {
  String CDS_NAME = "EmployeeService";

  Class<EmployeeSrv_> EMPLOYEE_SRV = EmployeeSrv_.class;

  Class<DeptSrv_> DEPT_SRV = DeptSrv_.class;
}
