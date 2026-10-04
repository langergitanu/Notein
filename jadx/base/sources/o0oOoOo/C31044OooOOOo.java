package o0oOoOo;

import OooOoo0.o00000;
import android.net.Uri;

/* JADX INFO: renamed from: o0oOoOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31044OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f110841OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110842OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110843OooO0OO;

    public C31044OooOOOo(Uri uri, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
        this.f110841OooO00o = uri;
        this.f110842OooO0O0 = z;
        this.f110843OooO0OO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31044OooOOOo)) {
            return false;
        }
        C31044OooOOOo c31044OooOOOo = (C31044OooOOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110841OooO00o, c31044OooOOOo.f110841OooO00o) && this.f110842OooO0O0 == c31044OooOOOo.f110842OooO0O0 && this.f110843OooO0OO == c31044OooOOOo.f110843OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110843OooO0OO) + o00000.OooO0O0(this.f110841OooO00o.hashCode() * 31, 31, this.f110842OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVO(uri=");
        sb.append(this.f110841OooO00o);
        sb.append(", isSelected=");
        sb.append(this.f110842OooO0O0);
        sb.append(", isMultiSelectMode=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110843OooO0OO);
    }
}
