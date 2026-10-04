package OooOOO0;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static volatile OooO0O0 f58404OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f58405OooOoO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0OO f58406OooOo0o = new OooO0OO();

    public static OooO0O0 Oooo() {
        if (f58404OooOo != null) {
            return f58404OooOo;
        }
        synchronized (OooO0O0.class) {
            try {
                if (f58404OooOo == null) {
                    f58404OooOo = new OooO0O0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f58404OooOo;
    }

    public final void OoooO00(Runnable runnable) {
        OooO0OO oooO0OO = this.f58406OooOo0o;
        if (oooO0OO.f58409OooOoO0 == null) {
            synchronized (oooO0OO.f58408OooOo0o) {
                try {
                    if (oooO0OO.f58409OooOoO0 == null) {
                        oooO0OO.f58409OooOoO0 = OooO0OO.Oooo(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        oooO0OO.f58409OooOoO0.post(runnable);
    }
}
