package o0ooOOO0;

/* JADX INFO: renamed from: o0ooOOO0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31640OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113098OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113099OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f113100OooO0OO;

    public C31640OooOo00() {
        this(0);
    }

    public static C31640OooOo00 OooO00o(C31640OooOo00 c31640OooOo00, String countryCode, String phoneNumber, boolean z, int i) {
        if ((i & 1) != 0) {
            countryCode = c31640OooOo00.f113098OooO00o;
        }
        if ((i & 2) != 0) {
            phoneNumber = c31640OooOo00.f113099OooO0O0;
        }
        if ((i & 4) != 0) {
            z = c31640OooOo00.f113100OooO0OO;
        }
        c31640OooOo00.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(countryCode, "countryCode");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phoneNumber, "phoneNumber");
        return new C31640OooOo00(countryCode, phoneNumber, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31640OooOo00)) {
            return false;
        }
        C31640OooOo00 c31640OooOo00 = (C31640OooOo00) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113098OooO00o, c31640OooOo00.f113098OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113099OooO0O0, c31640OooOo00.f113099OooO0O0) && this.f113100OooO0OO == c31640OooOo00.f113100OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113100OooO0OO) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f113098OooO00o.hashCode() * 31, 31, this.f113099OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneVerificationRequestUiState(countryCode=");
        sb.append(this.f113098OooO00o);
        sb.append(", phoneNumber=");
        sb.append(this.f113099OooO0O0);
        sb.append(", isAgreementChecked=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f113100OooO0OO);
    }

    public /* synthetic */ C31640OooOo00(int i) {
        this("86", "", false);
    }

    public C31640OooOo00(String str, String str2, boolean z) {
        this.f113098OooO00o = str;
        this.f113099OooO0O0 = str2;
        this.f113100OooO0OO = z;
    }
}
