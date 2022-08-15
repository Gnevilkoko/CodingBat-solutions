public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep) return false;
  if(isMorning && !isMom) return false;
  return true;
}
