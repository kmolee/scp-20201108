using { my } from '../db/sample'; //Entity모델을Import함.my는alias
service EmployeeService {           //노출할서비스를업무성격에따라서묶음.
entity DeptSrv as projection on my.Dept;//Entity컬럼전체를외부로노출
entity EmployeeSrv as select from my.Employee{ * };//*대신컬럼을선택적으로노출할수있음.
}