public String atFirst(String str) {
  if(str.length() < 2) {
            if (str.length() == 0) return "@@";
            else return str +"@";
        }
        return str.substring(0, 2);
}
