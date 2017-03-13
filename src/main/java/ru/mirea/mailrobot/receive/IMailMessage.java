package ru.mirea.mailrobot.receive;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

public interface IMailMessage {

    String getSubject() throws MessagingException;

    Date getReceiveDate() throws MessagingException;

    List<InternetAddress> getFrom() throws MessagingException;

    Iterable<IAttachment> getAttachments() throws MessagingException;

    void writeTo(OutputStream os) throws IOException, MessagingException;
}
