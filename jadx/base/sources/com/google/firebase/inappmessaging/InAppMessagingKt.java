package com.google.firebase.inappmessaging;

import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"inAppMessaging", "Lcom/google/firebase/inappmessaging/FirebaseInAppMessaging;", "Lcom/google/firebase/Firebase;", "getInAppMessaging", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/inappmessaging/FirebaseInAppMessaging;", "com.google.firebase-firebase-inappmessaging"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class InAppMessagingKt {
    public static final FirebaseInAppMessaging getInAppMessaging(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseInAppMessaging firebaseInAppMessaging = FirebaseInAppMessaging.getInstance();
        OooOOO0.OooO0o(firebaseInAppMessaging, "getInstance(...)");
        return firebaseInAppMessaging;
    }
}
