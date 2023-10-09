package uz.pdp.servise;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface MainServace {
    void processTextMessage(Update update);
}
