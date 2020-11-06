package cds.gen.bookservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("BookService.BookSrv")
public interface BookSrv extends CdsData {
  String AUTHOR = "author";

  String ID = "ID";

  String TITLE = "title";

  String STOCK = "stock";

  String AUTHOR_ID = "author_ID";

  AuthorSrv getAuthor();

  void setAuthor(Map<String, ?> author);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getTitle();

  void setTitle(String title);

  Integer getStock();

  void setStock(Integer stock);

  @CdsName(AUTHOR_ID)
  Integer getAuthorId();

  @CdsName(AUTHOR_ID)
  void setAuthorId(Integer authorId);

  static BookSrv create() {
    return Struct.create(BookSrv.class);
  }
}
