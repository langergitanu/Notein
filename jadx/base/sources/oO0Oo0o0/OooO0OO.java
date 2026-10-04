package oO0Oo0o0;

import oO0Oo0o0.C33216OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO {

    public static final class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f120187OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final int f120188OooO0O0;

        static {
            C33216OooO0Oo.OooO00o oooO00o = C33216OooO0Oo.f120191OooO0OO;
            oooO00o.getClass();
            int i = C33216OooO0Oo.f120198OooOO0O;
            oooO00o.getClass();
            int i2 = C33216OooO0Oo.f120190OooO;
            oooO00o.getClass();
            f120188OooO0O0 = (~(C33216OooO0Oo.f120197OooOO0 | i2)) & i;
        }

        @Override // oO0Oo0o0.OooO0OO
        public final int OooO00o() {
            return f120188OooO0O0;
        }
    }

    public static final class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f120189OooO00o = new OooO0O0();

        @Override // oO0Oo0o0.OooO0OO
        public final int OooO00o() {
            return 0;
        }
    }

    public abstract int OooO00o();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
