boolean doubleX(String str) {
  int index = str.indexOf('x');
       if(index == -1) return false;
       if(index == str.length()-1) return false;
       return str.substring(index+1, index+2).equalsIgnoreCase("x");
}
