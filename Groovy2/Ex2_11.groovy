class Employee
{
  String Name;
  byte age;
  String dept;
  int e_no;
  int salary;
}
Employee e1=new Employee(name:'aroop',age:23 as byte,dept:'Finance',e_no:101,salary:20000)
Employee e2=new Employee(name:'anil',age:53 as byte,dept:'Marketing',e_no:102,salary:2000)
Employee e3=new Employee(name:'hari',age:83 as byte,dept:'Manufacturing',e_no:103,salary:3000)
Employee e4=new Employee(name:'sonu',age:13 as byte,dept:'Marketing',e_no:104,salary:4000)
Employee e5=new Employee(name:'sanu',age:53 as byte,dept:'Manufacturing',e_no:105,salary:6000)
List l=[e1,e2,e3,e4,e5]
println "<<<<<<<problem1>>>>>>>>"
Map m1=l.groupBy({
     if((it.salary>=0) && (it.salary<=5000))
     return "Within 5000";
     else if((it.salary>5000) && (it.salary<=10000)) 
     return "Within 10000";
     else
     return "above 10000"
})
println m1;

println "<<<<<<<problem2>>>>>>>>"
Map m2=l.groupBy({it.dept})
m2.each({
  print "\t"+it.key+" "+it.value.size();
})
print "\n"

println "<<<<<<<problem3>>>>>>>>"
Map m3=l.groupBy({
if(it.age>18 && it.age<35)
return "Adults"
else
return "Aged"})
println m3

println "<<<<<<<problem4>>>>>>>>"
Map m=l.groupBy{it.name[0]};
println m
m.each{
print "Name Start with:${it.key} and number of Employees with Age >20 are:"
println it.value.countBy({it2->it2.age>20}).get(true)
}

println "<<<<<<<problem5>>>>>>>>"
Map m5=l.groupBy({it.dept})
println m5