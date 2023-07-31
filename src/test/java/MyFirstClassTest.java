import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstClassTest {

    @Test
    public void canAddTwoPlusTwo() {
            int answer = 2 + 2;
            Assert.assertEquals(answer, 4);
        }


   public static int addition(int a, int b)
   {
       int answer =a+b;
       return answer;
   }

//   public  void printArray()
//   {
////       String[] stringArray = new String[2];
////       stringArray[0]= "Hello";
////       stringArray[1]= "Rahul";
//       String stringArray[] = {"Hello","Rahul"};
//       for (int i=0; i<stringArray.length; i++)
//       {
//           System.out.print(stringArray[i]+" ");
//
//       }
//       System.out.println();
//       for (String name:stringArray)
//       {
//           System.out.println(name);
//       }
//
//   }
    }

