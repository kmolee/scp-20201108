package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("EmployeeService.DeptSrv")
public interface DeptSrv_ extends StructuredType<DeptSrv_> {
  String CDS_NAME = "EmployeeService.DeptSrv";

  ElementRef<String> name();

  ElementRef<Integer> ID();

  ElementRef<LocalDate> creation_date();

  EmployeeSrv_ employee();

  EmployeeSrv_ employee(Function<EmployeeSrv_, CqnPredicate> filter);
}
