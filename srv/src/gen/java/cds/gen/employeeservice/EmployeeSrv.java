package cds.gen.employeeservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("EmployeeService.EmployeeSrv")
public interface EmployeeSrv extends CdsData {
  String NAME = "name";

  String ID = "ID";

  String DEPT = "dept";

  String SALARY = "salary";

  String DEPT_ID = "dept_ID";

  String getName();

  void setName(String name);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  DeptSrv getDept();

  void setDept(Map<String, ?> dept);

  Integer getSalary();

  void setSalary(Integer salary);

  @CdsName(DEPT_ID)
  Integer getDeptId();

  @CdsName(DEPT_ID)
  void setDeptId(Integer deptId);

  static EmployeeSrv create() {
    return Struct.create(EmployeeSrv.class);
  }
}
