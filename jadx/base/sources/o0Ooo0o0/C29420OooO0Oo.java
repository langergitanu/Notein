package o0Ooo0o0;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;

/* JADX INFO: renamed from: o0Ooo0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29420OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC29418OooO0O0 f104345OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f104346OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f104347OooO0OO;

    public C29420OooO0Oo(EnumC29418OooO0O0 enumC29418OooO0O0, int i, boolean z) {
        this.f104345OooO00o = enumC29418OooO0O0;
        this.f104346OooO0O0 = i;
        this.f104347OooO0OO = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29420OooO0Oo)) {
            return false;
        }
        C29420OooO0Oo c29420OooO0Oo = (C29420OooO0Oo) obj;
        return this.f104345OooO00o == c29420OooO0Oo.f104345OooO00o && this.f104346OooO0O0 == c29420OooO0Oo.f104346OooO0O0 && this.f104347OooO0OO == c29420OooO0Oo.f104347OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f104346OooO0O0, this.f104345OooO00o.hashCode() * 31, 31), 31, this.f104347OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagePaddingLayoutVO(layoutType=");
        sb.append(this.f104345OooO00o);
        sb.append(", previewIconResId=");
        sb.append(this.f104346OooO0O0);
        sb.append(", isSelected=");
        return OooOOO.OooO00o(sb, ", isEnabled=true)", this.f104347OooO0OO);
    }
}
