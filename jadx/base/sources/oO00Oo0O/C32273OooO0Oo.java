package oO00Oo0O;

import kotlin.jvm.internal.OooOOO0;
import oO00Oo0.AbstractC32268OooO0oO;

/* JADX INFO: renamed from: oO00Oo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32273OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f115991OooO00o = new byte[0];

    public static final void OooO00o(AbstractC32268OooO0oO abstractC32268OooO0oO, C32271OooO00o current) {
        OooOOO0.OooO0oO(abstractC32268OooO0oO, "<this>");
        OooOOO0.OooO0oO(current, "current");
        if (current == abstractC32268OooO0oO) {
            return;
        }
        int i = current.f115946OooO0OO;
        int i2 = current.f115945OooO0O0;
        if (i <= i2) {
            abstractC32268OooO0oO.OooOOO0(current);
            return;
        }
        int i3 = current.f115949OooO0o0;
        int i4 = current.f115948OooO0o;
        if (i4 - i3 >= 8) {
            abstractC32268OooO0oO.f115966OooOoO = i2;
            return;
        }
        C32271OooO00o c32271OooO00oOooO0oo = current.OooO0oo();
        if (c32271OooO00oOooO0oo == null) {
            abstractC32268OooO0oO.OooOooo(current);
            return;
        }
        int i5 = current.f115946OooO0OO - current.f115945OooO0O0;
        int iMin = Math.min(i5, 8 - (i4 - current.f115949OooO0o0));
        if (c32271OooO00oOooO0oo.f115947OooO0Oo < iMin) {
            abstractC32268OooO0oO.OooOooo(current);
            return;
        }
        c32271OooO00oOooO0oo.OooO0Oo(c32271OooO00oOooO0oo.f115945OooO0O0 - iMin);
        if (i5 > iMin) {
            current.f115949OooO0o0 = i4;
            abstractC32268OooO0oO.f115968OooOoOO = current.f115946OooO0OO;
            abstractC32268OooO0oO.o00000OO(abstractC32268OooO0oO.f115970OooOoo0 + ((long) iMin));
        } else {
            abstractC32268OooO0oO.o00000oO(c32271OooO00oOooO0oo);
            abstractC32268OooO0oO.o00000OO(abstractC32268OooO0oO.f115970OooOoo0 - ((long) ((c32271OooO00oOooO0oo.f115946OooO0OO - c32271OooO00oOooO0oo.f115945OooO0O0) - iMin)));
            current.OooO0o();
            current.OooOO0(abstractC32268OooO0oO.f115965OooOo0o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C32271OooO00o OooO0O0(AbstractC32268OooO0oO abstractC32268OooO0oO, C32271OooO00o c32271OooO00o) {
        OooOOO0.OooO0oO(abstractC32268OooO0oO, "<this>");
        if (c32271OooO00o != abstractC32268OooO0oO) {
            return abstractC32268OooO0oO.OooOOO0(c32271OooO00o);
        }
        if (abstractC32268OooO0oO.f115966OooOoO == abstractC32268OooO0oO.f115968OooOoOO && abstractC32268OooO0oO.f115970OooOoo0 == 0) {
            return null;
        }
        return (C32271OooO00o) abstractC32268OooO0oO;
    }

    public static final C32271OooO00o OooO0OO(oO00Oo0.OooO0OO oooO0OO, int i, C32271OooO00o c32271OooO00o) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        if (c32271OooO00o != null) {
            oooO0OO.OooO00o();
        }
        return oooO0OO.o0Oo0oo(i);
    }
}
