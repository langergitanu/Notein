package o00O00oO;

/* JADX INFO: renamed from: o00O00oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24815OooO0OO extends InterfaceC24813OooO00o {

    /* JADX INFO: renamed from: o00O00oO.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f84157OooO0O0 = new OooO00o("VERTICAL");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f84158OooO0OO = new OooO00o("HORIZONTAL");

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f84159OooO00o;

        public OooO00o(String str) {
            this.f84159OooO00o = str;
        }

        public final String toString() {
            return this.f84159OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00O00oO.OooO0OO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f84160OooO0O0 = new OooO0O0("FLAT");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f84161OooO0OO = new OooO0O0("HALF_OPENED");

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f84162OooO00o;

        public OooO0O0(String str) {
            this.f84162OooO00o = str;
        }

        public final String toString() {
            return this.f84162OooO00o;
        }
    }

    boolean OooO00o();

    OooO00o getOrientation();
}
