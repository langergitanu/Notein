package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FirebaseInAppMessaging_Factory implements Factory<FirebaseInAppMessaging> {
    private final InterfaceC32462OooO00o<DataCollectionHelper> dataCollectionHelperProvider;
    private final InterfaceC32462OooO00o<DeveloperListenerManager> developerListenerManagerProvider;
    private final InterfaceC32462OooO00o<DisplayCallbacksFactory> displayCallbacksFactoryProvider;
    private final InterfaceC32462OooO00o<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final InterfaceC32462OooO00o<InAppMessageStreamManager> inAppMessageStreamManagerProvider;
    private final InterfaceC32462OooO00o<Executor> lightWeightExecutorProvider;
    private final InterfaceC32462OooO00o<ProgramaticContextualTriggers> programaticContextualTriggersProvider;

    public FirebaseInAppMessaging_Factory(InterfaceC32462OooO00o<InAppMessageStreamManager> interfaceC32462OooO00o, InterfaceC32462OooO00o<ProgramaticContextualTriggers> interfaceC32462OooO00o2, InterfaceC32462OooO00o<DataCollectionHelper> interfaceC32462OooO00o3, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o4, InterfaceC32462OooO00o<DisplayCallbacksFactory> interfaceC32462OooO00o5, InterfaceC32462OooO00o<DeveloperListenerManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o7) {
        this.inAppMessageStreamManagerProvider = interfaceC32462OooO00o;
        this.programaticContextualTriggersProvider = interfaceC32462OooO00o2;
        this.dataCollectionHelperProvider = interfaceC32462OooO00o3;
        this.firebaseInstallationsProvider = interfaceC32462OooO00o4;
        this.displayCallbacksFactoryProvider = interfaceC32462OooO00o5;
        this.developerListenerManagerProvider = interfaceC32462OooO00o6;
        this.lightWeightExecutorProvider = interfaceC32462OooO00o7;
    }

    public static FirebaseInAppMessaging_Factory create(InterfaceC32462OooO00o<InAppMessageStreamManager> interfaceC32462OooO00o, InterfaceC32462OooO00o<ProgramaticContextualTriggers> interfaceC32462OooO00o2, InterfaceC32462OooO00o<DataCollectionHelper> interfaceC32462OooO00o3, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o4, InterfaceC32462OooO00o<DisplayCallbacksFactory> interfaceC32462OooO00o5, InterfaceC32462OooO00o<DeveloperListenerManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o7) {
        return new FirebaseInAppMessaging_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, interfaceC32462OooO00o7);
    }

    public static FirebaseInAppMessaging newInstance(InAppMessageStreamManager inAppMessageStreamManager, ProgramaticContextualTriggers programaticContextualTriggers, DataCollectionHelper dataCollectionHelper, FirebaseInstallationsApi firebaseInstallationsApi, DisplayCallbacksFactory displayCallbacksFactory, DeveloperListenerManager developerListenerManager, Executor executor) {
        return new FirebaseInAppMessaging(inAppMessageStreamManager, programaticContextualTriggers, dataCollectionHelper, firebaseInstallationsApi, displayCallbacksFactory, developerListenerManager, executor);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FirebaseInAppMessaging get() {
        return newInstance(this.inAppMessageStreamManagerProvider.get(), this.programaticContextualTriggersProvider.get(), this.dataCollectionHelperProvider.get(), this.firebaseInstallationsProvider.get(), this.displayCallbacksFactoryProvider.get(), this.developerListenerManagerProvider.get(), this.lightWeightExecutorProvider.get());
    }
}
