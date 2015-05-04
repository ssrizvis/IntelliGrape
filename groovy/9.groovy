def file=new File('aroop.txt')
def nfile=new File('new2.txt')
def x
file.eachLine{line->print line
   x=line.replaceAll("\\s","")
   nfile<<x;
}

