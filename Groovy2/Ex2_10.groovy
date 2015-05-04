Map m=['Computing':['Computing':600,'InformationSystems':300],'Engineering':['Civil':200,'Mechanical':100],'Management':['Management':800]]
List l=m.keySet() as List
println "Number of Departments= "+ l.size()
Map x=m."Computing"
println "Number of Programs by Computing Department:"+x.size()
println "Students in Civil Engineering Program= "+ m.'Engineering'.'Civil'

//Number of Departments= 3
//Number of Programs by Computing Department:2
//Students in Civil Engineering Program= 200

