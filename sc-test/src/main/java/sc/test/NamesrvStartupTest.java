package sc.test;

import org.apache.rocketmq.common.MixAll;
import org.apache.rocketmq.namesrv.NamesrvStartup;

/**
 * @author xiaozhou.tu
 * @date 2023/2/8
 */
public class NamesrvStartupTest {

    public static void main(String[] args) {
        System.setProperty(MixAll.ROCKETMQ_HOME_PROPERTY, "/Users/xiaozhou.tu/JavaProject/sc-rocketmq/sc-rocketmq-home/namesrv");
        System.setProperty("user.home", "/Users/xiaozhou.tu/JavaProject/sc-rocketmq/sc-rocketmq-home/namesrv");
        NamesrvStartup.main(new String[0]);
    }

}
