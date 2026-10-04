package o0ooOOO0;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: o0ooOOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31626OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113060OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f113061OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f113062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final EnumC31621OooO00o f113063OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f113064OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f113065OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f113066OooO0oo;

    public C31626OooO0o0(String str, String str2, String str3, boolean z, boolean z2, EnumC31621OooO00o enumC31621OooO00o, int i, boolean z3) {
        this.f113059OooO00o = str;
        this.f113060OooO0O0 = str2;
        this.f113061OooO0OO = str3;
        this.f113062OooO0Oo = z;
        this.f113064OooO0o0 = z2;
        this.f113063OooO0o = enumC31621OooO00o;
        this.f113065OooO0oO = i;
        this.f113066OooO0oo = z3;
    }

    public static C31626OooO0o0 OooO00o(C31626OooO0o0 c31626OooO0o0, String str, boolean z, boolean z2, EnumC31621OooO00o enumC31621OooO00o, int i, boolean z3, int i2) {
        String str2 = c31626OooO0o0.f113059OooO00o;
        String str3 = c31626OooO0o0.f113060OooO0O0;
        if ((i2 & 4) != 0) {
            str = c31626OooO0o0.f113061OooO0OO;
        }
        String verificationCode = str;
        if ((i2 & 8) != 0) {
            z = c31626OooO0o0.f113062OooO0Oo;
        }
        boolean z4 = z;
        if ((i2 & 16) != 0) {
            z2 = c31626OooO0o0.f113064OooO0o0;
        }
        boolean z5 = z2;
        if ((i2 & 32) != 0) {
            enumC31621OooO00o = c31626OooO0o0.f113063OooO0o;
        }
        EnumC31621OooO00o enumC31621OooO00o2 = enumC31621OooO00o;
        if ((i2 & 64) != 0) {
            i = c31626OooO0o0.f113065OooO0oO;
        }
        int i3 = i;
        boolean z6 = (i2 & 128) != 0 ? c31626OooO0o0.f113066OooO0oo : z3;
        c31626OooO0o0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(verificationCode, "verificationCode");
        return new C31626OooO0o0(str2, str3, verificationCode, z4, z5, enumC31621OooO00o2, i3, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31626OooO0o0)) {
            return false;
        }
        C31626OooO0o0 c31626OooO0o0 = (C31626OooO0o0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113059OooO00o, c31626OooO0o0.f113059OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113060OooO0O0, c31626OooO0o0.f113060OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113061OooO0OO, c31626OooO0o0.f113061OooO0OO) && this.f113062OooO0Oo == c31626OooO0o0.f113062OooO0Oo && this.f113064OooO0o0 == c31626OooO0o0.f113064OooO0o0 && this.f113063OooO0o == c31626OooO0o0.f113063OooO0o && this.f113065OooO0oO == c31626OooO0o0.f113065OooO0oO && this.f113066OooO0oo == c31626OooO0o0.f113066OooO0oo;
    }

    public final int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f113059OooO00o.hashCode() * 31, 31, this.f113060OooO0O0), 31, this.f113061OooO0OO), 31, this.f113062OooO0Oo), 31, this.f113064OooO0o0);
        EnumC31621OooO00o enumC31621OooO00o = this.f113063OooO0o;
        return Boolean.hashCode(this.f113066OooO0oo) + C20785Oooo00o.OooO00o(this.f113065OooO0oO, (iOooO0O0 + (enumC31621OooO00o == null ? 0 : enumC31621OooO00o.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneCodeLoginUiState(countryCode=");
        sb.append(this.f113059OooO00o);
        sb.append(", phoneNumber=");
        sb.append(this.f113060OooO0O0);
        sb.append(", verificationCode=");
        sb.append(this.f113061OooO0OO);
        sb.append(", isLoginInProgress=");
        sb.append(this.f113062OooO0Oo);
        sb.append(", isLoginButtonEnabled=");
        sb.append(this.f113064OooO0o0);
        sb.append(", error=");
        sb.append(this.f113063OooO0o);
        sb.append(", secondsRemaining=");
        sb.append(this.f113065OooO0oO);
        sb.append(", isCounting=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f113066OooO0oo);
    }
}
