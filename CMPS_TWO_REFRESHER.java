import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CMPS_TWO_REFRESHER {
    public static String name = "Erol";
    private int age;

    public CMPS_TWO_REFRESHER(int age) {

    }

    public static String hello() {
        return "Hello World";
    };

    public static void main(String[] args) throws IOException {
        ArrayList<person> list = new ArrayList<>();

        person e = new person("Erik", 21);  //Objects
        person n = new person("Nahum", 21);
        person s = new person("Sergio", 21);

        list.add(e);    //arrayList
        list.add(n);
        list.add(s);

        list.remove(0);
        System.out.println(list.get(1).details());

        musician se = new musician("Sergio", 21, "Tuba");   //child & inheritance
        System.out.println(se.details());

        n.people();
        System.out.println(n);
        System.out.println(se);

        System.out.println("Happy?: " + e.isHappy());   //interfaces
        System.out.println("Thirsty?: " + e.amIThirsty());
        System.out.println("Hungry? " + e.amIHungry());

//        Exceptions
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        try{
            for(int i = 0; i <= 11; i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(IndexOutOfBoundsException error)
        {
            System.out.println("The array is not the big");
//            throw new IndexOutOfBoundsException("Too big");
        }
        finally {
            System.out.println("We are done");
        }


//        File IO
//        File csv = new File("/csvFile.xlsx");
        FileReader fr = new FileReader("C:\\Users\\Sergo\\Documents\\Coding\\AlgoExpert\\KSU\\KSU_CSE_Practice\\src\\random.txt");
        BufferedReader br = new BufferedReader(fr);

        ArrayList<String> fileNumbers = new ArrayList<>();

        String line = br.readLine();
        while(line != null)
        {
            fileNumbers.add(line);
            line = br.readLine();
        }

        for (String fileNumber : fileNumbers) {
            System.out.println(fileNumber);
        }

//        Recursion call
        System.out.println(recursive(100));
        System.out.println(recursive(5));
        System.out.println(recursive(10));
        System.out.println(recursive(50));

//        Maps
        Map<String, String> map = new HashMap<>();
        map.put("Erik Setup", "Laptop");
        map.put("NahumSetup", "PC");
        map.put("NahumOtherSetup", "Laptop");
        map.put("SergioSetup", "Laptop");

        map.remove("SergioSetup");
        System.out.println("Is the map empty?: " + map.isEmpty());
        System.out.println("Is SergioSetup in the map?: " + map.containsKey("SergioSetup"));
        System.out.println("Give me Erik's setup. " + map.get("Erik Setup"));
        System.out.println("Give me Nahum's other setup. "  + map.get("NahumOtherSetup"));

        String name = "John ";

        if(!map.isEmpty())
        {
            if(map.containsKey(name+"Setup"))
            {
                System.out.println("Map usage: " + map.get(name+"Setup"));
            }
        }

    }


    //    Recursion
    public static int recursive(int num)
    {
        if(num <10)
        {
            return num;
        }
        int number = num - 1;

        return recursive(number);
    }
}
