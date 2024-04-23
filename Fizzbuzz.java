
public class Fizzbuzz{
  public static void main(String[] args) {

  int i=0;
  for(i=1; i<30; i++){
      if(i%3==0)
        System.out.println("FIZZ");
      else if(i%5==0)
        System.out.println("BUZZ");
      else if(i%3==0 && i%5==0)
        System.out.println("FIZZBUZZ");
      else{
      System.out.println(i);
    }
  }
}
}  