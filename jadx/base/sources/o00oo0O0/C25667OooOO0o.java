package o00oo0O0;

import OooooO0.C21287OooO0OO;
import o00o0OOO.C25401OooO0o;
import o00ooO0o.C25763OooO00o;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oOo00Oo0.C34510OooOO0o;

/* JADX INFO: renamed from: o00oo0O0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25667OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C25667OooOO0o f87606OooO00o;

    public static final C34510OooOO0o OooO00o(String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        return new C34510OooOO0o(str);
    }

    public static final void OooO0Oo(oO00Oo0.OooO0OO oooO0OO, byte[] src, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(src, "src");
        C32271OooO00o c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i2, c32271OooO00oOooO0OO.f115949OooO0o0 - c32271OooO00oOooO0OO.f115946OooO0OO);
                C21287OooO0OO.OooO0OO(c32271OooO00oOooO0OO, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                if (i2 <= 0) {
                    return;
                } else {
                    c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, c32271OooO00oOooO0OO);
                }
            } finally {
                oooO0OO.OooO00o();
            }
        }
    }

    public C25657OooO00o OooO0O0(C25763OooO00o c25763OooO00o, Object obj) {
        C25657OooO00o c25657OooO00o = new C25657OooO00o(c25763OooO00o.f87911OooO0O0.toString(), c25763OooO00o.f87916OooO0oO, c25763OooO00o.f87914OooO0o, null, null);
        c25657OooO00o.f87581OooO0o = obj;
        return c25657OooO00o;
    }

    public C25401OooO0o OooO0OO(C25763OooO00o c25763OooO00o, Object obj) {
        return new C25401OooO0o(c25763OooO00o.f87911OooO0O0.toString());
    }
}
