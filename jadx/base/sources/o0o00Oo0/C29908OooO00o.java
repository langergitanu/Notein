package o0o00Oo0;

import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;

/* JADX INFO: renamed from: o0o00Oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29908OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f106114OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106115OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f106116OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f106117OooO0Oo;

    public C29908OooO00o(int i, int i2, int i3, boolean z) {
        this.f106114OooO00o = i;
        this.f106115OooO0O0 = i2;
        this.f106116OooO0OO = i3;
        this.f106117OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29908OooO00o)) {
            return false;
        }
        C29908OooO00o c29908OooO00o = (C29908OooO00o) obj;
        return this.f106114OooO00o == c29908OooO00o.f106114OooO00o && this.f106115OooO0O0 == c29908OooO00o.f106115OooO0O0 && this.f106116OooO0OO == c29908OooO00o.f106116OooO0OO && this.f106117OooO0Oo == c29908OooO00o.f106117OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106117OooO0Oo) + C20785Oooo00o.OooO00o(this.f106116OooO0OO, C20785Oooo00o.OooO00o(this.f106115OooO0O0, Integer.hashCode(this.f106114OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarItemVO(type=");
        sb.append(this.f106114OooO00o);
        sb.append(", iconRes=");
        sb.append(this.f106115OooO0O0);
        sb.append(", toolTipsRes=");
        sb.append(this.f106116OooO0OO);
        sb.append(", isActivated=");
        return OooOOO.OooO00o(sb, ")", this.f106117OooO0Oo);
    }
}
