public String stringX(String str) {
  if(str.length() <= 0) return "";
        if(str.length() == 1) return String.valueOf(str.charAt(0));
  StringBuilder result = new StringBuilder(String.valueOf(str.charAt(0)));
        for(int i = 1; i<str.length()-1; i++){
            if(str.toLowerCase().charAt(i) != 'x') result.append(str.charAt(i));
        }
        result.append(str.charAt(str.length()-1));
        return result.toString();
}
