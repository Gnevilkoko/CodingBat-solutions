 if(str.length() < 3) return false;

  int firstPosition = str.length()/2-2;
  int secondPosition = str.length()/2-1;

  if(str.length() % 2 == 0){
      return str.substring(firstPosition, firstPosition+3).equalsIgnoreCase("xyz") ||
              str.substring(secondPosition, secondPosition+3).equalsIgnoreCase("xyz");
  }
  return str.substring(secondPosition,secondPosition+3).equalsIgnoreCase("xyz");
