package o0Oo0ooo;

/* JADX INFO: renamed from: o0Oo0ooo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC28485OooOo00 {

    /* JADX INFO: renamed from: o0Oo0ooo.OooOo00$OooO00o */
    public static final class OooO00o extends AbstractC28485OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f100930OooO00o = new OooO00o();
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOo00$OooO0O0 */
    public static final class OooO0O0 extends AbstractC28485OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f100931OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f100932OooO0O0;

        public OooO0O0(String countryCode, String phoneNumber) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(countryCode, "countryCode");
            kotlin.jvm.internal.OooOOO0.OooO0oO(phoneNumber, "phoneNumber");
            this.f100931OooO00o = countryCode;
            this.f100932OooO0O0 = phoneNumber;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100931OooO00o, oooO0O0.f100931OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100932OooO0O0, oooO0O0.f100932OooO0O0);
        }

        public final int hashCode() {
            return this.f100932OooO0O0.hashCode() + (this.f100931OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CodeSent(countryCode=");
            sb.append(this.f100931OooO00o);
            sb.append(", phoneNumber=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f100932OooO0O0, ")");
        }
    }
}
