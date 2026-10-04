package com.google.firebase.messaging;

import com.google.firebase.Firebase;
import com.google.firebase.messaging.RemoteMessage;
import com.huawei.hms.network.embedded.C18374u4;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@kotlin.Metadata(m80611d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\r\u001a\u00020\n*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, m80612d2 = {"", "to", "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "(Ljava/lang/String;LoO0O000o/OooOO0o;)Lcom/google/firebase/messaging/RemoteMessage;", "Lcom/google/firebase/Firebase;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "getMessaging", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/messaging/FirebaseMessaging;", "messaging", "com.google.firebase-firebase-messaging"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseMessaging, "getInstance(...)");
        return firebaseMessaging;
    }

    public static final RemoteMessage remoteMessage(String to, InterfaceC32507OooOO0o<? super RemoteMessage.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(to, "to");
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(to);
        init.invoke(builder);
        RemoteMessage remoteMessageBuild = builder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(remoteMessageBuild, "build(...)");
        return remoteMessageBuild;
    }
}
