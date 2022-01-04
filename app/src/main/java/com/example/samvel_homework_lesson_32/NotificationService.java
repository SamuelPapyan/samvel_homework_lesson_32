package com.example.samvel_homework_lesson_32;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class NotificationService {
    private static final String CHANNEL_ID_1 = "channel_1";
    private static final String CHANNEL_ID_2 = "channel_2";

    public Notification createNotification(Context context,
                                           int notificationSmallIcon,
                                           String textTitle,
                                           String textContent) {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID_1)
                .setSmallIcon(notificationSmallIcon)
                .setContentTitle(textTitle)
                .setContentText(textContent)
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText("This is more detailed version of content of this notification."))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        Notification notification = builder.build();
        return notification;
    }

    public void createNotificationChannel(Context context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "My First Notification Channel";
            String description = "My First Notification Channel Description";

            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID_1, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    public void createSecondNotificationChannel(Context context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "My Second Notification Channel";
            String description = "My Second Notification Channel Description";

            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID_2, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    public Notification startActivityFromNotification(Context context, int notificationSmallIcon) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID_1)
                .setSmallIcon(notificationSmallIcon)
                .setContentTitle("Link Notification to Second Activity")
                .setContentText("This is the second notification's content.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        Notification notification = builder.build();
        return notification;
    }
}
