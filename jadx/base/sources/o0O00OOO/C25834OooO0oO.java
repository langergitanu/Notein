package o0O00OOO;

import o0O00Oo.C25840OooO0oo;

/* JADX INFO: renamed from: o0O00OOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25834OooO0oO<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25840OooO0oo<TResult> f88150OooO00o = new C25840OooO0oo<>();

    public final void OooO00o(Exception exc) {
        C25840OooO0oo<TResult> c25840OooO0oo = this.f88150OooO00o;
        synchronized (c25840OooO0oo.f88175OooO00o) {
            try {
                if (!c25840OooO0oo.f88176OooO0O0) {
                    c25840OooO0oo.f88176OooO0O0 = true;
                    c25840OooO0oo.f88178OooO0Oo = exc;
                    c25840OooO0oo.f88175OooO00o.notifyAll();
                    c25840OooO0oo.OooOO0o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(TResult tresult) {
        C25840OooO0oo<TResult> c25840OooO0oo = this.f88150OooO00o;
        synchronized (c25840OooO0oo.f88175OooO00o) {
            try {
                if (!c25840OooO0oo.f88176OooO0O0) {
                    c25840OooO0oo.f88176OooO0O0 = true;
                    c25840OooO0oo.f88177OooO0OO = tresult;
                    c25840OooO0oo.f88175OooO00o.notifyAll();
                    c25840OooO0oo.OooOO0o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
