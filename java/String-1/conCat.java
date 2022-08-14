public String conCat(String a, String b) {
  if(!b.isEmpty() && !a.isEmpty() && a.charAt(a.length()-1) == b.charAt(0)) a = a.substring(0, a.length()-1);
  return a + b;
}
