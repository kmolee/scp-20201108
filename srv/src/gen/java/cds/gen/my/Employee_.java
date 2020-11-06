package cds.gen.my;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("my.Employee")
public interface Employee_ extends StructuredType<Employee_> {
  String CDS_NAME = "my.Employee";

  ElementRef<String> name();

  ElementRef<Integer> ID();

  Dept_ dept();

  Dept_ dept(Function<Dept_, CqnPredicate> filter);

  ElementRef<Integer> salary();

  ElementRef<Integer> dept_ID();
}
