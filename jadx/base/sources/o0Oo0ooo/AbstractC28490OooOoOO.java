package o0Oo0ooo;

/* JADX INFO: renamed from: o0Oo0ooo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC28490OooOoOO {

    /* JADX INFO: renamed from: o0Oo0ooo.OooOoOO$OooO00o */
    public static final class OooO00o extends AbstractC28490OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f100961OooO00o = new OooO00o();
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOoOO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC28490OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f100962OooO00o = new OooO0O0();
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOoOO$OooO0OO */
    public static final class OooO0OO extends AbstractC28490OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f100963OooO00o = new OooO0OO();
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOoOO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C28491OooO0Oo extends AbstractC28490OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C28491OooO0Oo f100964OooO00o = new C28491OooO0Oo();
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOoOO$OooO0o */
    public static final class OooO0o extends AbstractC28490OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f100965OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f100966OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f100967OooO0OO;

        public OooO0o(String countryCode, String phoneNumber, String verificationCode) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(countryCode, "countryCode");
            kotlin.jvm.internal.OooOOO0.OooO0oO(phoneNumber, "phoneNumber");
            kotlin.jvm.internal.OooOOO0.OooO0oO(verificationCode, "verificationCode");
            this.f100965OooO00o = countryCode;
            this.f100966OooO0O0 = phoneNumber;
            this.f100967OooO0OO = verificationCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100965OooO00o, oooO0o.f100965OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100966OooO0O0, oooO0o.f100966OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100967OooO0OO, oooO0o.f100967OooO0OO);
        }

        public final int hashCode() {
            return this.f100967OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f100965OooO00o.hashCode() * 31, 31, this.f100966OooO0O0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PasswordResetBeforeLoginSuccess(countryCode=");
            sb.append(this.f100965OooO00o);
            sb.append(", phoneNumber=");
            sb.append(this.f100966OooO0O0);
            sb.append(", verificationCode=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f100967OooO0OO, ")");
        }
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOoOO$OooO0o0, reason: case insensitive filesystem */
    public static final class C28492OooO0o0 extends AbstractC28490OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f100968OooO00o;

        public C28492OooO0o0(String verificationCode) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(verificationCode, "verificationCode");
            this.f100968OooO00o = verificationCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28492OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100968OooO00o, ((C28492OooO0o0) obj).f100968OooO00o);
        }

        public final int hashCode() {
            return this.f100968OooO00o.hashCode();
        }

        public final String toString() {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("PasswordResetAfterLoginSuccess(verificationCode="), this.f100968OooO00o, ")");
        }
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOoOO$OooO0oO, reason: case insensitive filesystem */
    public static final class C28493OooO0oO extends AbstractC28490OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EnumC28500Oooo00o f100969OooO00o;

        public C28493OooO0oO(EnumC28500Oooo00o enumC28500Oooo00o) {
            this.f100969OooO00o = enumC28500Oooo00o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28493OooO0oO) && this.f100969OooO00o == ((C28493OooO0oO) obj).f100969OooO00o;
        }

        public final int hashCode() {
            return this.f100969OooO00o.hashCode();
        }

        public final String toString() {
            return "ShowToast(message=" + this.f100969OooO00o + ")";
        }
    }
}
