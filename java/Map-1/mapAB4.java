public Map<String, String> mapAB4(Map<String, String> map) {
  if(!map.containsKey("a") || !map.containsKey("b")){
    return map;
  }
  
  int lenA = map.get("a").length();
  int lenB = map.get("b").length();
  
  if(lenA == lenB){
    map.put("a", "");
    map.put("b", "");
  } else if(lenA > lenB) map.put("c", map.get("a"));
  else map.put("c", map.get("b"));
  return map;
}
