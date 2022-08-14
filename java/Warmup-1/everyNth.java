public String everyNth(String str, int n) {
   String done = "";
        for(int i = 0; i < str.length(); i = i + n){
            done = done + str.charAt(i);
        }
        return done;
}
