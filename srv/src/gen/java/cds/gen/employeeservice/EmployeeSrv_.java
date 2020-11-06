package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("EmployeeService.EmployeeSrv")
public interface EmployeeSrv_ extends StructuredType<EmployeeSrv_> {
  String CDS_NAME = "EmployeeService.EmployeeSrv";

  ElementRef<String> name();

  ElementRef<Integer> ID();

  DeptSrv_ dept();

  DeptSrv_ dept(Function<DeptSrv_, CqnPredicate> filter);

  ElementRef<Integer> salary();

  ElementRef<Integer> dept_ID();
}
