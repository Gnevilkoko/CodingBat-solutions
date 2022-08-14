public int intMax(int a, int b, int c) {
  int values[] = {a, b, c};
        int max = -19;
        for(int i = 0; i<3; i++){
            if(values[i] > max) max = values[i];
        }
        return max;
}
