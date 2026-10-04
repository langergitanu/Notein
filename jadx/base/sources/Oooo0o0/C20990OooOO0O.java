package Oooo0o0;

import OooOoo0.C20659OooO0oo;
import OooOooo.C20749OooO0OO;
import OooOooo.C20803Ooooo0o;
import Oooo0oO.C21035OooOOo;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000OO;
import OoooOoO.InterfaceC21233OooO0o;
import OooooOO.C21359o00Ooo;
import o0000Ooo.C24232OooO0o0;
import o0000Ooo.InterfaceC24229OooO0OO;
import o0ooOO0.C31552Oooooo;

/* JADX INFO: renamed from: Oooo0o0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20990OooOO0O {
    public static final void OooO00o(InterfaceC21233OooO0o interfaceC21233OooO0o, float f, long j, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) {
        int i2;
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(1562471785);
        if ((i & 14) == 0) {
            i2 = (c21035OooOOoOooOOO0.OooO0oo(interfaceC21233OooO0o) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= c21035OooOOoOooOOO0.Oooo00O(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= c21035OooOOoOooOOO0.Oooo0(j) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && c21035OooOOoOooOOO0.OooO00o()) {
            c21035OooOOoOooOOO0.OooO0o();
        } else {
            c21035OooOOoOooOOO0.OoooooO();
            if ((i & 1) != 0 && !c21035OooOOoOooOOO0.OoooOOO()) {
                c21035OooOOoOooOOO0.OooO0o();
            }
            c21035OooOOoOooOOO0.OoooO00();
            c21035OooOOoOooOOO0.OooOo00(1232935509);
            float density = C24232OooO0o0.OooO00o(f, 0.0f) ? 1.0f / ((InterfaceC24229OooO0OO) c21035OooOOoOooOOO0.OooO0o0(C31552Oooooo.f112773OooO0o0)).getDensity() : f;
            c21035OooOOoOooOOO0.Oooo(false);
            C20749OooO0OO.OooO00o(C20659OooO0oo.OooO00o(C20803Ooooo0o.OooO0Oo(C20803Ooooo0o.OooO0OO(interfaceC21233OooO0o), density), j, C21359o00Ooo.f61779OooO00o), c21035OooOOoOooOOO0, 0);
        }
        o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new C20989OooOO0(interfaceC21233OooO0o, f, j, i);
    }
}
