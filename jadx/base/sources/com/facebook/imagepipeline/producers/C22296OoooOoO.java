package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C22297OoooOoo;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22296OoooOoO extends C22260OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO f67436OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C22297OoooOoo.OooO00o f67437OooO0O0;

    public C22296OoooOoO(C22297OoooOoo.OooO00o oooO00o, OooO oooO) {
        this.f67437OooO0O0 = oooO00o;
        this.f67436OooO00o = oooO;
    }

    @Override // com.facebook.imagepipeline.producers.C22260OooO0Oo, com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
    public final void OooO00o() {
        C22297OoooOoo.OooO00o oooO00o = this.f67437OooO0O0;
        if (oooO00o.f67446OooO0o0.Oooo0OO()) {
            oooO00o.f67447OooO0oO.OooO0OO();
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
    public final void OooO0O0() {
        C25638OooO0oO c25638OooO0oO;
        C22297OoooOoo.OooO00o oooO00o = this.f67437OooO0O0;
        C22277OooOooO c22277OooOooO = oooO00o.f67447OooO0oO;
        synchronized (c22277OooOooO) {
            c25638OooO0oO = c22277OooOooO.f67379OooO0o0;
            c22277OooOooO.f67379OooO0o0 = null;
            c22277OooOooO.f67378OooO0o = 0;
        }
        C25638OooO0oO.OooO0OO(c25638OooO0oO);
        oooO00o.f67445OooO0o = true;
        this.f67436OooO00o.OooO0O0();
    }
}
