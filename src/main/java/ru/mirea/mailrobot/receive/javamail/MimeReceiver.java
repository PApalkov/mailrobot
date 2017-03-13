package ru.mirea.mailrobot.receive.javamail;

import ru.mirea.mailrobot.receive.IMailMessage;
import ru.mirea.mailrobot.receive.IMailReceiver;

import javax.mail.MessagingException;
import java.util.function.Consumer;

public final class MimeReceiver implements IMailReceiver {

    @Override
    public void receiveMail(Consumer<IMailMessage> consumer) throws MessagingException {
        // todo: просканировать папку "Входящие" и скормить их consumer
    }
}
