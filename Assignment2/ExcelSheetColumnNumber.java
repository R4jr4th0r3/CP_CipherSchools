import java.util.*;

class ExcelSheetColumnNumber{
    public int titleToNumber(String s) {
        int ans = 0, counter = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            ans += (s.charAt(i) - 64) * Math.pow(26,counter++);
        }
        return ans;
    }
}



