package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import com.huawei.hms.network.embedded.C18374u4;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\t\u0010\n\"\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m80612d2 = {"Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/KeyValueBuilder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "setCustomKeys", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;LoO0O000o/OooOO0o;)V", "", "throwable", "recordException", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ljava/lang/Throwable;LoO0O000o/OooOO0o;)V", "Lcom/google/firebase/Firebase;", "getCrashlytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "com.google.firebase-firebase-crashlytics"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics getCrashlytics(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        OooOOO0.OooO0o(firebaseCrashlytics, "getInstance(...)");
        return firebaseCrashlytics;
    }

    public static final void recordException(FirebaseCrashlytics firebaseCrashlytics, Throwable throwable, InterfaceC32507OooOO0o<? super KeyValueBuilder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(firebaseCrashlytics, "<this>");
        OooOOO0.OooO0oO(throwable, "throwable");
        OooOOO0.OooO0oO(init, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.recordException(throwable, keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, InterfaceC32507OooOO0o<? super KeyValueBuilder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(firebaseCrashlytics, "<this>");
        OooOOO0.OooO0oO(init, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.setCustomKeys(keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }
}
