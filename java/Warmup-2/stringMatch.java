public int stringMatch(String a, String b) {
  int count = 0;
        if(a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        for(int i = 0; i < a.length()-1; i++){
            if(a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1)) count++;
        }
        return count;
}
