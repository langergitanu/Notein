package o00oO0O;

import OoooOoO.InterfaceC21233OooO0o;

/* JADX INFO: renamed from: o00oO0O.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25526OoooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f87082OooO00o;

    /* JADX INFO: renamed from: o00oO0O.OoooO0$OooO00o */
    public static final class OooO00o extends InterfaceC21233OooO0o.OooO0OO {
        public final String toString() {
            return "<Head>";
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f61606OooOoO0 = -1;
        f87082OooO00o = oooO00o;
    }

    public static final int OooO00o(InterfaceC21233OooO0o.OooO0O0 prev, InterfaceC21233OooO0o.OooO0O0 next) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(prev, "prev");
        kotlin.jvm.internal.OooOOO0.OooO0oO(next, "next");
        if (prev.equals(next)) {
            return 2;
        }
        return prev.getClass() == next.getClass() ? 1 : 0;
    }
}
