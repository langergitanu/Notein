package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C22289OoooO0;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22273OooOoO0 extends C22260OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Future f67365OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C22289OoooO0.OooO00o f67366OooO0O0;

    public C22273OooOoO0(Future future, C22289OoooO0.OooO00o oooO00o) {
        this.f67365OooO00o = future;
        this.f67366OooO0O0 = oooO00o;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
    public final void OooO0O0() {
        if (this.f67365OooO00o.cancel(false)) {
            C22289OoooO0.OooO00o oooO00o = this.f67366OooO0O0;
            C22289OoooO0.this.getClass();
            C22271OooOo0o c22271OooOo0o = oooO00o.f67418OooO00o;
            c22271OooOo0o.f67357OooO0O0.OooOOo0().OooO0oO(c22271OooOo0o.f67357OooO0O0, "NetworkFetchProducer");
            c22271OooOo0o.f67356OooO00o.OooO0O0();
        }
    }
}
