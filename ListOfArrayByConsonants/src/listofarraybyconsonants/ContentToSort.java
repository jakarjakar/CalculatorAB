
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.print.DocFlavor;

//@Date Oct 25, 2016
//@author Artsiom_Berazavik

public class ContentToSort {
    public static void main(String[] args) {
    //Add 3 sentence fo test. 
        String str1H = "Here is a next string to compare";
        String str2H = "Here is a string number two.";
        String str3H = "Here is a string.";
        
    //lovercase sentences
        String str1 = str1H.toLowerCase();
        String str2 = str2H.toLowerCase();
        String str3 = str3H.toLowerCase();
        
    //Prepare arrays from the sentence characters.
        char[] str1ToChar = str1.toCharArray(); 
        char[] str2ToChar = str2.toCharArray();
        char[] str3ToChar = str3.toCharArray();
        
    //Move char arrays to ArrayLists 
        List<Character> arrList1 = new ArrayList<>();
        for(char i : str1ToChar) {
            arrList1.add(i);
        }
        System.out.println(arrList1);
        
        List<Character> arrList2 = new ArrayList<>();
        for(char i : str2ToChar) {
            arrList2.add(i);
        }
        
        List<Character> arrList3 = new ArrayList<>();
        for(char i : str3ToChar) {
            arrList3.add(i);
        }
        
//    //Aff all ArraLists in resultUnRated ArrayList
//        ArrayList resultUnRated = new ArrayList();
//        resultUnRated.add(arrList1);
//        resultUnRated.add(arrList2);
//        resultUnRated.add(arrList3);
                
    //Prepare Array List of all English consonants.
        List<Character> consonants = new ArrayList<>();
        for (char i : "wrtpsdfghjklzxcvbnm".toCharArray()) {
            consonants.add(i);
        }
    
//    //Prepare ArrayList of all English vowels.
//        ArrayList vowels = new ArrayList();
//        for (char i : "eyuioa".toCharArray()) {
//            vowels.add(i);
//        }
        
        int nConc = 0;
        
        ArrayList<Object> ratedList = new ArrayList<Object>();
        for (int i = 0; i < 999; i++) {
            ratedList.add(i, null);
        }        
        
        System.out.println("First printed most /consonants/ sentences");
        
        for (int i = 0; i < arrList1.size(); i++) {
            for (int j = 0; j < consonants.size(); j++) {
                if (Objects.equals(arrList1.get(i), consonants.get(j))) {
                    //IDE changed arrList1.get(i) == consonants.get(j) 
                    nConc++;
                } //end of if
            } //end of consonant for
        } //end of arrList1 for
        ratedList.add(nConc, str1H);
        
        for (int i = 0; i < arrList2.size(); i++) {
            for (int j = 0; j < consonants.size(); j++) {
                if (Objects.equals(arrList1.get(i), consonants.get(j))) {
                    //IDE changed arrList1.get(i) == consonants.get(j) 
                    nConc++;
                } //end of if
            } //end of consonant for
        } //end of arrList1 for
        ratedList.add(nConc, str2H);
        
        for (int i = 0; i < arrList3.size(); i++) {
            for (int j = 0; j < consonants.size(); j++) {
                if (Objects.equals(arrList3.get(i), consonants.get(j))) {
                    //IDE changed arrList1.get(i) == consonants.get(j) 
                    nConc++;
                } //end of if
            } //end of consonant for
        } //end of arrList1 for
        ratedList.add(nConc, str3H);
        
        
        
        for (int i = 0; i < 999; i++) {
            if (ratedList.get(i) !=null) {
                System.out.println(ratedList.get(i));
            }
            
        }

        

        



        
 
    }
    
}

