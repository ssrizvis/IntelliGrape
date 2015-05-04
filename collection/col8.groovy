class Employee
{
  String Name;
  byte age;
  int salary;
}
Object[] obj=
[
new Employee(name:'yogesh',age:23 as byte,salary:20000),
new Employee(name:'anil',age:53 as byte,salary:3000),
new Employee(name:'hari',age:83 as byte,salary:3000),
new Employee(name:'sonu',age:13 as byte,salary:4000),
new Employee(name:'sanu',age:53 as byte,salary:6000),
new Employee(name:'akshay',age:23 as byte,salary:25000),
new Employee(name:'shivam',age:93 as byte,salary:20000),
new Employee(name:'akshat',age:63 as byte,salary:55000),
new Employee(name:'aneesh',age:43 as byte,salary:45000),
new Employee(name:'aditya',age:33 as byte,salary:35000),
]
10.times
{
print obj[it].Name+"\t"
print obj[it].age+"\t"
print obj[it].salary+"\n"
}
List l=[obj[0],obj[1]];
print l;
