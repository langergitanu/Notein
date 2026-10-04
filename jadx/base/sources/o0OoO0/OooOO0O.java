package o0OoO0;

import OooOoo0.o00000;
import com.orion.notein.p607ui.login.password.OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f101093OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.orion.notein.p607ui.login.password.OooO00o f101096OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f101097OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.orion.notein.p607ui.login.password.OooO00o f101098OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f101099OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f101100OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f101101OooO0oo;

    public OooOO0O() {
        this(0);
    }

    public static OooOO0O OooO00o(OooOO0O oooOO0O, String str, String str2, OooO00o.OooO0O0 oooO0O0, String str3, boolean z, com.orion.notein.p607ui.login.password.OooO00o oooO00o, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            str = oooOO0O.f101094OooO00o;
        }
        String countryCode = str;
        if ((i & 2) != 0) {
            str2 = oooOO0O.f101095OooO0O0;
        }
        String phoneNumber = str2;
        com.orion.notein.p607ui.login.password.OooO00o oooO00o2 = oooO0O0;
        if ((i & 4) != 0) {
            oooO00o2 = oooOO0O.f101096OooO0OO;
        }
        com.orion.notein.p607ui.login.password.OooO00o oooO00o3 = oooO00o2;
        if ((i & 8) != 0) {
            str3 = oooOO0O.f101097OooO0Oo;
        }
        String password = str3;
        if ((i & 16) != 0) {
            z = oooOO0O.f101099OooO0o0;
        }
        boolean z5 = z;
        com.orion.notein.p607ui.login.password.OooO00o oooO00o4 = (i & 32) != 0 ? oooOO0O.f101098OooO0o : oooO00o;
        boolean z6 = (i & 64) != 0 ? oooOO0O.f101100OooO0oO : z2;
        boolean z7 = (i & 128) != 0 ? oooOO0O.f101101OooO0oo : z3;
        boolean z8 = (i & 256) != 0 ? oooOO0O.f101093OooO : z4;
        oooOO0O.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(countryCode, "countryCode");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.OooOOO0.OooO0oO(password, "password");
        return new OooOO0O(countryCode, phoneNumber, oooO00o3, password, z5, oooO00o4, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101094OooO00o, oooOO0O.f101094OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101095OooO0O0, oooOO0O.f101095OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101096OooO0OO, oooOO0O.f101096OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101097OooO0Oo, oooOO0O.f101097OooO0Oo) && this.f101099OooO0o0 == oooOO0O.f101099OooO0o0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101098OooO0o, oooOO0O.f101098OooO0o) && this.f101100OooO0oO == oooOO0O.f101100OooO0oO && this.f101101OooO0oo == oooOO0O.f101101OooO0oo && this.f101093OooO == oooOO0O.f101093OooO;
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f101094OooO00o.hashCode() * 31, 31, this.f101095OooO0O0);
        com.orion.notein.p607ui.login.password.OooO00o oooO00o = this.f101096OooO0OO;
        int iOooO0O02 = o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((iOooO0O0 + (oooO00o == null ? 0 : oooO00o.hashCode())) * 31, 31, this.f101097OooO0Oo), 31, this.f101099OooO0o0);
        com.orion.notein.p607ui.login.password.OooO00o oooO00o2 = this.f101098OooO0o;
        return Boolean.hashCode(this.f101093OooO) + o00000.OooO0O0(o00000.OooO0O0((iOooO0O02 + (oooO00o2 != null ? oooO00o2.hashCode() : 0)) * 31, 31, this.f101100OooO0oO), 31, this.f101101OooO0oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PasswordLoginUiState(countryCode=");
        sb.append(this.f101094OooO00o);
        sb.append(", phoneNumber=");
        sb.append(this.f101095OooO0O0);
        sb.append(", phoneError=");
        sb.append(this.f101096OooO0OO);
        sb.append(", password=");
        sb.append(this.f101097OooO0Oo);
        sb.append(", isPasswordValid=");
        sb.append(this.f101099OooO0o0);
        sb.append(", passwordError=");
        sb.append(this.f101098OooO0o);
        sb.append(", privacyAgreed=");
        sb.append(this.f101100OooO0oO);
        sb.append(", isLoginInProgress=");
        sb.append(this.f101101OooO0oo);
        sb.append(", isLoginButtonEnabled=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f101093OooO);
    }

    public /* synthetic */ OooOO0O(int i) {
        this("86", "", null, "", false, null, false, false, false);
    }

    public OooOO0O(String str, String str2, com.orion.notein.p607ui.login.password.OooO00o oooO00o, String str3, boolean z, com.orion.notein.p607ui.login.password.OooO00o oooO00o2, boolean z2, boolean z3, boolean z4) {
        this.f101094OooO00o = str;
        this.f101095OooO0O0 = str2;
        this.f101096OooO0OO = oooO00o;
        this.f101097OooO0Oo = str3;
        this.f101099OooO0o0 = z;
        this.f101098OooO0o = oooO00o2;
        this.f101100OooO0oO = z2;
        this.f101101OooO0oo = z3;
        this.f101093OooO = z4;
    }
}
