package o0Ooo0o0;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;

/* JADX INFO: renamed from: o0Ooo0o0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29421OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC29419OooO0OO f104348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f104349OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f104350OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f104351OooO0Oo;

    public C29421OooO0o0(EnumC29419OooO0OO enumC29419OooO0OO, int i, boolean z, boolean z2) {
        this.f104348OooO00o = enumC29419OooO0OO;
        this.f104349OooO0O0 = i;
        this.f104350OooO0OO = z;
        this.f104351OooO0Oo = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29421OooO0o0)) {
            return false;
        }
        C29421OooO0o0 c29421OooO0o0 = (C29421OooO0o0) obj;
        return this.f104348OooO00o == c29421OooO0o0.f104348OooO00o && this.f104349OooO0O0 == c29421OooO0o0.f104349OooO0O0 && this.f104350OooO0OO == c29421OooO0o0.f104350OooO0OO && this.f104351OooO0Oo == c29421OooO0o0.f104351OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104351OooO0Oo) + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f104349OooO0O0, this.f104348OooO00o.hashCode() * 31, 31), 31, this.f104350OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagePaddingPatternVO(patternType=");
        sb.append(this.f104348OooO00o);
        sb.append(", previewIconResId=");
        sb.append(this.f104349OooO0O0);
        sb.append(", isSelected=");
        sb.append(this.f104350OooO0OO);
        sb.append(", isEnabled=");
        return OooOOO.OooO00o(sb, ")", this.f104351OooO0Oo);
    }
}
