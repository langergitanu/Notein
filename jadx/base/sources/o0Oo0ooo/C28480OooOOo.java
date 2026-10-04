package o0Oo0ooo;

import OooOoo0.o00000;
import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0Oo0ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28480OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f100911OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f100912OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EnumC28481OooOOo0 f100913OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f100914OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f100915OooO0o0;

    public C28480OooOOo() {
        this(0);
    }

    public static C28480OooOOo OooO00o(String country, String phone, boolean z, EnumC28481OooOOo0 enumC28481OooOOo0, boolean z2, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(country, "country");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phone, "phone");
        return new C28480OooOOo(country, phone, z, enumC28481OooOOo0, z2, i);
    }

    public static /* synthetic */ C28480OooOOo OooO0O0(C28480OooOOo c28480OooOOo, String str, String str2, boolean z, EnumC28481OooOOo0 enumC28481OooOOo0, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = c28480OooOOo.f100910OooO00o;
        }
        if ((i2 & 2) != 0) {
            str2 = c28480OooOOo.f100911OooO0O0;
        }
        if ((i2 & 4) != 0) {
            z = c28480OooOOo.f100912OooO0OO;
        }
        if ((i2 & 8) != 0) {
            enumC28481OooOOo0 = c28480OooOOo.f100913OooO0Oo;
        }
        if ((i2 & 16) != 0) {
            z2 = c28480OooOOo.f100915OooO0o0;
        }
        if ((i2 & 32) != 0) {
            i = c28480OooOOo.f100914OooO0o;
        }
        int i3 = i;
        c28480OooOOo.getClass();
        boolean z3 = z2;
        EnumC28481OooOOo0 enumC28481OooOOo02 = enumC28481OooOOo0;
        boolean z4 = z;
        return OooO00o(str, str2, z4, enumC28481OooOOo02, z3, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28480OooOOo)) {
            return false;
        }
        C28480OooOOo c28480OooOOo = (C28480OooOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100910OooO00o, c28480OooOOo.f100910OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100911OooO0O0, c28480OooOOo.f100911OooO0O0) && this.f100912OooO0OO == c28480OooOOo.f100912OooO0OO && this.f100913OooO0Oo == c28480OooOOo.f100913OooO0Oo && this.f100915OooO0o0 == c28480OooOOo.f100915OooO0o0 && this.f100914OooO0o == c28480OooOOo.f100914OooO0o;
    }

    public final int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f100910OooO00o.hashCode() * 31, 31, this.f100911OooO0O0), 31, this.f100912OooO0OO);
        EnumC28481OooOOo0 enumC28481OooOOo0 = this.f100913OooO0Oo;
        return Integer.hashCode(this.f100914OooO0o) + o00000.OooO0O0((iOooO0O0 + (enumC28481OooOOo0 == null ? 0 : enumC28481OooOOo0.hashCode())) * 31, 31, this.f100915OooO0o0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationCodeRequestState(country=");
        sb.append(this.f100910OooO00o);
        sb.append(", phone=");
        sb.append(this.f100911OooO0O0);
        sb.append(", isSending=");
        sb.append(this.f100912OooO0OO);
        sb.append(", error=");
        sb.append(this.f100913OooO0Oo);
        sb.append(", isCountdownActive=");
        sb.append(this.f100915OooO0o0);
        sb.append(", secondsRemaining=");
        return C21023OooO0Oo.OooO0OO(")", this.f100914OooO0o, sb);
    }

    public /* synthetic */ C28480OooOOo(int i) {
        this("", "", false, null, false, 0);
    }

    public C28480OooOOo(String country, String phone, boolean z, EnumC28481OooOOo0 enumC28481OooOOo0, boolean z2, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(country, "country");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phone, "phone");
        this.f100910OooO00o = country;
        this.f100911OooO0O0 = phone;
        this.f100912OooO0OO = z;
        this.f100913OooO0Oo = enumC28481OooOOo0;
        this.f100915OooO0o0 = z2;
        this.f100914OooO0o = i;
    }
}
