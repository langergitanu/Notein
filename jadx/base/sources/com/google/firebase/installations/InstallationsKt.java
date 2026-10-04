package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m80612d2 = {"installations", "Lcom/google/firebase/installations/FirebaseInstallations;", "Lcom/google/firebase/Firebase;", "getInstallations", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/installations/FirebaseInstallations;", "app", "Lcom/google/firebase/FirebaseApp;", "com.google.firebase-firebase-installations"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class InstallationsKt {
    public static final FirebaseInstallations getInstallations(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        OooOOO0.OooO0o(firebaseInstallations, "getInstance(...)");
        return firebaseInstallations;
    }

    public static final FirebaseInstallations installations(Firebase firebase, FirebaseApp app) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(app, "app");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(app);
        OooOOO0.OooO0o(firebaseInstallations, "getInstance(...)");
        return firebaseInstallations;
    }
}
