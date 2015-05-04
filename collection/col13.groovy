String x="yogesh kumar"
//print x
x.eachWithIndex{p,index->
List l=x.findAll{it==p}
print p+l.size()+"\t";
}
