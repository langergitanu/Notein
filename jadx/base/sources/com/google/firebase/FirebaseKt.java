package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0OO.AbstractC33630OooOooO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f\u001a)\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\r\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"Lcom/google/firebase/Firebase;", "", "name", "Lcom/google/firebase/FirebaseApp;", "app", "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "Landroid/content/Context;", "context", "initialize", "(Lcom/google/firebase/Firebase;Landroid/content/Context;)Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/FirebaseOptions;", "options", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;)Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "", "T", "Lcom/google/firebase/components/Component;", "LoO0o0OO/OooOooO;", "coroutineDispatcher", "()Lcom/google/firebase/components/Component;", "getApp", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseApp;", "getOptions", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseOptions;", "com.google.firebase-firebase-common"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseKt {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseKt$coroutineDispatcher$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class C169501<T> implements ComponentFactory {
        public static final C169501<T> INSTANCE = new C169501<>();

        @Override // com.google.firebase.components.ComponentFactory
        public final AbstractC33630OooOooO create(ComponentContainer componentContainer) {
            OooOOO0.OooOOO();
            throw null;
        }
    }

    public static final FirebaseApp app(Firebase firebase, String name) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(name, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(name);
        OooOOO0.OooO0o(firebaseApp, "getInstance(...)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<AbstractC33630OooOooO> coroutineDispatcher() {
        OooOOO0.OooOOO();
        throw null;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        OooOOO0.OooO0o(firebaseApp, "getInstance(...)");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        OooOOO0.OooO0o(options, "getOptions(...)");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(options, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options);
        OooOOO0.OooO0o(firebaseAppInitializeApp, "initializeApp(...)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options, String name) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(options, "options");
        OooOOO0.OooO0oO(name, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options, name);
        OooOOO0.OooO0o(firebaseAppInitializeApp, "initializeApp(...)");
        return firebaseAppInitializeApp;
    }
}
