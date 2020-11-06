package cds.gen.my;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("my.Books")
public interface Books_ extends StructuredType<Books_> {
  String CDS_NAME = "my.Books";

  Authors_ author();

  Authors_ author(Function<Authors_, CqnPredicate> filter);

  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<Integer> stock();

  ElementRef<Integer> author_ID();
}
