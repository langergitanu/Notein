package com.google.firebase.functions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.functions.HttpsCallableOptions;
import com.huawei.hms.network.embedded.C18374u4;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a-\u0010\u0010\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0014\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"Lcom/google/firebase/Firebase;", "", "regionOrCustomDomain", "Lcom/google/firebase/functions/FirebaseFunctions;", "functions", "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/functions/FirebaseFunctions;", "Lcom/google/firebase/FirebaseApp;", "app", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/functions/FirebaseFunctions;", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/firebase/functions/FirebaseFunctions;", "name", "Lkotlin/Function1;", "Lcom/google/firebase/functions/HttpsCallableOptions$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/functions/HttpsCallableReference;", "getHttpsCallable", "(Lcom/google/firebase/functions/FirebaseFunctions;Ljava/lang/String;LoO0O000o/OooOO0o;)Lcom/google/firebase/functions/HttpsCallableReference;", "Ljava/net/URL;", "url", "getHttpsCallableFromUrl", "(Lcom/google/firebase/functions/FirebaseFunctions;Ljava/net/URL;LoO0O000o/OooOO0o;)Lcom/google/firebase/functions/HttpsCallableReference;", "getFunctions", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/functions/FirebaseFunctions;", "com.google.firebase-firebase-functions"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FunctionsKt {
    public static final FirebaseFunctions functions(Firebase firebase, String regionOrCustomDomain) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(regionOrCustomDomain, "regionOrCustomDomain");
        return FirebaseFunctions.INSTANCE.getInstance(regionOrCustomDomain);
    }

    public static final FirebaseFunctions getFunctions(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        return FirebaseFunctions.INSTANCE.getInstance();
    }

    public static final HttpsCallableReference getHttpsCallable(FirebaseFunctions firebaseFunctions, String name, InterfaceC32507OooOO0o<? super HttpsCallableOptions.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(firebaseFunctions, "<this>");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(init, "init");
        HttpsCallableOptions.Builder builder = new HttpsCallableOptions.Builder();
        init.invoke(builder);
        return firebaseFunctions.getHttpsCallable(name, builder.build());
    }

    public static final HttpsCallableReference getHttpsCallableFromUrl(FirebaseFunctions firebaseFunctions, URL url, InterfaceC32507OooOO0o<? super HttpsCallableOptions.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(firebaseFunctions, "<this>");
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(init, "init");
        HttpsCallableOptions.Builder builder = new HttpsCallableOptions.Builder();
        init.invoke(builder);
        return firebaseFunctions.getHttpsCallableFromUrl(url, builder.build());
    }

    public static final FirebaseFunctions functions(Firebase firebase, FirebaseApp app) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(app, "app");
        return FirebaseFunctions.INSTANCE.getInstance(app);
    }

    public static final FirebaseFunctions functions(Firebase firebase, FirebaseApp app, String regionOrCustomDomain) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(app, "app");
        OooOOO0.OooO0oO(regionOrCustomDomain, "regionOrCustomDomain");
        return FirebaseFunctions.INSTANCE.getInstance(app, regionOrCustomDomain);
    }
}
