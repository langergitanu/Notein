package o0o0000o;

import OooOoO.C20509OooO0oo;
import Oooo0oO.C21023OooO0Oo;
import android.graphics.PointF;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o0000o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29728OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f105431OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PointF f105432OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f105433OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f105434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f105435OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f105436OooO0o0;

    public C29728OooO0Oo() {
        this(63);
    }

    public static C29728OooO0Oo OooO00o(C29728OooO0Oo c29728OooO0Oo, boolean z, PointF pointF, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            z = c29728OooO0Oo.f105431OooO00o;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            pointF = c29728OooO0Oo.f105432OooO0O0;
        }
        PointF center = pointF;
        if ((i & 4) != 0) {
            f = c29728OooO0Oo.f105433OooO0OO;
        }
        float f4 = f;
        if ((i & 8) != 0) {
            f2 = c29728OooO0Oo.f105434OooO0Oo;
        }
        float f5 = f2;
        if ((i & 16) != 0) {
            f3 = c29728OooO0Oo.f105436OooO0o0;
        }
        int i2 = c29728OooO0Oo.f105435OooO0o;
        c29728OooO0Oo.getClass();
        OooOOO0.OooO0oO(center, "center");
        return new C29728OooO0Oo(z2, center, f4, f5, f3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29728OooO0Oo)) {
            return false;
        }
        C29728OooO0Oo c29728OooO0Oo = (C29728OooO0Oo) obj;
        return this.f105431OooO00o == c29728OooO0Oo.f105431OooO00o && OooOOO0.OooO0O0(this.f105432OooO0O0, c29728OooO0Oo.f105432OooO0O0) && Float.compare(this.f105433OooO0OO, c29728OooO0Oo.f105433OooO0OO) == 0 && Float.compare(this.f105434OooO0Oo, c29728OooO0Oo.f105434OooO0Oo) == 0 && Float.compare(this.f105436OooO0o0, c29728OooO0Oo.f105436OooO0o0) == 0 && this.f105435OooO0o == c29728OooO0Oo.f105435OooO0o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105435OooO0o) + C20509OooO0oo.OooO0OO(this.f105436OooO0o0, C20509OooO0oo.OooO0OO(this.f105434OooO0Oo, C20509OooO0oo.OooO0OO(this.f105433OooO0OO, (this.f105432OooO0O0.hashCode() + (Boolean.hashCode(this.f105431OooO00o) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RulerState(visible=");
        sb.append(this.f105431OooO00o);
        sb.append(", center=");
        sb.append(this.f105432OooO0O0);
        sb.append(", length=");
        sb.append(this.f105433OooO0OO);
        sb.append(", angleRad=");
        sb.append(this.f105434OooO0Oo);
        sb.append(", tickSpacingPx=");
        sb.append(this.f105436OooO0o0);
        sb.append(", majorTickInterval=");
        return C21023OooO0Oo.OooO0OO(")", this.f105435OooO0o, sb);
    }

    public C29728OooO0Oo(boolean z, PointF pointF, float f, float f2, float f3, int i) {
        this.f105431OooO00o = z;
        this.f105432OooO0O0 = pointF;
        this.f105433OooO0OO = f;
        this.f105434OooO0Oo = f2;
        this.f105436OooO0o0 = f3;
        this.f105435OooO0o = i;
    }

    public /* synthetic */ C29728OooO0Oo(int i) {
        this(false, new PointF(), 600.0f, 0.0f, 40.0f, 5);
    }
}
