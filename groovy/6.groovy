List l=(1..10)
println l.groupBy {
if (it%2==0) { return 'even'}
else {return 'odd'}
}