public String lastChars(String a, String b) {
  if(a.length() == 0) a = "@";
  if(b.length() == 0) b = "@";
  return a.charAt(0) + String.valueOf(b.charAt(b.length()-1));

}
