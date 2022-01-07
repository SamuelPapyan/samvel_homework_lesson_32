package com.example.samvel_homework_lesson_32;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int NOTIFICATION_ID = 200;
    private static final int SECOND_NOTIFICATION_ID = 250;
    AppCompatButton contactsLink;
    AppCompatButton ntfButton1;
    AppCompatButton ntfButton2;
    AppCompatButton bottomNavigationLink;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ntfButton1 = findViewById(R.id.show_ntf);
        ntfButton2 = findViewById(R.id.show_ntf_2);
        contactsLink = findViewById(R.id.contacts_link);
        bottomNavigationLink = findViewById(R.id.bottom_navigation_link);
        ntfButton1.setOnClickListener(this::showNotification);
        ntfButton2.setOnClickListener(this::showNotificationWithLink);
        contactsLink.setOnClickListener(this::linkToContactsList);
        bottomNavigationLink.setOnClickListener(this::linkToBottomNavigationViewActivity);
    }

    private void showNotification(View view){
        NotificationService notificationService = new NotificationService();
        Notification notification = notificationService.createNotification(this,
                R.drawable.star,
                "My Notification","This is my first notification in Android");
        notificationService.createNotificationChannel(this);
        notificationService.createSecondNotificationChannel(this);
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(NOTIFICATION_ID, notification);
    }

    private void showNotificationWithLink(View view){
        NotificationService notificationService = new NotificationService();
        Notification notification= notificationService.startActivityFromNotification(this,R.drawable.star);
        notificationService.createNotificationChannel(this);
        notificationService.createSecondNotificationChannel(this);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(SECOND_NOTIFICATION_ID, notification);
    }

    private void linkToContactsList(View view){
        Intent intent = new Intent(this, ContactsActivity.class);
        startActivity(intent);
    }
    private void linkToBottomNavigationViewActivity(View view){
        Intent intent = new Intent(this, BottomNavigationViewActivity.class);
        startActivity(intent);
    }
}