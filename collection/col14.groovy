List l=(1..100)
println l
l.each({
   if(it%15==0)
   print " "+"FizzBuzz"
   else if(it%3==0)
   print " "+"Fizz"
   else if(it%5==0)
   print " "+"Buzz"
   else
   print " "+it
})
