public boolean catDog(String str) {
  if(str.length() < 3) return true;
  
  int catCount = 0;
  int dogCount = 0;
  
  for(int i = 0; i < str.length()-2;i++){
    if(str.substring(i, i+3).contains("cat")) catCount++;
    else if(str.substring(i, i+3).contains("dog")) dogCount++;
  }
  return catCount == dogCount;
}
