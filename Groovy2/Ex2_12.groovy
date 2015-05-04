String str= "http://www.google.com?name=johny&age=20&hobby=cricket"
def var=str.tokenize("?")
def key
var.each{ 
 key=it.split("&")
}
key.each{ 
 println it
}
