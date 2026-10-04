package o0O0o0o;

import OooOoO.C20509OooO0oo;
import Oooo00o.OooO0OO;

/* JADX INFO: renamed from: o0O0o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26011OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f88829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f88830OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f88831OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f88832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f88833OooO0o0;

    public C26011OooO00o(float f, float f2, float f3, float f4, float f5) {
        this.f88829OooO00o = f;
        this.f88830OooO0O0 = f2;
        this.f88831OooO0OO = f3;
        this.f88832OooO0Oo = f4;
        this.f88833OooO0o0 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26011OooO00o)) {
            return false;
        }
        C26011OooO00o c26011OooO00o = (C26011OooO00o) obj;
        return Float.compare(this.f88829OooO00o, c26011OooO00o.f88829OooO00o) == 0 && Float.compare(this.f88830OooO0O0, c26011OooO00o.f88830OooO0O0) == 0 && Float.compare(this.f88831OooO0OO, c26011OooO00o.f88831OooO0OO) == 0 && Float.compare(this.f88832OooO0Oo, c26011OooO00o.f88832OooO0Oo) == 0 && Float.compare(this.f88833OooO0o0, c26011OooO00o.f88833OooO0o0) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f88833OooO0o0) + C20509OooO0oo.OooO0OO(this.f88832OooO0Oo, C20509OooO0oo.OooO0OO(this.f88831OooO0OO, C20509OooO0oo.OooO0OO(this.f88830OooO0O0, Float.hashCode(this.f88829OooO00o) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RulerConstraintState(centerX=");
        sb.append(this.f88829OooO00o);
        sb.append(", centerY=");
        sb.append(this.f88830OooO0O0);
        sb.append(", length=");
        sb.append(this.f88831OooO0OO);
        sb.append(", width=");
        sb.append(this.f88832OooO0Oo);
        sb.append(", angleRad=");
        return OooO0OO.OooO0OO(sb, this.f88833OooO0o0, ")");
    }
}
