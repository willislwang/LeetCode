int titleToNumber(char * s){
    int num = 0;
    char *point = s;
    while (*point) {
        num *= 26;
        num += *point - 64;
        point++;
    }
    return num;
}


