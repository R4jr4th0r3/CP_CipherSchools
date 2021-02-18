import java.util.*;

class ExcelSheetColumnTitle{
    public String convertToTitle(int n) {
        if(n<=26) return ""+(char)(n+64);
        StringBuffer sb=new StringBuffer();
        while(n>0){
            n--;
            int c=(n%26)+65;
            sb.append(""+(char)c);
            n=n/26;
        }
        return sb.reverse().toString();
    }
}
