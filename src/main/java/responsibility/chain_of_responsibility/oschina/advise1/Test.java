package responsibility.chain_of_responsibility.oschina.advise1;

public class Test {
    public static void main(String[] args) {
        String str = "你好:)，这句话中有敏感词汇，需要处理。<script>，敏感！";
        System.out.println(str);
        
        MsgProcessor pro = new MsgProcessor();
        pro.setMsg(str);
        str = pro.process();
        
        System.out.println(str);
    }
}
