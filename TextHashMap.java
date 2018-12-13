import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
/**
 * TextHashMap
 */
public class TextHashMap {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        HashMap hashMap = new HashMap();
        hashMap.put("a", "1544529489581");    
        hashMap.put("b", "bbb");    
        hashMap.put("c", "ccc");    
        hashMap.put("d", "ddd"); 
        String tmp = hashMap.get("a").toString();
        Date date = new Date(Long.parseLong(tmp));
        // String tmp2 = "2018-12-11 19:58:16.252";
        // Date date2 = simpleDateFormat.parse(tmp2);
        // long ts = date2.getTime();
        hashMap.put("a", simpleDateFormat.format(date));
        // System.out.println(String.valueOf(ts));
        System.out.println(hashMap.get("a"));
    }
}
