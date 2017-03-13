package ru.mirea.mailrobot.consume;

import ru.mirea.mailrobot.receive.IMailMessage;

import java.util.function.Consumer;

public final class TestConsumer implements Consumer<IMailMessage> {

    @Override
    public void accept(IMailMessage iMailMessage) {
        // todo: обрабатывать сообщение
    }
}
