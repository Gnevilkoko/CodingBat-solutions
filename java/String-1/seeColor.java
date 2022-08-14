public String seeColor(String str) {
  if(str.length() < 3) return "";
  if(str.substring(0, 3).contains("red")) return "red";
  else if(str.length() > 3 && str.substring(0,4).contains("blue")) return "blue";
  return "";
}
