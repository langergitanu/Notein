package o0oOooo0;

/* JADX INFO: renamed from: o0oOooo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31169OooO0OO {

    /* JADX INFO: renamed from: o0oOooo0.OooO0OO$OooO00o */
    public static final class OooO00o extends AbstractC31169OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f111184OooO00o = new OooO00o();
    }

    /* JADX INFO: renamed from: o0oOooo0.OooO0OO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC31169OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public EnumC31167OooO00o f111185OooO00o;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0O0) && this.f111185OooO00o == ((OooO0O0) obj).f111185OooO00o;
        }

        public final int hashCode() {
            return this.f111185OooO00o.hashCode();
        }

        public final String toString() {
            return "DraggingCorner(corner=" + this.f111185OooO00o + ")";
        }
    }

    /* JADX INFO: renamed from: o0oOooo0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C20158OooO0OO extends AbstractC31169OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public EnumC31170OooO0Oo f111186OooO00o;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20158OooO0OO) && this.f111186OooO00o == ((C20158OooO0OO) obj).f111186OooO00o;
        }

        public final int hashCode() {
            return this.f111186OooO00o.hashCode();
        }

        public final String toString() {
            return "DraggingEdge(edge=" + this.f111186OooO00o + ")";
        }
    }

    /* JADX INFO: renamed from: o0oOooo0.OooO0OO$OooO0Oo */
    public static final class OooO0Oo extends AbstractC31169OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0Oo f111187OooO00o = new OooO0Oo();
    }
}
