package o00o0OOo;

import o00o0OOO.InterfaceC25397OooO00o;

/* JADX INFO: renamed from: o00o0OOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25403OooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f86618OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C25403OooO f86619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static int f86620OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC25397OooO00o f86621OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C25403OooO f86622OooO0O0;

    public static C25403OooO OooO00o() {
        synchronized (f86618OooO0OO) {
            try {
                C25403OooO c25403OooO = f86619OooO0Oo;
                if (c25403OooO == null) {
                    return new C25403OooO();
                }
                f86619OooO0Oo = c25403OooO.f86622OooO0O0;
                c25403OooO.f86622OooO0O0 = null;
                f86620OooO0o0--;
                return c25403OooO;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0() {
        synchronized (f86618OooO0OO) {
            try {
                int i = f86620OooO0o0;
                if (i < 5) {
                    f86620OooO0o0 = i + 1;
                    C25403OooO c25403OooO = f86619OooO0Oo;
                    if (c25403OooO != null) {
                        this.f86622OooO0O0 = c25403OooO;
                    }
                    f86619OooO0Oo = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
