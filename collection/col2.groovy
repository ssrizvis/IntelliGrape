List l=(5..50)
println l.groupBy{
if(it%5==0)
{
return 'Divisible by 5'}
else
{
return 'Not Divisible by 5'
}}