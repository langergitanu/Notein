package com.airbnb.lottie;

import java.io.ByteArrayInputStream;
import o00OO00O.C24986OooO0oo;
import o0o00OOo.C29891OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f66777OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f66778OooOo0o;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f66778OooOo0o = i;
        this.f66777OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66778OooOo0o) {
            case 0:
                C24986OooO0oo.OooO00o((ByteArrayInputStream) this.f66777OooOo);
                break;
            default:
                ((C29891OooO0o0) this.f66777OooOo).f106039OooO0Oo.setVisibility(4);
                break;
        }
    }
}
