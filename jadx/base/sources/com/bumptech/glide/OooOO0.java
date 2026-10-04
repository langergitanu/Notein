package com.bumptech.glide;

import android.os.Trace;
import java.util.List;
import o00o00o0.AbstractC25280OooO00o;
import o00o0O0.InterfaceC25314OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 implements InterfaceC25314OooO0oO<OooO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f67138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f67139OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ List f67140OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AbstractC25280OooO00o f67141OooO0Oo;

    public OooOO0(OooO0OO oooO0OO, List list, AbstractC25280OooO00o abstractC25280OooO00o) {
        this.f67139OooO0O0 = oooO0OO;
        this.f67140OooO0OO = list;
        this.f67141OooO0Oo = abstractC25280OooO00o;
    }

    @Override // o00o0O0.InterfaceC25314OooO0oO
    public final OooO get() {
        if (this.f67138OooO00o) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        o00O000.OooO00o.OooO00o("Glide registry");
        this.f67138OooO00o = true;
        try {
            return OooOO0O.OooO00o(this.f67139OooO0O0, this.f67140OooO0OO, this.f67141OooO0Oo);
        } finally {
            this.f67138OooO00o = false;
            Trace.endSection();
        }
    }
}
