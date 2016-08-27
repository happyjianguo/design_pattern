package responsibility.chain_of_responsibility.oschina.advise4;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }

    public void doFilter(Request request, Response response, FilterChain chain) {

        if (index >= chain.filters.size()) {
            return;
        }
        Filter f = chain.filters.get(index);
        index++;
        f.doFilter(request, response, chain);
    }
}
