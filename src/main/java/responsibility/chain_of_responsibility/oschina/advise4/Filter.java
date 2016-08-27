package responsibility.chain_of_responsibility.oschina.advise4;

public interface Filter {
    void doFilter(Request request, Response response , FilterChain chain);
}
