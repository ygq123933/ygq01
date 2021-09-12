package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Map集合白能力的第二种方法：使用entry对象遍历
步骤：
1.使用Map集合中的方法entrySet(),把Map集合中多个entry对象取出来存储到一个set集合当中
2.遍历set集合获取内一个entry对象
3.使用entry集合中的方法getKey()和个体getValue()获取键与值
* */
public class Entry {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("huren",12);
        map.put("kauichuan",13);
        map.put("Gs",14);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
           // 3.使用entry集合中的方法getKey()和个体getValue()获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("----------");
        for ( Map.Entry<String, Integer> entry:set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
