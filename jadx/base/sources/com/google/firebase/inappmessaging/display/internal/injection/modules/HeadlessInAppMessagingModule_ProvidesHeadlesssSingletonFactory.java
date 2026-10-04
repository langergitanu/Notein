package com.google.firebase.inappmessaging.display.internal.injection.modules;

import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory implements Factory<FirebaseInAppMessaging> {
    private final HeadlessInAppMessagingModule module;

    public HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory(HeadlessInAppMessagingModule headlessInAppMessagingModule) {
        this.module = headlessInAppMessagingModule;
    }

    public static HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory create(HeadlessInAppMessagingModule headlessInAppMessagingModule) {
        return new HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory(headlessInAppMessagingModule);
    }

    public static FirebaseInAppMessaging providesHeadlesssSingleton(HeadlessInAppMessagingModule headlessInAppMessagingModule) {
        return (FirebaseInAppMessaging) Preconditions.checkNotNullFromProvides(headlessInAppMessagingModule.providesHeadlesssSingleton());
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FirebaseInAppMessaging get() {
        return providesHeadlesssSingleton(this.module);
    }
}
