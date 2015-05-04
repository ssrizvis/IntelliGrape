File a=new File('x4.png');
File b=new File('new.png');
b.bytes=a.bytes

/*b.withInputStream{ins->
a.withOutputStream{ous->
ous<<ins
}
}
new File("new.gif").withOutputStream{os->
 new File("x4.png").withInputStream{is->
 is<<os
 }
 }*/