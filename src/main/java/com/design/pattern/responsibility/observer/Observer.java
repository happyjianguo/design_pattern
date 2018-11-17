package com.design.pattern.responsibility.observer;

public interface Observer {
    /**
     * 更新接口
     * 
     * @param state
     *            更新的状态
     */
    void update(String state);
}
