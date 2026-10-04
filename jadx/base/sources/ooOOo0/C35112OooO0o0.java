package ooOOo0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ooOOo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35112OooO0o0 extends AtomicReference<oO0OOO00.OooO0O0> implements oO0OOO00.OooO0O0 {
    private static final long serialVersionUID = -754898800686245608L;

    public final boolean OooO00o() {
        return EnumC35109OooO0O0.OooO0O0(get());
    }

    public final void OooO0O0(oO0OOO00.OooO0O0 oooO0O0) {
        while (true) {
            oO0OOO00.OooO0O0 oooO0O02 = get();
            if (oooO0O02 == EnumC35109OooO0O0.f126092OooOo0o) {
                if (oooO0O0 != null) {
                    oooO0O0.dispose();
                    return;
                }
                return;
            } else {
                while (!compareAndSet(oooO0O02, oooO0O0)) {
                    if (get() != oooO0O02) {
                        break;
                    }
                }
                if (oooO0O02 != null) {
                    oooO0O02.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        EnumC35109OooO0O0.OooO00o(this);
    }
}
