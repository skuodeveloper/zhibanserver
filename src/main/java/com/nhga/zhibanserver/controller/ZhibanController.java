package com.nhga.zhibanserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.nhga.zhibanserver.entity.Zhiban;
import com.nhga.zhibanserver.service.IZhibanService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
public class ZhibanController {
    @Autowired
    private IZhibanService zhibanSvc;

    @CrossOrigin
    @RequestMapping("zhiban/add")
    public void add(@RequestParam String content) {
        Date date = new Date();
        String date_time = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(date);

        try {
            Zhiban zhiban = new Zhiban();
            zhiban.setContent(content);
            zhiban.setIntime(new Date());
            zhibanSvc.save(zhiban);
        } catch (Exception ex) {
            System.out.println(date_time + "保存数据库error：" + ex.getMessage());
            saveAgain(content);
        }
    }

    /**
     * 再次保存数据
     * @param content
     */
    private void saveAgain(String content){
        try {
            Zhiban zhiban = new Zhiban();
            zhiban.setContent(content);
            zhiban.setIntime(new Date());
            zhibanSvc.save(zhiban);

            System.out.println("再次保存数据库成功!");
        } catch (Exception ex) {
            saveAgain(content);
        }
    }

    @CrossOrigin
    @RequestMapping("zhiban/get")
    public String get() {
        try {
            List<Zhiban> zhibanList = zhibanSvc.list(new QueryWrapper<Zhiban>()
                    .apply("date(intime) = curdate()"));

            return zhibanList.get(0).getContent();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return "";
        }
    }

    private void sendDingMsg() {
        Date date = new Date();
        String date_time = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(date);
        String title = date_time + "值班表";

        try {
            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=700a5330ec490ecedc4cf0405974489ce324b9900b71e79ffb32b72cacaa4e73");//测试
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

    private static boolean isJson(String content) {
        try {
            JSONObject.fromObject(content);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}