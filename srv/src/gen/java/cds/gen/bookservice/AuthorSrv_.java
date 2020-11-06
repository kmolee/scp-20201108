package cds.gen.bookservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("BookService.AuthorSrv")
public interface AuthorSrv_ extends StructuredType<AuthorSrv_> {
  String CDS_NAME = "BookService.AuthorSrv";

  BookSrv_ book();

  BookSrv_ book(Function<BookSrv_, CqnPredicate> filter);

  ElementRef<String> name();

  ElementRef<Integer> ID();
}
