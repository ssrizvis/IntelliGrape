class Person
{
   private String name;
   private int age;
   private String gen;
   private String add; 
   public String getname()
   {
    return name;
   }
   public int getage()
   {
    return age;
   }
   public String getgender()
   {
    return gen;
   }
   public String getaddress()
   {
    return add;
   }
   public static void main(String...a)
   {
      def obj=new Person();
      obj.name="Shahzad";
      obj.age=24;
      obj.gen="male";
      obj.add="Delhi";
      System.out.println("NAME: "+obj.getname());
      System.out.println("AGE: "+obj.getage());
      System.out.println("GENDER: "+obj.getgender());
      System.out.println("ADDRESS: "+obj.getaddress());
   }
}
