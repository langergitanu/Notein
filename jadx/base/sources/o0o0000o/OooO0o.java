package o0o0000o;

import OooOoO.C20509OooO0oo;
import android.graphics.PointF;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f105437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f105438OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f105439OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f105440OooO0Oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooO0o() {
        float f = 0.0f;
        this(f, f, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return Float.compare(this.f105437OooO00o, oooO0o.f105437OooO00o) == 0 && Float.compare(this.f105438OooO0O0, oooO0o.f105438OooO0O0) == 0 && Float.compare(this.f105439OooO0OO, oooO0o.f105439OooO0OO) == 0 && OooOOO0.OooO0O0(this.f105440OooO0Oo, oooO0o.f105440OooO0Oo);
    }

    public final int hashCode() {
        int iOooO0OO = C20509OooO0oo.OooO0OO(this.f105439OooO0OO, C20509OooO0oo.OooO0OO(this.f105438OooO0O0, Float.hashCode(this.f105437OooO00o) * 31, 31), 31);
        PointF pointF = this.f105440OooO0Oo;
        return iOooO0OO + (pointF == null ? 0 : pointF.hashCode());
    }

    public final String toString() {
        return "RulerTransformDelta(dx=" + this.f105437OooO00o + ", dy=" + this.f105438OooO0O0 + ", dAngleRad=" + this.f105439OooO0OO + ", gestureMidpoint=" + this.f105440OooO0Oo + ")";
    }

    public OooO0o(float f, float f2, float f3, PointF pointF) {
        this.f105437OooO00o = f;
        this.f105438OooO0O0 = f2;
        this.f105439OooO0OO = f3;
        this.f105440OooO0Oo = pointF;
    }

    public /* synthetic */ OooO0o(float f, float f2, int i) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, 0.0f, null);
    }
}
