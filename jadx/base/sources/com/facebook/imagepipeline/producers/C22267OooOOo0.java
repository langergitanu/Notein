package com.facebook.imagepipeline.producers;

import java.util.concurrent.CancellationException;
import o00O0o0o.C24941OooO0oo;
import o00O0o0o.InterfaceC24936OooO0OO;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22267OooOOo0 implements InterfaceC24936OooO0OO<C25638OooO0oO, Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f67332OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22288OoooO f67333OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO f67334OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ C22268OooOOoo f67335OooO0Oo;

    public C22267OooOOo0(C22268OooOOoo c22268OooOOoo, o000oOoO o000oooo2, InterfaceC22288OoooO interfaceC22288OoooO, OooO oooO) {
        this.f67335OooO0Oo = c22268OooOOoo;
        this.f67332OooO00o = o000oooo2;
        this.f67333OooO0O0 = interfaceC22288OoooO;
        this.f67334OooO0OO = oooO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00O0o0o.InterfaceC24936OooO0OO
    public final void OooO00o(C24941OooO0oo c24941OooO0oo) throws Exception {
        boolean z;
        TResult tresult;
        synchronized (c24941OooO0oo.f84624OooO00o) {
            z = c24941OooO0oo.f84626OooO0OO;
        }
        OooO<C25638OooO0oO> oooO = this.f67334OooO0OO;
        o000oOoO o000oooo2 = this.f67332OooO00o;
        InterfaceC22288OoooO interfaceC22288OoooO = this.f67333OooO0O0;
        if (z || (c24941OooO0oo.OooO0Oo() && (c24941OooO0oo.OooO0OO() instanceof CancellationException))) {
            o000oooo2.OooO0oO(interfaceC22288OoooO, "DiskCacheProducer");
            oooO.OooO0O0();
            return;
        }
        boolean zOooO0Oo = c24941OooO0oo.OooO0Oo();
        C22268OooOOoo c22268OooOOoo = this.f67335OooO0Oo;
        if (zOooO0Oo) {
            o000oooo2.OooOO0O(interfaceC22288OoooO, "DiskCacheProducer", c24941OooO0oo.OooO0OO(), null);
            c22268OooOOoo.f67338OooO0OO.OooO00o(oooO, interfaceC22288OoooO);
            return;
        }
        synchronized (c24941OooO0oo.f84624OooO00o) {
            tresult = c24941OooO0oo.f84627OooO0Oo;
        }
        C25638OooO0oO c25638OooO0oO = (C25638OooO0oO) tresult;
        if (c25638OooO0oO == null) {
            o000oooo2.OooO(interfaceC22288OoooO, "DiskCacheProducer", C22268OooOOoo.OooO0O0(o000oooo2, interfaceC22288OoooO, false, 0));
            c22268OooOOoo.f67338OooO0OO.OooO00o(oooO, interfaceC22288OoooO);
            return;
        }
        o000oooo2.OooO(interfaceC22288OoooO, "DiskCacheProducer", C22268OooOOoo.OooO0O0(o000oooo2, interfaceC22288OoooO, true, c25638OooO0oO.OooOooo()));
        o000oooo2.OooO0O0(interfaceC22288OoooO, "DiskCacheProducer", true);
        interfaceC22288OoooO.Oooo0("disk");
        oooO.OooO0OO(1.0f);
        oooO.OooO00o(1, c25638OooO0oO);
        c25638OooO0oO.close();
    }
}
