package cds.gen.bookservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("BookService.BookSrv")
public interface BookSrv_ extends StructuredType<BookSrv_> {
  String CDS_NAME = "BookService.BookSrv";

  AuthorSrv_ author();

  AuthorSrv_ author(Function<AuthorSrv_, CqnPredicate> filter);

  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<Integer> stock();

  ElementRef<Integer> author_ID();
}
