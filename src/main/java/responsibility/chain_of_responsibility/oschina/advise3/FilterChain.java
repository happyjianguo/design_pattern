package responsibility.chain_of_responsibility.oschina.advise3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filters = new ArrayList<Filter>();

    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }
    

    public String doFilter(String str) {
        if (null != str && !("").equals(str.trim())) {
            for (Filter f : filters) {
                str = f.doFilter(str);
            }
        }
        return str;
    }
}
