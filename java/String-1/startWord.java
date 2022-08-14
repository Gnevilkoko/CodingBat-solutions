public String startWord(String str, String word) {
  if(str.length() == 0) return "";
 String newWord;
       if(word.length() >= 2) newWord = word.substring(1);
       else newWord = word;
       if(word.length() <= 1) return str.substring(0, 1);
       if(str.substring(1).contains(newWord)) {
           return str.charAt(0) + str.substring(1, word.length());
       }
       return "";
}
