package cds.gen.my;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("my.Employee")
public interface Employee extends CdsData {
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

  Dept getDept();

  void setDept(Map<String, ?> dept);

  Integer getSalary();

  void setSalary(Integer salary);

  @CdsName(DEPT_ID)
  Integer getDeptId();

  @CdsName(DEPT_ID)
  void setDeptId(Integer deptId);

  static Employee create() {
    return Struct.create(Employee.class);
  }
}
