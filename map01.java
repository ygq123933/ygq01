package Map;

import java.util.HashMap;
import java.util.Map;

/*1.Map集合是一个双列集合，一个元素包含两个值（key,value）
2.key和value的数据类型既可以相同，也可以不同,且一一对应.
3.key不允许重复,value可以重复.
  实现类HashMap:查询快,无序集合
  HashMap集合的子类：LinkedHashMap有序集合

 */
public class map01 {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Map<String,String>map=new HashMap<>();
        String map1 = map.put("李浩", "王浩");
        String map2 = map.put("李浩", "王浩2");
map.put("zms","Laker");
map.put("dlt","brooklan");
map.put("kurry","Gs");
        //System.out.println("map2"+map2);
        System.out.println(map);

    }
}
