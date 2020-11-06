package cds.gen.my;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("my.Books")
public interface Books extends CdsData {
  String AUTHOR = "author";

  String ID = "ID";

  String TITLE = "title";

  String STOCK = "stock";

  String AUTHOR_ID = "author_ID";

  Authors getAuthor();

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

  static Books create() {
    return Struct.create(Books.class);
  }
}
