package cds.gen.employeeservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("EmployeeService.DeptSrv")
public interface DeptSrv extends CdsData {
  String NAME = "name";

  String ID = "ID";

  String CREATION_DATE = "creation_date";

  String EMPLOYEE = "employee";

  String getName();

  void setName(String name);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  @CdsName(CREATION_DATE)
  LocalDate getCreationDate();

  @CdsName(CREATION_DATE)
  void setCreationDate(LocalDate creationDate);

  List<EmployeeSrv> getEmployee();

  void setEmployee(List<? extends Map<String, ?>> employee);

  static DeptSrv create() {
    return Struct.create(DeptSrv.class);
  }
}
