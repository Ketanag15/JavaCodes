package DSA;

//387. First Unique Character in a String
//https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "areyaaaaar";
        int index = firstUniqChar(s);
        System.out.println(index);
    }
    public static int firstUniqChar(String s) {
        int[] fixedArray = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            fixedArray[c-'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(fixedArray[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
