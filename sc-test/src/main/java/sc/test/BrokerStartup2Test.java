package sc.test;

import org.apache.rocketmq.broker.BrokerStartup;
import org.apache.rocketmq.common.MixAll;

/**
 * @author xiaozhou.tu
 * @date 2023/2/8
 */
public class BrokerStartup2Test {

    public static void main(String[] args) {
        System.setProperty(MixAll.ROCKETMQ_HOME_PROPERTY, "/Users/xiaozhou.tu/JavaProject/sc-rocketmq/sc-rocketmq-home/broker2");
        System.setProperty(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        BrokerStartup.main(new String[]{
                "-c",
                "/Users/xiaozhou.tu/JavaProject/sc-rocketmq/sc-rocketmq-home/broker2/conf/broker.conf"
        });
    }

}
