package oo0o0O0;

import o00O0O0o.OooOO0O;
import o00O0OoO.C24880OooOOoo;

/* JADX INFO: renamed from: oo0o0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC34675OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C34676OooO0O0 f124861OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24880OooOOoo f124862OooOo0o;

    public RunnableC34675OooO00o(C34676OooO0O0 c34676OooO0O0, C24880OooOOoo c24880OooOOoo) {
        this.f124861OooOo = c34676OooO0O0;
        this.f124862OooOo0o = c24880OooOOoo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
        String str = C34676OooO0O0.f124863OooO0Oo;
        C24880OooOOoo c24880OooOOoo = this.f124862OooOo0o;
        oooOO0OOooO0OO.OooO00o(str, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Scheduling work ", c24880OooOOoo.f84457OooO00o), new Throwable[0]);
        this.f124861OooOo.f124864OooO00o.OooO0o0(c24880OooOOoo);
    }
}
