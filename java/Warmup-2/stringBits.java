public String stringBits(String str) {
  StringBuilder result = new StringBuilder();
        for(int i = 0; i<str.length(); i +=2){
            result.append(str.charAt(i));
        }
        return result.toString();
}
