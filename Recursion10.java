//remove duplicte elements 

public class Recursion10 {

    public static boolean []map=new boolean[26];

    public static void Duplicates(String str,int idx,String newString){

        if (idx==str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if (map[currChar-'a']==true) {
            Duplicates(str, idx+1, newString);
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            Duplicates(str, idx+1, newString);
        }

    }
    public static void main(String[] args) {
        String str="ababcddc";
        Duplicates(str, 0, "");

    }
    
}
