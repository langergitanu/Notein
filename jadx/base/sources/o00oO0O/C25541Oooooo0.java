package o00oO0O;

import OoooOoO.InterfaceC21233OooO0o;
import o00oO0O.C25503OooOoOO;

/* JADX INFO: renamed from: o00oO0O.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25541Oooooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo.OooO0O0<C25503OooOoOO> f87116OooO00o = new Oooo.OooO0O0<>(new C25503OooOoOO[16]);

    public static void OooO00o(C25503OooOoOO c25503OooOoOO) {
        C25511OooOooo c25511OooOooo = c25503OooOoOO.f86962OoooOOO;
        if (c25511OooOooo.f86987OooO0O0 == C25503OooOoOO.EnumC25504OooO0Oo.f86975OooOoO0 && !c25511OooOooo.f86989OooO0Oo && !c25511OooOooo.f86988OooO0OO && c25503OooOoOO.f86953Oooo0o) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO = c25503OooOoOO.f86970o000oOoO.f87088OooO0o0;
            if ((oooO0OO.f61606OooOoO0 & 256) != 0) {
                while (oooO0OO != null) {
                    if ((oooO0OO.f61603OooOo & 256) != 0 && (oooO0OO instanceof InterfaceC25494OooOOOo)) {
                        InterfaceC25494OooOOOo interfaceC25494OooOOOo = (InterfaceC25494OooOOOo) oooO0OO;
                        interfaceC25494OooOOOo.OooOo00(OooO.OooO0Oo(interfaceC25494OooOOOo, 256));
                    }
                    if ((oooO0OO.f61606OooOoO0 & 256) == 0) {
                        break;
                    } else {
                        oooO0OO = oooO0OO.f61607OooOoOO;
                    }
                }
            }
        }
        int i = 0;
        c25503OooOoOO.f86967Ooooo00 = false;
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0OooOo0 = c25503OooOoOO.OooOo0();
        int i2 = oooO0O0OooOo0.f59746OooOoO0;
        if (i2 > 0) {
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0OooOo0.f59745OooOo0o;
            do {
                OooO00o(c25503OooOoOOArr[i]);
                i++;
            } while (i < i2);
        }
    }
}
