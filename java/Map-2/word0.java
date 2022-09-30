public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(String key : strings){
    map.put(key, 0);
  }
  return map;
}
