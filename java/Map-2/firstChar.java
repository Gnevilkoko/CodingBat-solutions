public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for(int i = 0; i<strings.length; i++){
    if(map.containsKey(strings[i].substring(0, 1))){
      StringBuilder sb = new StringBuilder(map.get(strings[i].substring(0, 1)));
      sb.append(strings[i]);
      map.put(strings[i].substring(0, 1), sb.toString());
    } else {
      map.put(strings[i].substring(0, 1), strings[i]);
    }
  }
  return map;
}
