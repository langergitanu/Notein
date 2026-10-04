package o0oOoOo;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: o0oOoOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31034OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110799OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110800OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110801OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f110802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f110803OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Long f110804OooO0o0;

    public C31034OooO0o(String id, int i, String productCode, int i2, Long l, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(productCode, "productCode");
        this.f110799OooO00o = id;
        this.f110800OooO0O0 = i;
        this.f110801OooO0OO = productCode;
        this.f110802OooO0Oo = i2;
        this.f110804OooO0o0 = l;
        this.f110803OooO0o = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31034OooO0o)) {
            return false;
        }
        C31034OooO0o c31034OooO0o = (C31034OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110799OooO00o, c31034OooO0o.f110799OooO00o) && this.f110800OooO0O0 == c31034OooO0o.f110800OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110801OooO0OO, c31034OooO0o.f110801OooO0OO) && this.f110802OooO0Oo == c31034OooO0o.f110802OooO0Oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110804OooO0o0, c31034OooO0o.f110804OooO0o0) && this.f110803OooO0o == c31034OooO0o.f110803OooO0o;
    }

    public final int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.f110802OooO0Oo, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.f110800OooO0O0, this.f110799OooO00o.hashCode() * 31, 31), 31, this.f110801OooO0OO), 31);
        Long l = this.f110804OooO0o0;
        return Boolean.hashCode(false) + C20703o000000o.OooO0O0((iOooO00o + (l == null ? 0 : l.hashCode())) * 31, 31, this.f110803OooO0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponVO(id=");
        sb.append(this.f110799OooO00o);
        sb.append(", type=");
        sb.append(this.f110800OooO0O0);
        sb.append(", productCode=");
        sb.append(this.f110801OooO0OO);
        sb.append(", value=");
        sb.append(this.f110802OooO0Oo);
        sb.append(", effectAt=");
        sb.append(this.f110804OooO0o0);
        sb.append(", expireAt=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f110803OooO0o, ", isSelected=false)", sb);
    }
}
