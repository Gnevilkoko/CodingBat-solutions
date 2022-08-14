public String startOz(String str) {
        String done = "";
        if(str.length() >= 1 && str.charAt(0) == 'o') done = done + str.charAt(0);
        if(str.length() >= 2 && str.charAt(1) == 'z') done = done + str.charAt(1);
        return done;
}
