import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Date Oct 25, 2016
//@author Artsiom_Berazavik

public class ContentToSort {
    public static void main(String[] args) {
    //Add 3 sentence fo test 
        String str1H = "Here is a next string to compare.";
        String str2H = "Here is a string number two.";
        String str3H = "Here is a next string to comparerr.";
        
    //Lovercase sentences
        String str1 = str1H.toLowerCase();
        String str2 = str2H.toLowerCase();
        String str3 = str3H.toLowerCase();
        
    //Prepare arrays from the sentence characters
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
        List<Character> consonants = new ArrayList<>();
        for (char i : "wrtpsdfghjklzxcvbnm".toCharArray()) {
            consonants.add(i);
        }
    //Fill rateList by null's to avoid exception when add non onbject by index
        ArrayList<Object> ratedList = new ArrayList<Object>();
        for (int i = 0; i < 999; i++) {
            ratedList.add(i, null);
        }        

    /*For loops will be moved to separate method and class. This "code" is just Prototype.
    Inside two loops there is comparing every letter in sentence with the consonants
    When leеtter in the sentence equal of any consonant counter++
    */
        int n1Conc = 0;
        for (int i = 0; i < arrList1.size(); i++) {
            for (int j = 0; j < consonants.size(); j++) {
                if (Objects.equals(arrList1.get(i), consonants.get(j))) {
                    //IDE changed arrList1.get(i) == consonants.get(j) 
                    n1Conc++;
                } //end of if
            } //end of consonant for
        } //end of arrList1 for
        ratedList.add(n1Conc, str1H);
        
        int n2Conc = 0;
        for (int i = 0; i < arrList2.size(); i++) {
            for (int j = 0; j < consonants.size(); j++) {
                if (Objects.equals(arrList1.get(i), consonants.get(j))) {
                    //IDE changed arrList1.get(i) == consonants.get(j) 
                    n2Conc++;
                } //end of if
            } //end of consonant for
        } //end of arrList2 for
        ratedList.add(n2Conc, str2H);

        int n3Conc = 0;
        for (int i = 0; i < arrList3.size(); i++) {
            for (int j = 0; j < consonants.size(); j++) {
                if (Objects.equals(arrList3.get(i), consonants.get(j))) {
                    //IDE changed arrList1.get(i) == consonants.get(j) 
                    n3Conc++;
                } //end of if
            } //end of consonant for
        } //end of arrList3 for
        ratedList.add(n3Conc, str3H);

        //Print sorted list.
        System.out.println("First printed less /consonants/ sentences:");
        for (int i = 0; i < 999; i++) {
            if (ratedList.get(i) !=null) {
                System.out.println(ratedList.get(i));
            }
        }
    }
}

