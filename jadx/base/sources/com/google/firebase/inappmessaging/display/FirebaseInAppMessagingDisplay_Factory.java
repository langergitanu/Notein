package com.google.firebase.inappmessaging.display;

import android.app.Application;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer;
import java.util.Map;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FirebaseInAppMessagingDisplay_Factory implements Factory<FirebaseInAppMessagingDisplay> {
    private final InterfaceC32462OooO00o<FiamAnimator> animatorProvider;
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final InterfaceC32462OooO00o<RenewableTimer> autoDismissTimerProvider;
    private final InterfaceC32462OooO00o<BindingWrapperFactory> bindingWrapperFactoryProvider;
    private final InterfaceC32462OooO00o<FirebaseInAppMessaging> headlessInAppMessagingProvider;
    private final InterfaceC32462OooO00o<FiamImageLoader> imageLoaderProvider;
    private final InterfaceC32462OooO00o<RenewableTimer> impressionTimerProvider;
    private final InterfaceC32462OooO00o<Map<String, InterfaceC32462OooO00o<InAppMessageLayoutConfig>>> layoutConfigsProvider;
    private final InterfaceC32462OooO00o<FiamWindowManager> windowManagerProvider;

    public FirebaseInAppMessagingDisplay_Factory(InterfaceC32462OooO00o<FirebaseInAppMessaging> interfaceC32462OooO00o, InterfaceC32462OooO00o<Map<String, InterfaceC32462OooO00o<InAppMessageLayoutConfig>>> interfaceC32462OooO00o2, InterfaceC32462OooO00o<FiamImageLoader> interfaceC32462OooO00o3, InterfaceC32462OooO00o<RenewableTimer> interfaceC32462OooO00o4, InterfaceC32462OooO00o<RenewableTimer> interfaceC32462OooO00o5, InterfaceC32462OooO00o<FiamWindowManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o7, InterfaceC32462OooO00o<BindingWrapperFactory> interfaceC32462OooO00o8, InterfaceC32462OooO00o<FiamAnimator> interfaceC32462OooO00o9) {
        this.headlessInAppMessagingProvider = interfaceC32462OooO00o;
        this.layoutConfigsProvider = interfaceC32462OooO00o2;
        this.imageLoaderProvider = interfaceC32462OooO00o3;
        this.impressionTimerProvider = interfaceC32462OooO00o4;
        this.autoDismissTimerProvider = interfaceC32462OooO00o5;
        this.windowManagerProvider = interfaceC32462OooO00o6;
        this.applicationProvider = interfaceC32462OooO00o7;
        this.bindingWrapperFactoryProvider = interfaceC32462OooO00o8;
        this.animatorProvider = interfaceC32462OooO00o9;
    }

    public static FirebaseInAppMessagingDisplay_Factory create(InterfaceC32462OooO00o<FirebaseInAppMessaging> interfaceC32462OooO00o, InterfaceC32462OooO00o<Map<String, InterfaceC32462OooO00o<InAppMessageLayoutConfig>>> interfaceC32462OooO00o2, InterfaceC32462OooO00o<FiamImageLoader> interfaceC32462OooO00o3, InterfaceC32462OooO00o<RenewableTimer> interfaceC32462OooO00o4, InterfaceC32462OooO00o<RenewableTimer> interfaceC32462OooO00o5, InterfaceC32462OooO00o<FiamWindowManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o7, InterfaceC32462OooO00o<BindingWrapperFactory> interfaceC32462OooO00o8, InterfaceC32462OooO00o<FiamAnimator> interfaceC32462OooO00o9) {
        return new FirebaseInAppMessagingDisplay_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, interfaceC32462OooO00o7, interfaceC32462OooO00o8, interfaceC32462OooO00o9);
    }

    public static FirebaseInAppMessagingDisplay newInstance(FirebaseInAppMessaging firebaseInAppMessaging, Map<String, InterfaceC32462OooO00o<InAppMessageLayoutConfig>> map, FiamImageLoader fiamImageLoader, RenewableTimer renewableTimer, RenewableTimer renewableTimer2, FiamWindowManager fiamWindowManager, Application application, BindingWrapperFactory bindingWrapperFactory, FiamAnimator fiamAnimator) {
        return new FirebaseInAppMessagingDisplay(firebaseInAppMessaging, map, fiamImageLoader, renewableTimer, renewableTimer2, fiamWindowManager, application, bindingWrapperFactory, fiamAnimator);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FirebaseInAppMessagingDisplay get() {
        return newInstance(this.headlessInAppMessagingProvider.get(), this.layoutConfigsProvider.get(), this.imageLoaderProvider.get(), this.impressionTimerProvider.get(), this.autoDismissTimerProvider.get(), this.windowManagerProvider.get(), this.applicationProvider.get(), this.bindingWrapperFactoryProvider.get(), this.animatorProvider.get());
    }
}
