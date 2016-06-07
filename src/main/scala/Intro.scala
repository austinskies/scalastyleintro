
object Intro extends App {
  
  // "Another Simple Java Solution" from http://c2.com/cgi/wiki?FizzBuzzTest
  //
  //boolean flag = true;

  //for(int i=0;i<16;i++){
  //  if(i%3==0){
  //    System.out.print("Fizz");
  //    flag=false;
  //  }

  //  if(i%5==0){
  //    System.out.print("Buzz");
  //    flag=false;
  //  }

  //  if (flag)
  //    System.out.print(i);

  //  System.out.print(",");

  //  flag = true;

  //}
  import java.util.List
  import java.util.ArrayList
  
  def fizzbuzz(end:Integer):List[Object] = {
    var flag:Boolean = true
    var result:List[Object] = new ArrayList[Object]()
    var buzz:String = "Buzz"
    var fizz:String = "Fizz"
    var i:Integer = 1
    while (i <= end) {
      if (i % 3 == 0) {
        result.add(fizz)
        flag = false
      }
      if (i % 5 == 0) {
        result.add(buzz)
        flag = false
      }
      if (flag) {
        result.add(i)
      }
      if (i < end) result.add(",")
      flag = true
      i = i + 1


    }
    return result


  }

  var n = 0
  var fizzbuzzresult = fizzbuzz(100)
  while (n < fizzbuzzresult.size) {
    print(fizzbuzzresult.get(n))
    n = n + 1
  }
  println

}
