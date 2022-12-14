public String wordAppend(String[] strings) {
  Set<String> set = new HashSet<>();
  StringBuilder result = new StringBuilder();
  for(int i = 0; i < strings.length; i++){
    String ch = strings[i].substring(0, strings[i].length());
    if(set.contains(ch)){
      set.remove(ch);
      result.append(ch);
    } else {
      set.add(ch);
    }
  }
  return result.toString();
}
