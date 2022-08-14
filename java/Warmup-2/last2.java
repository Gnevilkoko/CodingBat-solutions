public int last2(String str) {
  if(str.length() <= 1) return 0;
  String chars = str.substring(str.length()-2, str.length());
        byte count = 0;
        for(int i = 0; i<str.length()-2; i++){
        
           if(str.substring(i,i+2).equalsIgnoreCase(chars))  count++;
        }
        return count;
}
