package o00O0O0o;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;

/* JADX INFO: loaded from: classes.dex */
public interface OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o.OooO0OO f84264OooO00o = new OooO00o.OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o.OooO0O0 f84265OooO0O0 = new OooO00o.OooO0O0();

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: o00O0O0o.OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19656OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Throwable f84266OooO00o;

            public C19656OooO00o(Throwable th) {
                this.f84266OooO00o = th;
            }

            public final String toString() {
                return C20593OooO0Oo.OooO0O0("FAILURE (", this.f84266OooO00o.getMessage(), ")");
            }
        }

        public static final class OooO0O0 extends OooO00o {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class OooO0OO extends OooO00o {
            public final String toString() {
                return MaterialPurchaseStatusResponse.STATUS_SUCCESS;
            }
        }
    }
}
