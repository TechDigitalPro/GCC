package com.gcc.arabmoney.service;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.gcc.arabmoney.utils.NotificationHelper;
import com.gcc.arabmoney.utils.SessionManager;
import com.gcc.arabmoney.utils.Utils;

public class NotificationService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try{
            if (remoteMessage.getData().size() > 0) {
                SessionManager sessionManager = new SessionManager(this);

                String title = remoteMessage.getData().get("title");
                String landing_page = remoteMessage.getData().get("landing_page");
                String send_option = remoteMessage.getData().get("send_option");
                String message = remoteMessage.getData().get("message");
                String country = remoteMessage.getData().get("country");
                String notification_id = remoteMessage.getData().get("notification_id");
                String my_country = Utils.getRegionCode(this);
                if(notification_id != null && country != null) {
                    if(country.trim().equalsIgnoreCase("AA") || country.trim().equalsIgnoreCase(my_country)){
                        if(landing_page != null && landing_page.trim().equals(sessionManager.getLandingPage().trim())) {
                            if(send_option != null){
                                switch (send_option) {
                                    case "3":
                                        NotificationHelper.showNotification(this, notification_id, title, message);
                                        break;
                                    case "2":
                                        if (sessionManager.getRegistered() == 0) {
                                            NotificationHelper.showNotification(this, notification_id, title, message);
                                        }
                                        break;
                                    case "1":
                                        if (sessionManager.getRegistered() == 1) {
                                            NotificationHelper.showNotification(this, notification_id, title, message);
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
