package responsibility.chain_of_responsibility.oschina.advise4;

import responsibility.chain_of_responsibility.oschina.advise4.HtmlFilter;

public class Test {
    public static void main(String[] args) {
        String str = "你好:)，这句话中有敏感词汇，需要处理。<script>，敏感！";
        System.out.println(str);

        FilterChain chain = new FilterChain();
        chain.addFilter(new HtmlFilter()).addFilter(new SmileFilter()).addFilter(new SensitivityFilter());

        Request req = new Request();
        req.setRequestStr(str);
        
        Response resp = new Response();
        
        chain.doFilter(req, resp, chain);
        
        
    }
}
