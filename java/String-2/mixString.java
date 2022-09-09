int maxLen = Math.min(a.length(), b.length());
int counter = 0;
int i = 0;
StringBuilder result = new StringBuilder();

while(counter < maxLen*2){
    if(counter%2 == 0) result.append(a.charAt(i));
    else {
        result.append(b.charAt(i));
        i++;
    }
    counter++;
}
if(a.length() != b.length()){
    if(a.length() < b.length()) result.append(b.substring(i));
    else result.append(a.substring(i));
}
return result.toString();
