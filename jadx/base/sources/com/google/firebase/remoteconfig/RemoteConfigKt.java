package com.google.firebase.remoteconfig;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.CustomSignals;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.hms.network.embedded.C18374u4;
import kotlin.Metadata;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m80612d2 = {"Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", "app", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "", "key", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "get", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "remoteConfigSettings", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "Lcom/google/firebase/remoteconfig/CustomSignals$Builder;", "builder", "Lcom/google/firebase/remoteconfig/CustomSignals;", RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, "(LoO0O000o/OooOO0o;)Lcom/google/firebase/remoteconfig/CustomSignals;", "getRemoteConfig", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "LoO0o0Oo/OooO0o;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)LoO0o0Oo/OooO0o;", "configUpdates", "com.google.firebase-firebase-config"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class RemoteConfigKt {
    public static final CustomSignals customSignals(InterfaceC32507OooOO0o<? super CustomSignals.Builder, C32460OooOooO> builder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        CustomSignals.Builder builder2 = new CustomSignals.Builder();
        builder.invoke(builder2);
        CustomSignals customSignalsBuild = builder2.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(customSignalsBuild, "build(...)");
        return customSignalsBuild;
    }

    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebaseRemoteConfig, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(key);
        kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
        return value;
    }

    public static final InterfaceC33721OooO0o<ConfigUpdate> getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebaseRemoteConfig, "<this>");
        return C25252OooO0Oo.OooO0o0(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseRemoteConfig, "getInstance(...)");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp app) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(app, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(app);
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseRemoteConfig, "getInstance(...)");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(InterfaceC32507OooOO0o<? super FirebaseRemoteConfigSettings.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        init.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseRemoteConfigSettingsBuild, "build(...)");
        return firebaseRemoteConfigSettingsBuild;
    }
}
