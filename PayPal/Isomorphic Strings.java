//Isomorphic strings
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sTot = new char[256];
        char[] tTos = new char[256];
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sTot[sChar] == 0 && tTos[tChar] == 0) {
                sTot[sChar] = tChar;
                tTos[tChar] = sChar;
            } else if(sTot[sChar] != tChar) {
                return false;
            } 
        }
        return true;
    }
}