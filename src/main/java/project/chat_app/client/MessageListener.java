package project.chat_app.client;

import project.chat_app.Message;

import java.util.ArrayList;

public interface MessageListener {
    void onMessageRecieve(Message message);
    void onActiveUsersUpdated(ArrayList<String> users);
}
