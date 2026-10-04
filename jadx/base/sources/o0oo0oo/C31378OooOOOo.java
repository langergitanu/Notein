package o0oo0oo;

import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31378OooOOOo extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f112048OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C31368OooOO0O[] f112049OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AbstractC31397Oooo0O0 f112050OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C31384OooOo00 f112051OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f112052OooOO0;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        this.f112051OooO0oo = (C31384OooOo00) c31401Oooo0oO.o0Oo0oo("loca");
        int iOooo0OO = c31401Oooo0oO.Oooo0OO();
        this.f112048OooO = iOooo0OO;
        if (iOooo0OO < 5000) {
            this.f112049OooO0o = new C31368OooOO0O[iOooo0OO];
        }
        this.f112050OooO0oO = abstractC31397Oooo0O0;
        this.f112121OooO0Oo = true;
    }

    public final C31368OooOO0O OooO0O0(int i) throws IOException {
        C31368OooOO0O c31368OooOO0OOooO0OO;
        int i2;
        C31368OooOO0O c31368OooOO0O;
        if (i < 0 || i >= this.f112048OooO) {
            return null;
        }
        C31368OooOO0O[] c31368OooOO0OArr = this.f112049OooO0o;
        if (c31368OooOO0OArr != null && (c31368OooOO0O = c31368OooOO0OArr[i]) != null) {
            return c31368OooOO0O;
        }
        synchronized (this.f112050OooO0oO) {
            try {
                long[] jArr = this.f112051OooO0oo.f112070OooO0o;
                if (jArr[i] == jArr[i + 1]) {
                    c31368OooOO0OOooO0OO = new C31368OooOO0O();
                    c31368OooOO0OOooO0OO.f112011OooO0OO = new C31367OooOO0();
                } else {
                    long jOooO00o = this.f112050OooO0oO.OooO00o();
                    this.f112050OooO0oO.seek(this.f112119OooO0O0 + jArr[i]);
                    c31368OooOO0OOooO0OO = OooO0OO(i);
                    this.f112050OooO0oO.seek(jOooO00o);
                }
                C31368OooOO0O[] c31368OooOO0OArr2 = this.f112049OooO0o;
                if (c31368OooOO0OArr2 != null && c31368OooOO0OArr2[i] == null && (i2 = this.f112052OooOO0) < 100) {
                    c31368OooOO0OArr2[i] = c31368OooOO0OOooO0OO;
                    this.f112052OooOO0 = i2 + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c31368OooOO0OOooO0OO;
    }

    public final C31368OooOO0O OooO0OO(int i) throws IOException {
        short s;
        C31368OooOO0O c31368OooOO0O = new C31368OooOO0O();
        C31381OooOOoo c31381OooOOooOooo0 = this.f112122OooO0o0.Oooo0();
        if (c31381OooOOooOooo0 == null) {
            s = 0;
        } else {
            int i2 = c31381OooOOooOooo0.f112063OooO;
            s = i < i2 ? c31381OooOOooOooo0.f112065OooO0oO[i] : c31381OooOOooOooo0.f112066OooO0oo[i - i2];
        }
        AbstractC31397Oooo0O0 abstractC31397Oooo0O0 = this.f112050OooO0oO;
        c31368OooOO0O.f112010OooO0O0 = abstractC31397Oooo0O0.Oooo000();
        c31368OooOO0O.f112009OooO00o = abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        short s2 = c31368OooOO0O.f112009OooO00o;
        short s3 = c31368OooOO0O.f112010OooO0O0;
        if (s3 >= 0) {
            c31368OooOO0O.f112011OooO0OO = new C31367OooOO0(s3, abstractC31397Oooo0O0, (short) (s - s2));
        } else {
            c31368OooOO0O.f112011OooO0OO = new C31366OooO0oo(abstractC31397Oooo0O0, this);
        }
        if (c31368OooOO0O.f112011OooO0OO.OooO00o()) {
            c31368OooOO0O.f112011OooO0OO.OooO0Oo();
        }
        return c31368OooOO0O;
    }
}
