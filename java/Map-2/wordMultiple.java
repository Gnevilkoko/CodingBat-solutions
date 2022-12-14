public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<>();
  for(int i = 0; i < strings.length; i++){
    String str = strings[i].substring(0, strings[i].length());
    if(!map.containsKey(str)){
      map.put(str, false);
      continue;
    }
    map.put(str, true);
  }
  return map;
}
