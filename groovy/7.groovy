dirName ="files"
def nfile=new File("new3.txt")
new File(dirName).eachFile()
{
   file-> file.eachLine{line->nfile<<line<<"\n";}
}