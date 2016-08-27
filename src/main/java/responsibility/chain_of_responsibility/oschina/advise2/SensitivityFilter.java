package responsibility.chain_of_responsibility.oschina.advise2;

public class SensitivityFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("敏感", "");
    }

}
