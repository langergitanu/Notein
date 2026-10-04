package com.google.firebase.appcheck;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\tH\u0086\u0002\u001a\r\u0010\n\u001a\u00020\u000b*\u00020\tH\u0086\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, m80612d2 = {"appCheck", "Lcom/google/firebase/appcheck/FirebaseAppCheck;", "Lcom/google/firebase/Firebase;", "getAppCheck", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/appcheck/FirebaseAppCheck;", "app", "Lcom/google/firebase/FirebaseApp;", "component1", "", "Lcom/google/firebase/appcheck/AppCheckToken;", "component2", "", "com.google.firebase-appcheck-firebase-appcheck"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseAppCheckKt {
    public static final FirebaseAppCheck appCheck(Firebase firebase, FirebaseApp app) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(app, "app");
        FirebaseAppCheck firebaseAppCheck = FirebaseAppCheck.getInstance(app);
        OooOOO0.OooO0o(firebaseAppCheck, "getInstance(...)");
        return firebaseAppCheck;
    }

    public static final String component1(AppCheckToken appCheckToken) {
        OooOOO0.OooO0oO(appCheckToken, "<this>");
        String token = appCheckToken.getToken();
        OooOOO0.OooO0o(token, "getToken(...)");
        return token;
    }

    public static final long component2(AppCheckToken appCheckToken) {
        OooOOO0.OooO0oO(appCheckToken, "<this>");
        return appCheckToken.getExpireTimeMillis();
    }

    public static final FirebaseAppCheck getAppCheck(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseAppCheck firebaseAppCheck = FirebaseAppCheck.getInstance();
        OooOOO0.OooO0o(firebaseAppCheck, "getInstance(...)");
        return firebaseAppCheck;
    }
}
