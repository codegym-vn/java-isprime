import org.junit.*;
import static org.junit.Assert.*;

/** @author HuyDuc
 * for more things:https://docs.google.com/document/d/19SZkIFGf3nZK2dehTL_mzfUdumRBcFyMIQF3bmkigm8/edit?usp=sharing 
 */
public class lab6Test {
 IsPrime p = new IsPrime();
 //Testing with input =1;
 @Test
 public void IsPrimeTest1(){
     int inputnumber=1;
     assertEquals(String.valueOf(inputnumber)+" is not a prime.", IsPrime.m(inputnumber));
 }
//Testing with input =Integer.MAX_VALUE;
  @Test
 public void IsPrimeTest2(){
     int inputnumber=Integer.MAX_VALUE;
     assertEquals(String.valueOf(inputnumber)+" is not a prime.", IsPrime.m(inputnumber));
 }
  //Testing with input =Integer.MAX_VALUE +1;
  @Test
 public void IsPrimeTest3(){
     int inputnumber=Integer.MAX_VALUE+1;
     assertEquals(String.valueOf(inputnumber)+" is a prime.", IsPrime.m(inputnumber));
 } 
 //Testing with input =Integer.MIN_VALUE;
  @Test(expected = AssertionError.class)
 public void IsPrimeTest4(){
     int inputnumber=Integer.MIN_VALUE;
     assertEquals(AssertionError.class, IsPrime.m(inputnumber));
 }
  //Testing with input ="abc";
  @Test (expected = Exception.class)
 public void IsPrimeTest5(){
     String inputnumber="abc";
     assertEquals(Exception.class, IsPrime.m(Integer.valueOf(inputnumber)));
 }
  
}
