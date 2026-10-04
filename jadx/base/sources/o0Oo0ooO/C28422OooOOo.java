package o0Oo0ooO;

import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: o0Oo0ooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28422OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f100769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f100770OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f100771OooO0OO;

    public C28422OooOOo(int i, int i2, boolean z) {
        this.f100769OooO00o = i;
        this.f100770OooO0O0 = i2;
        this.f100771OooO0OO = z;
    }

    public static C28422OooOOo OooO00o(C28422OooOOo c28422OooOOo, boolean z, int i) {
        int i2 = c28422OooOOo.f100769OooO00o;
        int i3 = c28422OooOOo.f100770OooO0O0;
        if ((i & 4) != 0) {
            z = c28422OooOOo.f100771OooO0OO;
        }
        c28422OooOOo.getClass();
        return new C28422OooOOo(i2, i3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28422OooOOo)) {
            return false;
        }
        C28422OooOOo c28422OooOOo = (C28422OooOOo) obj;
        return this.f100769OooO00o == c28422OooOOo.f100769OooO00o && this.f100770OooO0O0 == c28422OooOOo.f100770OooO0O0 && this.f100771OooO0OO == c28422OooOOo.f100771OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100771OooO0OO) + C20785Oooo00o.OooO00o(this.f100770OooO0O0, Integer.hashCode(this.f100769OooO00o) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelColorVO(colorValue=");
        sb.append(this.f100769OooO00o);
        sb.append(", nameResId=");
        sb.append(this.f100770OooO0O0);
        sb.append(", isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f100771OooO0OO);
    }
}
