package cn.beyond.newbirth.prefix;

public class BaseKeyPrefix implements  KeyPrefix {

    private int expireSecond;
    private String prefix;


    public String getPrefix() {
        return this.getClass().getSimpleName()+":"+prefix;
    }

    @Override
    public int expireTime() {
        return this.expireSecond;
    }
}
