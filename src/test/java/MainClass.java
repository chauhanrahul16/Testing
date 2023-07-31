//import JavaWithTestNG.test.java.*;

public class MainClass {


    public static void main(String[] args) {
//        System.out.println(MyFirstClassTest.addition(5,6));

//        MyFirstClassTestMain obj = new MyFirstClassTestMain();
//        obj.printArray();
          String[] name= {"Rahul", "sdfsef", "Rahul", "fsdgsdgsdgs", "Rahul"};
          String str= "Hello I am good";
          String[] strArray=str.split("am");
        for (String s:strArray)
        {
         s.trim();
         System.out.println(s);

        }

        int count=0;
        for (int i=0; i<name.length; i++)
        {
            for (int j = i+1; j < name.length; j++)
            {
                if (name[i]==name[j]) {
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}
