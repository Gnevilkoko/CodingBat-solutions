public Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")) {
    String ab = map.get("a") + map.get("b");
    map.put("ab", ab);
  }
  return map;
}
