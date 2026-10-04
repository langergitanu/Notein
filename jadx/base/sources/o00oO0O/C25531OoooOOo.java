package o00oO0O;

import OoooOoO.InterfaceC21233OooO0o;

/* JADX INFO: renamed from: o00oO0O.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25531OoooOOo {
    public static final InterfaceC21233OooO0o.OooO0OO OooO00o(InterfaceC25492OooO0oo interfaceC25492OooO0oo, int i) {
        InterfaceC21233OooO0o.OooO0OO oooO0OO = interfaceC25492OooO0oo.getNode().f61607OooOoOO;
        if (oooO0OO == null || (oooO0OO.f61606OooOoO0 & i) == 0) {
            return null;
        }
        while (oooO0OO != null) {
            int i2 = oooO0OO.f61603OooOo;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return oooO0OO;
            }
            oooO0OO = oooO0OO.f61607OooOoOO;
        }
        return null;
    }
}
