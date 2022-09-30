public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for(String key : strings){
      map.put(key.substring(0, 1), key.substring(key.length()-1));
  }
  return map;
}
