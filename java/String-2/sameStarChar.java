public boolean sameStarChar(String str) {
  for (int i = 0; i<str.length(); i++){
      if(str.charAt(i) == '*'){
          if(i == 0 || i == str.length()-1) continue;
          if(!str.substring(i-1, i).equalsIgnoreCase(str.substring(i+1, i+2))) return false;
      }
  }
  return true;
}
