package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.model.RateLimit;

/* JADX INFO: loaded from: classes8.dex */
public final class RateLimitModule_ProvidesAppForegroundRateLimitFactory implements Factory<RateLimit> {
    private final RateLimitModule module;

    public RateLimitModule_ProvidesAppForegroundRateLimitFactory(RateLimitModule rateLimitModule) {
        this.module = rateLimitModule;
    }

    public static RateLimitModule_ProvidesAppForegroundRateLimitFactory create(RateLimitModule rateLimitModule) {
        return new RateLimitModule_ProvidesAppForegroundRateLimitFactory(rateLimitModule);
    }

    public static RateLimit providesAppForegroundRateLimit(RateLimitModule rateLimitModule) {
        return (RateLimit) Preconditions.checkNotNullFromProvides(rateLimitModule.providesAppForegroundRateLimit());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public RateLimit get() {
        return providesAppForegroundRateLimit(this.module);
    }
}
