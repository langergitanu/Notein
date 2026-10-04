package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.model.InAppMessage;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class BannerBindingWrapper_Factory implements Factory<BannerBindingWrapper> {
    private final InterfaceC32462OooO00o<InAppMessageLayoutConfig> configProvider;
    private final InterfaceC32462OooO00o<LayoutInflater> inflaterProvider;
    private final InterfaceC32462OooO00o<InAppMessage> messageProvider;

    public BannerBindingWrapper_Factory(InterfaceC32462OooO00o<InAppMessageLayoutConfig> interfaceC32462OooO00o, InterfaceC32462OooO00o<LayoutInflater> interfaceC32462OooO00o2, InterfaceC32462OooO00o<InAppMessage> interfaceC32462OooO00o3) {
        this.configProvider = interfaceC32462OooO00o;
        this.inflaterProvider = interfaceC32462OooO00o2;
        this.messageProvider = interfaceC32462OooO00o3;
    }

    public static BannerBindingWrapper_Factory create(InterfaceC32462OooO00o<InAppMessageLayoutConfig> interfaceC32462OooO00o, InterfaceC32462OooO00o<LayoutInflater> interfaceC32462OooO00o2, InterfaceC32462OooO00o<InAppMessage> interfaceC32462OooO00o3) {
        return new BannerBindingWrapper_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static BannerBindingWrapper newInstance(InAppMessageLayoutConfig inAppMessageLayoutConfig, LayoutInflater layoutInflater, InAppMessage inAppMessage) {
        return new BannerBindingWrapper(inAppMessageLayoutConfig, layoutInflater, inAppMessage);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public BannerBindingWrapper get() {
        return newInstance(this.configProvider.get(), this.inflaterProvider.get(), this.messageProvider.get());
    }
}
