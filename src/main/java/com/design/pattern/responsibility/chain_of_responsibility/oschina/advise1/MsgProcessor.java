package com.design.pattern.responsibility.chain_of_responsibility.oschina.advise1;

public class MsgProcessor {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
               *    这样还是不够灵活，直接在 MsgProcessor 类中添加一个数组来保存过滤器，然后在 processor** 方法中进行多次调用：
     * @return
     */
    public String process() {
        if (null != msg && !("").equals(msg.trim())) {
            msg = new HtmlFilter().doFilter(msg);
            msg = new SensitivityFilter().doFilter(msg);
            msg = new SmileFilter().doFilter(msg);
        }
        return msg;
    }
}
