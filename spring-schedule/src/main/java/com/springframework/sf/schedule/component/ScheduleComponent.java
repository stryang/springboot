package com.springframework.sf.schedule.component;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: yq
 * @date: 2019/11/21 10:29
 * @description:
 */
@Component
public class ScheduleComponent {

    /**
     * 每隔 5000 毫秒执行一次
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒钟执行一次： " + DateUtil.format(new Date(), DatePattern.NORM_DATETIME_PATTERN));
    }

    /**
     * 在指定时间执行
     * cron表达式：
     * * 第一位，表示秒，取值 0-59
     * * 第二位，表示分，取值 0-59
     * * 第三位，表示小时，取值 0-23
     * * 第四位，日期，取值 1-31
     * * 第五位，月份，取值 1-12
     * * 第六位，星期几，取值 1-7
     * * 第七位，年份，可以留空，取值 1970-2099
     *
     * (*) 星号：可以理解为“每”的意思，每秒、没分
     * (?) 问好：只能出现在日期和星期这两个位置，表示这个位置的值不确定
     * (-) 表达一个范围，如在小时字段中使用 10-12 ，表示从10点到12点
     * (,) 逗号，表达一个列表值，如在星期字段中使用 1,2,4 ，则表示星期一、星期二、星期四
     * (/) 斜杠，如 x/y ，x是开始值，y是步长，如在第一位(秒)使用 0/15，表示从0秒开始，每15秒
     *
     * 官方解释：
     * 0 0 3 * * ?         每天 3 点执行
     * 0 5 3 * * ?         每天 3 点 5 分执行
     * 0 5 3 ? * *         每天 3 点 5 分执行
     * 0 5/10 3 * * ?      每天 3 点 5 分，15 分，25 分，35 分，45 分，55 分这几个点执行
     * 0 10 3 ? * 1        每周星期天的 3 点10 分执行，注：1 表示星期天
     * 0 10 3 ? * 1#3      每个月的第三个星期的星期天 执行，#号只能出现在星期的位置
     *
     * 注：第六位(星期几)中的数字可能表达不太正确，可以使用英文缩写来表示，如：Sun
     */
    @Scheduled(cron = "0 30 11 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + DateUtil.now() + "执行");
    }
}
