package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.internal.RateLimitProto;
import com.google.firebase.inappmessaging.model.RateLimit;
import oO00o00o.InterfaceC32332OooO0Oo;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22760OoooOOo implements InterfaceC32332OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ RateLimit f68554OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ RateLimiterClient f68555OooOo0o;

    public /* synthetic */ C22760OoooOOo(RateLimiterClient rateLimiterClient, RateLimit rateLimit) {
        this.f68555OooOo0o = rateLimiterClient;
        this.f68554OooOo = rateLimit;
    }

    @Override // oO00o00o.InterfaceC32332OooO0Oo
    public final boolean test(Object obj) {
        return this.f68555OooOo0o.lambda$increment$0(this.f68554OooOo, (RateLimitProto.Counter) obj);
    }
}
