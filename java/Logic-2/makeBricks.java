public boolean makeBricks(int small, int big, int goal) {
   int maxBig = goal/5;

        if(big > maxBig) goal -= maxBig*5;
        else goal -= big*5;

        return goal <= small;
}
