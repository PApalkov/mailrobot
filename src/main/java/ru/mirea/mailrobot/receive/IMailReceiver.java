package ru.mirea.mailrobot.receive;

import javax.mail.MessagingException;
import java.util.function.Consumer;

public interface IMailReceiver {

    long getLastActive();

    void receiveMail(Consumer<IMailMessage> consumer) throws MessagingException;
}
