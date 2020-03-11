package com.nhga.zhibanserver.controller;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.nhga.zhibanserver.entity.MachineData;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
public class MachineController {
    @CrossOrigin
    @RequestMapping("machine/get")
    public void get( @RequestBody MachineData data) {
        if(data.getText().getContent().contains("值班")){
            sendDingMsg();
        }
    }

    private void sendDingMsg() {
        Date date = new Date();
        String date_time = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(date);
        String title = date_time + "值班表";

        try {
//            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=700a5330ec490ecedc4cf0405974489ce324b9900b71e79ffb32b72cacaa4e73");//测试
            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=dfb8f5feeb59c3a4e2de16e9ae768f4170d2277b60932c6078dfe5ce84bfbc40");//自动回复
//            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=c198797d44426a0776fa1011fc1142dce1f25419b951f7121854339a23f6798e");//全体民警群
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
