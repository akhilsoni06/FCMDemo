package akhil.com.fcmdemo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by akhil on 27-05-2017.
 */

public class MyInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.e("fcm token is", token);

        sendNotificationToServer();
    }

    private void sendNotificationToServer() {
        //send the notification token to your third party server
    }
}
