package org.sang.controller;

import org.sang.service.IMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSendException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/mail")
public class MailSendController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    IMailService iMailService;

    /**
     * send simplemail
     * @return
     */
    @RequestMapping(value = "/sendSingleMail", method = RequestMethod.GET)
    public String sendMail() {
        try {
            iMailService.sendSimpleMail("13502057672", "主题", "简单邮件2333333");
            return "singleSend Sucessful！";
        } catch (MailSendException e) {
            logger.error("send error:" + e);
            return "send failed";
        }
    }

    /**
     * send HtmlMail
     * @return
     */
    @RequestMapping(value = "/htmlSend", method = RequestMethod.GET)
    public String sendHtmlMail() {
        iMailService.sendHtmlMail("13502057672@163.com", "主题", "<h1>邮件：Html内容</h1>");
        return "htmlMail send successful";
    }

    /**
     * sned AttachmentsMail
     * @return
     */
    @RequestMapping(value = "/AttachmentsMail", method = RequestMethod.GET)
    public String sendAttachmentsMail() {
        iMailService.sendAttachmentsMail("17726055317@163.","主题：添加附件","含有附件的邮件","C:\\Users\\Administrator\\Desktop\\58cb9f3df8dcd100f3d5c16a7e8b4710b9122f3f.jpg.gif");
        return "AttachmentsMail send successful";
    }

}