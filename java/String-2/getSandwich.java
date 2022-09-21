public String getSandwich(String str) {
  int from = -1;
  int to = -1;
  for (int i = 0; i <str.length()-4; i++){
     if(str.substring(i, i+5).equalsIgnoreCase("bread")){
         if (from == -1) {
             from = i + 5;
         } else {
             to = i;
         }
     }
  }
  if(from == -1 || to == -1) return "";
  else return str.substring(from, to);
}
