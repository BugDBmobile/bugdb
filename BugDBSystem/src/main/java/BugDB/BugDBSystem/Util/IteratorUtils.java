package BugDB.BugDBSystem.Util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by jingwei on 06/04/2017.
 */
public class IteratorUtils {
    public static <T> List<T> toList(Iterable<T> iterable) {
        List<T> copy = new ArrayList<T>();
        Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) copy.add(iterator.next());
        return copy;
    }

    public static <T, S> List<T> toVOList(Iterable<S> iterable, Class<T> ct) {

        List<T> copy = new ArrayList<T>();
        Iterator<S> iterator = iterable.iterator();

        while (iterator.hasNext()) {

            try {
                T t = ct.newInstance();
                BeanUtils.copyProperties(iterator.next(), t);
                copy.add(t);
            } catch (Exception e) {

            }

        }
        return copy;
    }
}
