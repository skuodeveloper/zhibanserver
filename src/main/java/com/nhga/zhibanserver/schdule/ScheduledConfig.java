package com.nhga.zhibanserver.schdule;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Component
@EnableScheduling
public class ScheduledConfig {
    @Scheduled(cron = "0 0 9 * * ?")
    public void schedule_1() {
        Date date = new Date();
        String date_time = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(date);
        String title = date_time + "值班表";

        try {
            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=dfb8f5feeb59c3a4e2de16e9ae768f4170d2277b60932c6078dfe5ce84bfbc40");//自动回复
            OapiRobotSendRequest request = new OapiRobotSendRequest();

            request.setMsgtype("link");
            OapiRobotSendRequest.Link link = new OapiRobotSendRequest.Link();
            link.setMessageUrl("http://60.190.149.52:8012/");
            link.setPicUrl("http://60.190.149.52:80/html/zhiban.jpg");
            link.setTitle("值班表");
            link.setText(title);
            request.setLink(link);

            OapiRobotSendResponse response = client.execute(request);
            System.out.println(date_time + "发送钉钉机器人：" + response.getErrmsg());
        } catch (Exception ex) {
            System.out.println(date_time + "发送钉钉机器人：" + ex.getMessage());
        }
    }
}
