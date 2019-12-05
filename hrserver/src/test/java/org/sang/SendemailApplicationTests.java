package org.sang;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.sang.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest()

public class SendemailApplicationTests {
    @Autowired
    private IMailService mailService;

    @Test
    public void sendmail() {
        mailService.sendSimpleMail("17726055317@163.com","主题：普通邮件","内容：第一封邮件");
    }

    @Test
    public void sendmailHtml(){
        mailService.sendHtmlMail("13502057672@163.com","主题:html邮件","<h1>内容：第一封html邮件</h1>");
    }

    @Test
    public void sendAttachmentsMail() {
        mailService.sendAttachmentsMail("13502057672@163.com","主题：附件邮件","fujian ","C:\\Users\\Administrator\\Desktop\\58cb9f3df8dcd100f3d5c16a7e8b4710b9122f3f.jpg.gif");
    }


}