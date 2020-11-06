using { my } from '../db/sample'; //Entity모델을Import함.my는alias
service BookService {           //노출할서비스를업무성격에따라서묶음.
entity AuthorSrv as projection on my.Authors;//Entity컬럼전체를외부로노출
entity BookSrv as select from my.Books{ * };//*대신컬럼을선택적으로노출할수있음.
}