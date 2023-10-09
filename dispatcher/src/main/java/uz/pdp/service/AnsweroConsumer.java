package uz.pdp.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface AnsweroConsumer {
    void consume(SendMessage sendMessage);
}
