package androidx.lifecycle;

import java.util.concurrent.Callable;
import o0O00OOO.C25834OooO0oO;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f65699OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65700OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f65701OooOoO0;

    public /* synthetic */ o0ooOOo(int i, Object obj, Object obj2) {
        this.f65700OooOo0o = i;
        this.f65699OooOo = obj;
        this.f65701OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f65700OooOo0o) {
            case 0:
                ((AbstractC21979OooOOo0) this.f65699OooOo).OooO0OO((o0OOO0o) this.f65701OooOoO0);
                break;
            default:
                C25834OooO0oO c25834OooO0oO = (C25834OooO0oO) this.f65699OooOo;
                try {
                    c25834OooO0oO.OooO0O0(((Callable) this.f65701OooOoO0).call());
                } catch (Exception e) {
                    c25834OooO0oO.OooO00o(e);
                }
                break;
        }
    }
}
