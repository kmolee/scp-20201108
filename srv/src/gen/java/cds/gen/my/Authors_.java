package cds.gen.my;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("my.Authors")
public interface Authors_ extends StructuredType<Authors_> {
  String CDS_NAME = "my.Authors";

  Books_ book();

  Books_ book(Function<Books_, CqnPredicate> filter);

  ElementRef<String> name();

  ElementRef<Integer> ID();
}
