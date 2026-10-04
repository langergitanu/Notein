package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import o00o0OOO.InterfaceC25397OooO00o;
import o00oo.C25638OooO0oO;
import o00oo0O0.C25667OooOO0o;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22269OooOo0 extends AbstractC22290OoooO00<Pair<InterfaceC25397OooO00o, C25763OooO00o.OooO0OO>, C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25667OooOO0o f67342OooO0o0;

    public C22269OooOo0(C25667OooOO0o c25667OooOO0o, InterfaceC22291OoooO0O interfaceC22291OoooO0O) {
        super(interfaceC22291OoooO0O, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt");
        this.f67342OooO0o0 = c25667OooOO0o;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22290OoooO00
    public final Closeable OooO0O0(Closeable closeable) {
        return C25638OooO0oO.OooO00o((C25638OooO0oO) closeable);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22290OoooO00
    public final Pair OooO0OO(InterfaceC22288OoooO interfaceC22288OoooO) {
        return Pair.create(this.f67342OooO0o0.OooO0OO(interfaceC22288OoooO.OooOOoo(), interfaceC22288OoooO.OooO00o()), interfaceC22288OoooO.o0Oo0oo());
    }
}
