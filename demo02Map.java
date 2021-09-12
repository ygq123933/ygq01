package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo02Map {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, Integer> map=new HashMap<>();
        map.put("huren",12);
        map.put("kauichuan",13);
        map.put("Gs",14);
        //使用Map集合中的方法keySet(),取出Map集合中的key,存储到一个set集合中
        Set<String>set=map.keySet();
        //使用迭代器遍历set集合
        Iterator<String>it=set.iterator();
        while(it.hasNext()){
            String key=it.next();
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("++++++++++++++++");
        for (String key:map.keySet()) {
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
