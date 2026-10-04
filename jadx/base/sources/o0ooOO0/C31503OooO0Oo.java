package o0ooOO0;

import o00000o0.EnumC24118OooO0oO;
import o0Oo0oo.C28393OooOOOo;
import oo0o0Oo.C34695OooOOo0;

/* JADX INFO: renamed from: o0ooOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31503OooO0Oo extends AbstractC31500OooO00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static C31503OooO0Oo f112685OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C34695OooOOo0 f112686OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C28393OooOOOo f112687OooO0Oo;

    public final int OooO(int i, EnumC24118OooO0oO enumC24118OooO0oO) {
        C34695OooOOo0 c34695OooOOo0 = this.f112686OooO0OO;
        if (c34695OooOOo0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
            throw null;
        }
        int iOooO0oo = c34695OooOOo0.OooO0oo(i);
        C34695OooOOo0 c34695OooOOo02 = this.f112686OooO0OO;
        if (c34695OooOOo02 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
            throw null;
        }
        if (enumC24118OooO0oO != c34695OooOOo02.OooOO0O(iOooO0oo)) {
            C34695OooOOo0 c34695OooOOo03 = this.f112686OooO0OO;
            if (c34695OooOOo03 != null) {
                return c34695OooOOo03.OooO0oo(i);
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
            throw null;
        }
        if (this.f112686OooO0OO != null) {
            return r6.OooO0o0(i, false) - 1;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
        throw null;
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0Oo(int i) {
        int iOooO0oO;
        if (OooO0o().length() <= 0 || i >= OooO0o().length()) {
            return null;
        }
        try {
            C28393OooOOOo c28393OooOOOo = this.f112687OooO0Oo;
            if (c28393OooOOOo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("node");
                throw null;
            }
            int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(c28393OooOOOo.OooO0Oo().OooO0O0());
            if (i <= 0) {
                i = 0;
            }
            C34695OooOOo0 c34695OooOOo0 = this.f112686OooO0OO;
            if (c34695OooOOo0 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            int iOooO0o = c34695OooOOo0.OooO0o(i);
            C34695OooOOo0 c34695OooOOo02 = this.f112686OooO0OO;
            if (c34695OooOOo02 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            float fOooO = c34695OooOOo02.OooO(iOooO0o) + iOooO0O0;
            C34695OooOOo0 c34695OooOOo03 = this.f112686OooO0OO;
            if (c34695OooOOo03 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            if (c34695OooOOo03 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            if (fOooO < c34695OooOOo03.OooO(c34695OooOOo03.f124973OooO0O0.f124907OooO0o - 1)) {
                C34695OooOOo0 c34695OooOOo04 = this.f112686OooO0OO;
                if (c34695OooOOo04 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                    throw null;
                }
                iOooO0oO = c34695OooOOo04.OooO0oO(fOooO);
            } else {
                C34695OooOOo0 c34695OooOOo05 = this.f112686OooO0OO;
                if (c34695OooOOo05 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                    throw null;
                }
                iOooO0oO = c34695OooOOo05.f124973OooO0O0.f124907OooO0o;
            }
            return OooO0o0(i, OooO(iOooO0oO - 1, EnumC24118OooO0oO.f81272OooOo0o) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0oO(int i) {
        int iOooO0oO;
        if (OooO0o().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            C28393OooOOOo c28393OooOOOo = this.f112687OooO0Oo;
            if (c28393OooOOOo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("node");
                throw null;
            }
            int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(c28393OooOOOo.OooO0Oo().OooO0O0());
            int length = OooO0o().length();
            if (length <= i) {
                i = length;
            }
            C34695OooOOo0 c34695OooOOo0 = this.f112686OooO0OO;
            if (c34695OooOOo0 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            int iOooO0o = c34695OooOOo0.OooO0o(i);
            C34695OooOOo0 c34695OooOOo02 = this.f112686OooO0OO;
            if (c34695OooOOo02 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            float fOooO = c34695OooOOo02.OooO(iOooO0o) - iOooO0O0;
            if (fOooO > 0.0f) {
                C34695OooOOo0 c34695OooOOo03 = this.f112686OooO0OO;
                if (c34695OooOOo03 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                    throw null;
                }
                iOooO0oO = c34695OooOOo03.OooO0oO(fOooO);
            } else {
                iOooO0oO = 0;
            }
            if (i == OooO0o().length() && iOooO0oO < iOooO0o) {
                iOooO0oO++;
            }
            return OooO0o0(OooO(iOooO0oO, EnumC24118OooO0oO.f81271OooOo), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
