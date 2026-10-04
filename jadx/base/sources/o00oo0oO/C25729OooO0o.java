package o00oo0oO;

import java.util.Collections;
import java.util.List;
import o00oo.OooOO0O;

/* JADX INFO: renamed from: o00oo0oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25729OooO0o implements InterfaceC25728OooO0Oo {

    /* JADX INFO: renamed from: o00oo0oO.OooO0o$OooO00o */
    public static class OooO00o {
    }

    @Override // o00oo0oO.InterfaceC25728OooO0Oo
    public final int OooO00o(int i) {
        List list = Collections.EMPTY_LIST;
        if (list == null || list.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((Integer) list.get(i2)).intValue() > i) {
                return ((Integer) list.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // o00oo0oO.InterfaceC25728OooO0Oo
    public final OooOO0O OooO0O0(int i) {
        boolean z = i >= 0;
        OooOO0O oooOO0O = new OooOO0O();
        oooOO0O.f87513OooO00o = i;
        oooOO0O.f87514OooO0O0 = z;
        oooOO0O.f87515OooO0OO = false;
        return oooOO0O;
    }
}
