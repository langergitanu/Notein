package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooOOOO<I, O> extends OooO0O0<I> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO<O> f67330OooO0O0;

    public OooOOOO(OooO<O> consumer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
        this.f67330OooO0O0 = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.OooO0O0
    public void OooO(float f) {
        this.f67330OooO0O0.OooO0OO(f);
    }

    @Override // com.facebook.imagepipeline.producers.OooO0O0
    public void OooO0o() {
        this.f67330OooO0O0.OooO0O0();
    }

    @Override // com.facebook.imagepipeline.producers.OooO0O0
    public void OooO0oO(Throwable t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(t, "t");
        this.f67330OooO0O0.onFailure(t);
    }
}
