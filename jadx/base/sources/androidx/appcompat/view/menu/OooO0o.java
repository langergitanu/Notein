package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ViewOnKeyListenerC21506OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f62587OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ViewOnKeyListenerC21506OooO0o0.C21507OooO0Oo f62588OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ViewOnKeyListenerC21506OooO0o0.OooO0OO f62589OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO f62590OooOoO0;

    public OooO0o(ViewOnKeyListenerC21506OooO0o0.OooO0OO oooO0OO, ViewOnKeyListenerC21506OooO0o0.C21507OooO0Oo c21507OooO0Oo, OooOO0O oooOO0O, OooO oooO) {
        this.f62589OooOoO = oooO0OO;
        this.f62588OooOo0o = c21507OooO0Oo;
        this.f62587OooOo = oooOO0O;
        this.f62590OooOoO0 = oooO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC21506OooO0o0.C21507OooO0Oo c21507OooO0Oo = this.f62588OooOo0o;
        if (c21507OooO0Oo != null) {
            ViewOnKeyListenerC21506OooO0o0.OooO0OO oooO0OO = this.f62589OooOoO;
            ViewOnKeyListenerC21506OooO0o0.this.f62615o000oOoO = true;
            c21507OooO0Oo.f62620OooO0O0.close(false);
            ViewOnKeyListenerC21506OooO0o0.this.f62615o000oOoO = false;
        }
        OooOO0O oooOO0O = this.f62587OooOo;
        if (oooOO0O.isEnabled() && oooOO0O.hasSubMenu()) {
            this.f62590OooOoO0.performItemAction(oooOO0O, 4);
        }
    }
}
