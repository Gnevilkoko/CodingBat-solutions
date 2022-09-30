public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(String key: strings){
    map.put(key, key.length());
  }
  return map;
}
