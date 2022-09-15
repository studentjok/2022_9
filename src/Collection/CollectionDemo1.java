package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection list = new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("mybatis");
        list.add("23");
        list.add("23");
        list.add("true");
        list.add("false");
        list.add("collection");
        System.out.println(list);



    }
}
