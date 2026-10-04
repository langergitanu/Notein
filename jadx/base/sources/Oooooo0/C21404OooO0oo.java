package Oooooo0;

import OooOOO0.AbstractC20449OooO0Oo;
import OooOoO.C20509OooO0oo;
import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: Oooooo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21404OooO0oo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f61924OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f61925OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f61926OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f61927OooOoO0;

    public C21404OooO0oo(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f61925OooOo0o = f;
        this.f61924OooOo = f2;
        this.f61927OooOoO0 = i;
        this.f61926OooOoO = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21404OooO0oo)) {
            return false;
        }
        C21404OooO0oo c21404OooO0oo = (C21404OooO0oo) obj;
        return this.f61925OooOo0o == c21404OooO0oo.f61925OooOo0o && this.f61924OooOo == c21404OooO0oo.f61924OooOo && this.f61927OooOoO0 == c21404OooO0oo.f61927OooOoO0 && this.f61926OooOoO == c21404OooO0oo.f61926OooOoO;
    }

    public final int hashCode() {
        return C20785Oooo00o.OooO00o(this.f61926OooOoO, C20785Oooo00o.OooO00o(this.f61927OooOoO0, C20509OooO0oo.OooO0OO(this.f61924OooOo, Float.hashCode(this.f61925OooOo0o) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f61925OooOo0o);
        sb.append(", miter=");
        sb.append(this.f61924OooOo);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f61927OooOoO0;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.f61926OooOoO;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
