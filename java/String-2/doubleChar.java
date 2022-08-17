public String doubleChar(String str) {
 StringBuilder result = new StringBuilder();
  for(Character ch : str.toCharArray()){
      result.append(ch).append(ch);
  }
  return result.toString();
}
