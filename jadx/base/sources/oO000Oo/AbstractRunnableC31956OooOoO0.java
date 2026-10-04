package oO000Oo;

import oO0OOo0o.C33065OooOOOo;

/* JADX INFO: renamed from: oO000Oo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractRunnableC31956OooOoO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33065OooOOOo f114054OooOo0o;

    public AbstractRunnableC31956OooOoO0(C33065OooOOOo c33065OooOOOo) {
        this.f114054OooOo0o = c33065OooOOOo;
    }

    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        C33065OooOOOo c33065OooOOOo = this.f114054OooOo0o;
        C33065OooOOOo c33065OooOOOoOooO0OO = c33065OooOOOo.OooO0OO();
        try {
            OooO00o();
        } finally {
            c33065OooOOOo.OooOooo(c33065OooOOOoOooO0OO);
        }
    }
}
