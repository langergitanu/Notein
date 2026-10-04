package o0OoO0Oo;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import androidx.appcompat.app.OooOOO;

/* JADX INFO: renamed from: o0OoO0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28629OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f101486OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f101488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f101489OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f101490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f101491OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f101492OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f101493OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f101494OooO0oo;

    public C28629OooO0O0(String id, float f, float f2, long j, boolean z, String topBannerMsg, String bottomBannerMsg, String description, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(topBannerMsg, "topBannerMsg");
        kotlin.jvm.internal.OooOOO0.OooO0oO(bottomBannerMsg, "bottomBannerMsg");
        kotlin.jvm.internal.OooOOO0.OooO0oO(description, "description");
        this.f101487OooO00o = id;
        this.f101488OooO0O0 = f;
        this.f101489OooO0OO = f2;
        this.f101490OooO0Oo = j;
        this.f101492OooO0o0 = z;
        this.f101491OooO0o = topBannerMsg;
        this.f101493OooO0oO = bottomBannerMsg;
        this.f101494OooO0oo = description;
        this.f101486OooO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28629OooO0O0)) {
            return false;
        }
        C28629OooO0O0 c28629OooO0O0 = (C28629OooO0O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101487OooO00o, c28629OooO0O0.f101487OooO00o) && Float.compare(this.f101488OooO0O0, c28629OooO0O0.f101488OooO0O0) == 0 && Float.compare(this.f101489OooO0OO, c28629OooO0O0.f101489OooO0OO) == 0 && this.f101490OooO0Oo == c28629OooO0O0.f101490OooO0Oo && this.f101492OooO0o0 == c28629OooO0O0.f101492OooO0o0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101491OooO0o, c28629OooO0O0.f101491OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101493OooO0oO, c28629OooO0O0.f101493OooO0oO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101494OooO0oo, c28629OooO0O0.f101494OooO0oo) && this.f101486OooO == c28629OooO0O0.f101486OooO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101486OooO) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(o00000.OooO0O0(C20703o000000o.OooO0O0(C20509OooO0oo.OooO0OO(this.f101489OooO0OO, C20509OooO0oo.OooO0OO(this.f101488OooO0O0, this.f101487OooO00o.hashCode() * 31, 31), 31), 31, this.f101490OooO0Oo), 31, this.f101492OooO0o0), 31, this.f101491OooO0o), 31, this.f101493OooO0oO), 31, this.f101494OooO0oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommodityVO(id=");
        sb.append(this.f101487OooO00o);
        sb.append(", price=");
        sb.append(this.f101488OooO0O0);
        sb.append(", originPrice=");
        sb.append(this.f101489OooO0OO);
        sb.append(", duration=");
        sb.append(this.f101490OooO0Oo);
        sb.append(", isFreeTrial=");
        sb.append(this.f101492OooO0o0);
        sb.append(", topBannerMsg=");
        sb.append(this.f101491OooO0o);
        sb.append(", bottomBannerMsg=");
        sb.append(this.f101493OooO0oO);
        sb.append(", description=");
        sb.append(this.f101494OooO0oo);
        sb.append(", isSelected=");
        return OooOOO.OooO00o(sb, ")", this.f101486OooO);
    }
}
