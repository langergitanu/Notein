package com.orion.notein;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bumptech.glide.C22253OooOO0o;
import com.bumptech.glide.OooO0OO;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.o0ooOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/NoteinFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "MyWorker", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteinFirebaseMessagingService extends FirebaseMessagingService {

    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/NoteinFirebaseMessagingService$MyWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class MyWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyWorker(Context appContext, WorkerParameters workerParams) {
            super(appContext, workerParams);
            OooOOO0.OooO0oO(appContext, "appContext");
            OooOOO0.OooO0oO(workerParams, "workerParams");
        }

        @Override // androidx.work.Worker
        public final ListenableWorker.OooO00o.OooO0OO OooO0oo() {
            return new ListenableWorker.OooO00o.OooO0OO();
        }
    }

    public final NotificationCompat.Builder OooO0OO(RemoteMessage.Notification notification) {
        NotificationCompat.Builder sound = new NotificationCompat.Builder(this, "fcm_default_channel").setContentTitle(notification.getTitle()).setContentText(notification.getBody()).setSmallIcon(R$drawable.ic_notification).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2));
        OooOOO0.OooO0o(sound, "setSound(...)");
        return sound;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        OooOOO0.OooO0oO(remoteMessage, "remoteMessage");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteinFirebaseMessagingService");
        c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("From: ", remoteMessage.getFrom()), new Object[0]);
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification != null) {
            c20358OooO00o.OooOOO0("NoteinFirebaseMessagingService");
            c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Message Notification Body: ", notification.getBody()), new Object[0]);
            String strValueOf = String.valueOf(notification.getImageUrl());
            if (strValueOf.length() == 0) {
                NotificationCompat.Builder builderOooO0OO = OooO0OO(notification);
                Object systemService = getSystemService("notification");
                OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                NotificationManager notificationManager = (NotificationManager) systemService;
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_default_channel", getString(R.string.notein_cloud_messaging_channel), 3));
                notificationManager.notify(0, builderOooO0OO.build());
                return;
            }
            NotificationCompat.Builder builderOooO0OO2 = OooO0OO(notification);
            Object systemService2 = getSystemService("notification");
            OooOOO0.OooO0o0(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager2 = (NotificationManager) systemService2;
            notificationManager2.createNotificationChannel(new NotificationChannel("fcm_default_channel", getString(R.string.notein_cloud_messaging_channel), 3));
            C22253OooOO0o<Bitmap> c22253OooOO0oOoooOoO = OooO0OO.OooO0O0(this).OooO0OO(this).OooO0O0().OoooOoO(strValueOf);
            c22253OooOO0oOoooOoO.OoooO0O(new o0ooOOo(builderOooO0OO2, notificationManager2), c22253OooOO0oOoooOoO);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String token) {
        OooOOO0.OooO0oO(token, "token");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteinFirebaseMessagingService");
        c20358OooO00o.OooO00o("Refreshed token: ".concat(token), new Object[0]);
        c20358OooO00o.OooOOO0("NoteinFirebaseMessagingService");
        c20358OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("sendRegistrationTokenToServer( "), token, " )"), new Object[0]);
    }
}
