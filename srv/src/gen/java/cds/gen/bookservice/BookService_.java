package cds.gen.bookservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("BookService")
public interface BookService_ {
  String CDS_NAME = "BookService";

  Class<AuthorSrv_> AUTHOR_SRV = AuthorSrv_.class;

  Class<BookSrv_> BOOK_SRV = BookSrv_.class;
}
