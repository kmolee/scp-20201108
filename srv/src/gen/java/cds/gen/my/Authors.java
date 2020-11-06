package cds.gen.my;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("my.Authors")
public interface Authors extends CdsData {
  String BOOK = "book";

  String NAME = "name";

  String ID = "ID";

  List<Books> getBook();

  void setBook(List<? extends Map<String, ?>> book);

  String getName();

  void setName(String name);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  static Authors create() {
    return Struct.create(Authors.class);
  }
}
