
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Date Oct 25, 2016
//@author Artsiom_Berazavik

public class ContentToSort {
    public static void main(String[] args) {
        
//    
//    //создать массив строк
//    String [] strMassive = new String[5];
//    
//   //заполнить массиы предложениями на английском
//    strMassive[0] = "Some sentence with different words.";
    
//    ArrayList<String> myString = new ArrayList<String>();
//    myString.add("The issue with arrays is that they are"
//            + " of fixed length so if it is full we cannot"
//            + " add any more elements to it, likewise if there"
//            + " are number of elements gets removed from it the"
//            + " memory consumption would be the same as it doesn’"
//            + "t shrink.");
//    myString.add("On the other ArrayList can dynamically grow and "
//            + "shrink as per the need. ");
//    myString.add("Apart from these benefits ArrayList class enables"
//            + " us to use predefined methods of it which makes our "
//            + "task easy.");
//    myString.add("Let’s see the ArrayList example first then we will"
//            + " discuss it’s methods and their usage.");
//    
//    //Для понимания, выводим в аутпут содержание myString
//    
//        System.out.println(myString.get(0));
//        
//    //посчитать количество букв в строке
//    
//    myString.contains("r");
//    Scanner in = new Scanner(System.in);

        String str1 = "Here is a string.";
        String str2 = "Here is a string number two.";
        String str3 = "Here is a next string to compare";
    
        char[] str1ToChar = str1.toCharArray(); System.out.println(Arrays.toString(str1ToChar));
        char[] str2ToChar = str2.toCharArray(); System.out.println(Arrays.toString(str2ToChar));
        char[] str3ToChar = str3.toCharArray(); System.out.println(Arrays.toString(str3ToChar));
        
        ArrayList consonants = new ArrayList();
        for (char i : "bcdfjklmpqrstvwxz".toCharArray()) {
            consonants.add(i);
        }
        
        ArrayList vowels = new ArrayList();
        for (char i : "eyuioa".toCharArray()) {
            vowels.add(i);
        }
        
        System.out.println("Vizualize the ArrayList content: " + consonants.get(2) + vowels.get(3));
        
        System.out.println(str1);
        String [] str1ToCharArray = str1.split(","); System.out.println(Arrays.toString(str1ToCharArray));
        
        ArrayList<String> str1List = new ArrayList<String>(Arrays.asList(str1ToCharArray)); System.out.println(str1List.get(0));
        
        List<Character> arrList1 = new ArrayList<>();
        for(char i : str1ToChar) {
            arrList1.add(i);
        }
        System.out.println(arrList1.get(0));
        System.out.println(arrList1.size());
        
       
    
    }
}
