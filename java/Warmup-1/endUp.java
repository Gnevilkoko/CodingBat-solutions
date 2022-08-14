public String endUp(String str) {
  if(str.length() < 3) return str.toUpperCase();
        String word = "";
        for(int i = str.length()-3; i<str.length(); i++) word = word + str.charAt(i);
        return str.substring(0, str.length()-3) + word.toUpperCase();
}
