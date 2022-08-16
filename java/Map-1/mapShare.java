public Map<String, String> mapShare(Map<String, String> map) {
  if(map.containsKey("c")) map.remove("c");
  if(map.containsKey("a")) map.put("b", map.get("a"));
  return map;
}
