package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0o.AbstractC25434OooO00o;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo0O0.C25667OooOO0o;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o extends AbstractC22290OoooO00<Pair<InterfaceC25397OooO00o, C25763OooO00o.OooO0OO>, AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25667OooOO0o f67296OooO0o0;

    public OooO0o(C25667OooOO0o c25667OooOO0o, C22262OooO0oO c22262OooO0oO) {
        super(c22262OooO0oO, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f67296OooO0o0 = c25667OooOO0o;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22290OoooO00
    public final Closeable OooO0O0(Closeable closeable) {
        return AbstractC25434OooO00o.OooOOO0((AbstractC25434OooO00o) closeable);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22290OoooO00
    public final Pair OooO0OO(InterfaceC22288OoooO interfaceC22288OoooO) {
        return Pair.create(this.f67296OooO0o0.OooO0O0(interfaceC22288OoooO.OooOOoo(), interfaceC22288OoooO.OooO00o()), interfaceC22288OoooO.o0Oo0oo());
    }
}
