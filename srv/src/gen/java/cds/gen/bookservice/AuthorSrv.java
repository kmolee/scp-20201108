package cds.gen.bookservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("BookService.AuthorSrv")
public interface AuthorSrv extends CdsData {
  String BOOK = "book";

  String NAME = "name";

  String ID = "ID";

  List<BookSrv> getBook();

  void setBook(List<? extends Map<String, ?>> book);

  String getName();

  void setName(String name);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  static AuthorSrv create() {
    return Struct.create(AuthorSrv.class);
  }
}
