package o0oOoOo;

import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31089Ooooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110963OooO0O0;

    public C31089Ooooooo(int i, boolean z) {
        this.f110962OooO00o = i;
        this.f110963OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31089Ooooooo)) {
            return false;
        }
        C31089Ooooooo c31089Ooooooo = (C31089Ooooooo) obj;
        return this.f110962OooO00o == c31089Ooooooo.f110962OooO00o && this.f110963OooO0O0 == c31089Ooooooo.f110963OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110963OooO0O0) + o00000.OooO0O0(Integer.hashCode(this.f110962OooO00o) * 31, 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyleVO(style=");
        sb.append(this.f110962OooO00o);
        sb.append(", enable=true, isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110963OooO0O0);
    }
}
