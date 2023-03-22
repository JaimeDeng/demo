package practice;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ValueComparator implements Comparator<String> {
	
    Map<String, Integer> base;

    public ValueComparator() {
        this.base = new TreeMap<>();
    }

    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    @Override
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return 1;
        } else {
            return -1;
        }
    }
}