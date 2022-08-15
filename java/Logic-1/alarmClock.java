public String alarmClock(int day, boolean vacation) {
  if(vacation){
    if(day == 6 || day == 0) return "off";
    return "10:00";
  }
  if(day >= 1 && day <= 5) return "7:00";
  return "10:00";
}
