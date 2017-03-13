package ru.mirea.mailrobot.receive;

import javax.activation.MimeType;
import javax.mail.MessagingException;
import java.io.IOException;
import java.io.InputStream;

public interface IAttachment {

    String getFileName() throws MessagingException;

    MimeType getMimeType() throws MessagingException;

    String getTextEncoding() throws MessagingException;

    InputStream getContent() throws IOException, MessagingException;
}
