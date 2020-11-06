package cds.gen.my;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("my")
public interface My_ {
  String CDS_NAME = "my";

  Class<Authors_> AUTHORS = Authors_.class;

  Class<Dept_> DEPT = Dept_.class;

  Class<Books_> BOOKS = Books_.class;

  Class<Employee_> EMPLOYEE = Employee_.class;
}
