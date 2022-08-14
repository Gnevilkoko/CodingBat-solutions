public String deFront(String str) {    
  String char1 = "";
        String char2 = "";
        if(str.charAt(0) == 'a') char1 = String.valueOf(str.charAt(0));
        if(str.charAt(1) == 'b') char2 = String.valueOf(str.charAt(1));
        return char1 + char2 + str.substring(2);
}
