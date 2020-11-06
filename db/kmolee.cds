namespace my;

entity Dept {
key ID: Integer;
name: String;
creation_date: Date;
employee:Association to many Employee on employee.dept=$self;
}

entity Employee {
key ID: Integer;
name: String;
salary: Integer;
dept:Association to Dept;
}