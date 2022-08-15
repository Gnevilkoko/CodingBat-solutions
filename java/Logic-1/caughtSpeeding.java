public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday) speed -= 5;
  if(speed <= 60) return 0;
  else if(speed >= 61 && speed <=80) return 1;
  return 2;
}
