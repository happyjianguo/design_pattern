package responsibility.chain_of_responsibility.oschina.bad;

public class MsgProcessor {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 下面的代码完成了对一个字符串的简单过滤，但是很明显这样的代码很不好。扩展性不好，写得也不够好。这样以后需要添加别的过滤功能不是很方便，
     * 总是要修改这个类，一点都不灵活，想把对字符串的过滤行为抽象出来，因为这部分是变化的，自然而然想到使用接口。
     * 
     */
    public String processor() {
        String content = "";
        if (null != msg && !("").equals(msg.trim())) {
            // 1)过滤< 和 >
            content = msg.replace("<", "{").replace(">", "}");
            // 2)过滤敏感词汇
            content = content.replace("敏感", "");
            // 3)过滤:)
            content = content.replace(":)", "^V^");
        }
        return content;
    }
}
