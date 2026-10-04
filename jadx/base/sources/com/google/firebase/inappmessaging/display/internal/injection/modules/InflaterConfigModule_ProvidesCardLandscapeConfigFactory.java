package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class InflaterConfigModule_ProvidesCardLandscapeConfigFactory implements Factory<InAppMessageLayoutConfig> {
    private final InterfaceC32462OooO00o<DisplayMetrics> displayMetricsProvider;
    private final InflaterConfigModule module;

    public InflaterConfigModule_ProvidesCardLandscapeConfigFactory(InflaterConfigModule inflaterConfigModule, InterfaceC32462OooO00o<DisplayMetrics> interfaceC32462OooO00o) {
        this.module = inflaterConfigModule;
        this.displayMetricsProvider = interfaceC32462OooO00o;
    }

    public static InflaterConfigModule_ProvidesCardLandscapeConfigFactory create(InflaterConfigModule inflaterConfigModule, InterfaceC32462OooO00o<DisplayMetrics> interfaceC32462OooO00o) {
        return new InflaterConfigModule_ProvidesCardLandscapeConfigFactory(inflaterConfigModule, interfaceC32462OooO00o);
    }

    public static InAppMessageLayoutConfig providesCardLandscapeConfig(InflaterConfigModule inflaterConfigModule, DisplayMetrics displayMetrics) {
        return (InAppMessageLayoutConfig) Preconditions.checkNotNullFromProvides(inflaterConfigModule.providesCardLandscapeConfig(displayMetrics));
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public InAppMessageLayoutConfig get() {
        return providesCardLandscapeConfig(this.module, this.displayMetricsProvider.get());
    }
}
