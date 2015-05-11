def file=new File('syed.txt')
def nfile=new File('shahzad.txt')
def x
file.eachLine{line->print line
   x=line.replaceAll("\\s","")
   nfile<<x;
}

