package com.facebook.imagepipeline.producers;

import o00o0OOO.InterfaceC25397OooO00o;
import o00o0o.AbstractC25434OooO00o;
import o00oo.InterfaceC25636OooO0Oo;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22261OooO0o0 extends C22262OooO0oO {
    @Override // com.facebook.imagepipeline.producers.C22262OooO0oO
    public final String OooO0O0() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C22262OooO0oO
    public final String OooO0OO() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C22262OooO0oO
    public final OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> OooO0Oo(OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> consumer, InterfaceC25397OooO00o cacheKey, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cacheKey, "cacheKey");
        return consumer;
    }
}
