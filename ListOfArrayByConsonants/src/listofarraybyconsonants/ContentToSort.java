
import java.util.ArrayList;
import java.util.List;

//@Date Oct 25, 2016
//@author Artsiom_Berazavik

public class ContentToSort {
    public static void main(String[] args) {
    //Add 3 sentence to test. 
        String str1 = "Here is a string.";
        String str2 = "Here is a string number two.";
        String str3 = "Here is a next string to compare";
        
    //Prepare arrays from the sentence characters.
        char[] str1ToChar = str1.toCharArray(); 
        char[] str2ToChar = str2.toCharArray();
        char[] str3ToChar = str3.toCharArray();
        
    //Move char arrays to ArrayLists 
        List<Character> arrList1 = new ArrayList<>();
        for(char i : str1ToChar) {
            arrList1.add(i);
        }
        
        List<Character> arrList2 = new ArrayList<>();
        for(char i : str2ToChar) {
            arrList2.add(i);
        }
        
        List<Character> arrList3 = new ArrayList<>();
        for(char i : str3ToChar) {
            arrList3.add(i);
        }
        
    //Prepare Array List of all English consonants.
        ArrayList consonants = new ArrayList();
        for (char i : "bcdfjklmpqrstvwxz".toCharArray()) {
            consonants.add(i);
        }
    
    //Prepare ArrayList of all English vowels.
        ArrayList vowels = new ArrayList();
        for (char i : "eyuioa".toCharArray()) {
            vowels.add(i);
        }
        
    }
}
