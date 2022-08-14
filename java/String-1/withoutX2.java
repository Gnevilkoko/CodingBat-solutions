public String withoutX2(String str) {
  if(str.length() <= 1) return "";
   String result = "";
       for(int i = 0; i < 2; i++){
           if(str.charAt(i) != 'x') result += str.charAt(i);
       }
        return result + str.substring(2);
}
