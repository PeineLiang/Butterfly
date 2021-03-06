package com.simonalong.butterfly.sequence;

import java.util.concurrent.TimeUnit;

/**
 * @author shizi
 * @since 2020/2/3 11:54 上午
 */
public interface UuidConstant {

    /**
     * log前缀
     */
    String LOG_PRE = "[butterfly]";

    /**
     * 机器id增加占用的bit数
     */
    int WORKER_BITS = 13;
    /**
     * worker节点的最大值
     */
    long MAX_WORKER_SIZE = 1 << WORKER_BITS;
    /**
     * 自增域占用的bit数
     */
    int SEQ_BITS = 9;
    long SEQ_MARK = ~(-1L << SEQ_BITS);
    long SEQ_MAX_SIZE = 1 << SEQ_BITS;
    long SEQ_LEFT_SHIFT = WORKER_BITS;
    /**
     * 时间占用的bit数
     */
    int TIME_BITS = 41;
    long TIME_LEFT_SHIFT = SEQ_BITS + SEQ_LEFT_SHIFT;

    /**
     * 符号位
     */
    long SYMBOL_LEFT_SHIFT = TIME_BITS + TIME_LEFT_SHIFT;

    /**
     * 时间过慢后域当前时间的门限，当前暂时设置为20个小时
     */
    long DELAY_THREAD_HOLD = TimeUnit.HOURS.toMillis(20);
    /**
     * 节点保留的时间
     */
    long KEEP_NODE_EXIST_TIME = TimeUnit.HOURS.toMillis(24);
    /**
     * 时间回拨的容忍度，2秒
     */
    long TIME_BACK = 2000L;
    /**
     * 延迟启动时间，10ms
     */
    long DELAY_START_TIME = 10L;
    /**
     * 分布式模式下的业务节点
     */
    String DISTRIBUTE_SERVER = "butterfly-server";
    /**
     * 心跳间隔时间单位秒
     */
    long HEART_TIME = 5L;
}
