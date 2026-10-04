package o0Ooo0Oo;

import OooOoO.C20509OooO0oo;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;

/* JADX INFO: renamed from: o0Ooo0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29410OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f104291OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f104292OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f104293OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f104294OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f104295OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f104296OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f104297OooO0oO;

    public C29410OooO0oO(int i, float f, float f2, int i2, int i3, boolean z, boolean z2) {
        this.f104291OooO00o = i;
        this.f104292OooO0O0 = f;
        this.f104293OooO0OO = f2;
        this.f104294OooO0Oo = i2;
        this.f104296OooO0o0 = i3;
        this.f104295OooO0o = z;
        this.f104297OooO0oO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29410OooO0oO)) {
            return false;
        }
        C29410OooO0oO c29410OooO0oO = (C29410OooO0oO) obj;
        return this.f104291OooO00o == c29410OooO0oO.f104291OooO00o && Float.compare(this.f104292OooO0O0, c29410OooO0oO.f104292OooO0O0) == 0 && Float.compare(this.f104293OooO0OO, c29410OooO0oO.f104293OooO0OO) == 0 && this.f104294OooO0Oo == c29410OooO0oO.f104294OooO0Oo && this.f104296OooO0o0 == c29410OooO0oO.f104296OooO0o0 && this.f104295OooO0o == c29410OooO0oO.f104295OooO0o && this.f104297OooO0oO == c29410OooO0oO.f104297OooO0oO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104297OooO0oO) + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f104296OooO0o0, C20785Oooo00o.OooO00o(this.f104294OooO0Oo, C20509OooO0oo.OooO0OO(this.f104293OooO0OO, C20509OooO0oo.OooO0OO(this.f104292OooO0O0, Integer.hashCode(this.f104291OooO00o) * 31, 31), 31), 31), 31), 31, this.f104295OooO0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaperSpecVO(nameResId=");
        sb.append(this.f104291OooO00o);
        sb.append(", preciseWidth=");
        sb.append(this.f104292OooO0O0);
        sb.append(", preciseHeight=");
        sb.append(this.f104293OooO0OO);
        sb.append(", width=");
        sb.append(this.f104294OooO0Oo);
        sb.append(", height=");
        sb.append(this.f104296OooO0o0);
        sb.append(", isSelected=");
        sb.append(this.f104295OooO0o);
        sb.append(", isDisable=");
        return OooOOO.OooO00o(sb, ")", this.f104297OooO0oO);
    }
}
