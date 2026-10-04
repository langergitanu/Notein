package o0ooOO0;

import o00000o0.EnumC24118OooO0oO;
import oo0o0Oo.C34695OooOOo0;

/* JADX INFO: renamed from: o0ooOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31502OooO0OO extends AbstractC31500OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C31502OooO0OO f112683OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C34695OooOOo0 f112684OooO0OO;

    public final int OooO(int i, EnumC24118OooO0oO enumC24118OooO0oO) {
        C34695OooOOo0 c34695OooOOo0 = this.f112684OooO0OO;
        if (c34695OooOOo0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
            throw null;
        }
        int iOooO0oo = c34695OooOOo0.OooO0oo(i);
        C34695OooOOo0 c34695OooOOo02 = this.f112684OooO0OO;
        if (c34695OooOOo02 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
            throw null;
        }
        if (enumC24118OooO0oO != c34695OooOOo02.OooOO0O(iOooO0oo)) {
            C34695OooOOo0 c34695OooOOo03 = this.f112684OooO0OO;
            if (c34695OooOOo03 != null) {
                return c34695OooOOo03.OooO0oo(i);
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
            throw null;
        }
        if (this.f112684OooO0OO != null) {
            return r6.OooO0o0(i, false) - 1;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
        throw null;
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0Oo(int i) {
        int iOooO0o;
        if (OooO0o().length() <= 0 || i >= OooO0o().length()) {
            return null;
        }
        EnumC24118OooO0oO enumC24118OooO0oO = EnumC24118OooO0oO.f81271OooOo;
        if (i < 0) {
            C34695OooOOo0 c34695OooOOo0 = this.f112684OooO0OO;
            if (c34695OooOOo0 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            iOooO0o = c34695OooOOo0.OooO0o(0);
        } else {
            C34695OooOOo0 c34695OooOOo02 = this.f112684OooO0OO;
            if (c34695OooOOo02 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            int iOooO0o2 = c34695OooOOo02.OooO0o(i);
            iOooO0o = OooO(iOooO0o2, enumC24118OooO0oO) == i ? iOooO0o2 : iOooO0o2 + 1;
        }
        C34695OooOOo0 c34695OooOOo03 = this.f112684OooO0OO;
        if (c34695OooOOo03 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
            throw null;
        }
        if (iOooO0o >= c34695OooOOo03.f124973OooO0O0.f124907OooO0o) {
            return null;
        }
        return OooO0o0(OooO(iOooO0o, enumC24118OooO0oO), OooO(iOooO0o, EnumC24118OooO0oO.f81272OooOo0o) + 1);
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0oO(int i) {
        int iOooO0o;
        if (OooO0o().length() <= 0 || i <= 0) {
            return null;
        }
        int length = OooO0o().length();
        EnumC24118OooO0oO enumC24118OooO0oO = EnumC24118OooO0oO.f81272OooOo0o;
        if (i > length) {
            C34695OooOOo0 c34695OooOOo0 = this.f112684OooO0OO;
            if (c34695OooOOo0 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            iOooO0o = c34695OooOOo0.OooO0o(OooO0o().length());
        } else {
            C34695OooOOo0 c34695OooOOo02 = this.f112684OooO0OO;
            if (c34695OooOOo02 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("layoutResult");
                throw null;
            }
            int iOooO0o2 = c34695OooOOo02.OooO0o(i);
            iOooO0o = OooO(iOooO0o2, enumC24118OooO0oO) + 1 == i ? iOooO0o2 : iOooO0o2 - 1;
        }
        if (iOooO0o < 0) {
            return null;
        }
        return OooO0o0(OooO(iOooO0o, EnumC24118OooO0oO.f81271OooOo), OooO(iOooO0o, enumC24118OooO0oO) + 1);
    }
}
