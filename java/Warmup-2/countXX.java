int countXX(String str) {
   int count = 0;
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i<sb.length(); i++){
            if(i == sb.length()-1) return count;
            if(sb.charAt(i) == 'x' || sb.charAt(i) == 'X'){
                if(sb.charAt(i+1) == 'x' || sb.charAt(i+1) == 'X'){
                    count++;
                }
            }
        }
        return count;
}
