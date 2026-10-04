package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.internal.RateLimitProto;
import oO00o00o.InterfaceC32331OooO0OO;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22762OoooOoO implements InterfaceC32331OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ RateLimiterClient f68558OooOo0o;

    public /* synthetic */ C22762OoooOoO(RateLimiterClient rateLimiterClient) {
        this.f68558OooOo0o = rateLimiterClient;
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public final Object apply(Object obj) {
        return this.f68558OooOo0o.lambda$increment$3((RateLimitProto.RateLimit) obj);
    }
}
