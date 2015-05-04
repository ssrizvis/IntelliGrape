def nfile=new File('new.txt')
def file=new File('aroop.txt')
int var=0;
file.eachLine{line->print line
   var++
   if(var%2!=0)
   nfile<<var<<" "<<line<<"\n";
}

