import com.javafortesters.domainentities.User;

public class MyFirstClassTestMain {


   User obj = new User();
//    int b= obj.a;


    public static int addition(int a,int b)
    {

        int answer =a+b;
        return answer;
    }

    public static void printArray()
    {
//       String[] stringArray = new String[2];
//       stringArray[0]= "Hello";
//       stringArray[1]= "Rahul";
        String stringArray[] = {"Hello","Rahul"};
        for (int i=0; i<stringArray.length; i++)
        {
            System.out.print(stringArray[i]+" ");

        }
        System.out.println();
        for (String name:stringArray)
        {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {

        MyFirstClassTestMain obj = new MyFirstClassTestMain();
//        System.out.println(obj.b);
    }
    }

