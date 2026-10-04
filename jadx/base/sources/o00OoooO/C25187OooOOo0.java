package o00OoooO;

import java.util.ArrayDeque;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00OoooO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25187OooOOo0<A, B> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25185OooOOOo f85732OooO00o = new C25185OooOOOo(500);

    /* JADX INFO: renamed from: o00OoooO.OooOOo0$OooO00o */
    public static final class OooO00o<A> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final ArrayDeque f85733OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public A f85734OooO00o;

        static {
            char[] cArr = C25316OooOO0o.f86159OooO00o;
            f85733OooO0O0 = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static OooO00o OooO00o(Object obj) {
            OooO00o oooO00o;
            ArrayDeque arrayDeque = f85733OooO0O0;
            synchronized (arrayDeque) {
                oooO00o = (OooO00o) arrayDeque.poll();
            }
            if (oooO00o == null) {
                oooO00o = new OooO00o();
            }
            oooO00o.f85734OooO00o = obj;
            return oooO00o;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            oooO00o.getClass();
            return this.f85734OooO00o.equals(oooO00o.f85734OooO00o);
        }

        public final int hashCode() {
            return this.f85734OooO00o.hashCode();
        }
    }
}
