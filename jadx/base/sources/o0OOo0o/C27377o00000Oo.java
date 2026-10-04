package o0OOo0o;

import OooOoOO.C20519OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO0o.C27129OoooOOO;
import oO00OoO0.C32285OooO0o0;
import oO00ooO.C32447OooOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o0OOo0o.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27377o00000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f95378OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32447OooOOo f95379OooO0O0 = C20519OooO0Oo.OooO0OO(new o000O0oO.OooO0o(this, 1));

    public C27377o00000Oo(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27129OoooOOO c27129OoooOOO) {
        this.f95378OooO00o = abstractApplicationC26277OooOoOO;
    }

    public final boolean OooO00o(String countryCode, String number) {
        C32447OooOOo c32447OooOOo = this.f95379OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(countryCode, "countryCode");
        kotlin.jvm.internal.OooOOO0.OooO0oO(number, "number");
        try {
            if (!C33599OooOo0O.OooOoOO(countryCode, "+", false)) {
                countryCode = "+".concat(countryCode);
            }
            C32285OooO0o0 c32285OooO0o0 = (C32285OooO0o0) c32447OooOOo.getValue();
            if (c32285OooO0o0 != null) {
                oO00OoO0.OooO oooOOooOo00 = c32285OooO0o0.OooOo00(countryCode + number, countryCode);
                C32285OooO0o0 c32285OooO0o02 = (C32285OooO0o0) c32447OooOOo.getValue();
                if (c32285OooO0o02 != null) {
                    return c32285OooO0o02.OooOOO0(oooOOooOo00);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
