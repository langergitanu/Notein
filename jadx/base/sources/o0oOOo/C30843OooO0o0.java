package o0oOOo;

import java.util.Arrays;

/* JADX INFO: renamed from: o0oOOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C30843OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f110232OooO00o = OooO00o.f110239OooOo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f110233OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float[] f110234OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f110235OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f110237OooO0o0 = 0.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f110236OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f110238OooO0oO = 0.0f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0oOOo.OooO0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f110239OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f110240OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f110241OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("OVERLAY_COLOR", 0);
            f110240OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("BITMAP_ONLY", 1);
            f110239OooOo = oooO00o2;
            f110241OooOoO0 = new OooO00o[]{oooO00o, oooO00o2};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f110241OooOoO0.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30843OooO0o0.class != obj.getClass()) {
            return false;
        }
        C30843OooO0o0 c30843OooO0o0 = (C30843OooO0o0) obj;
        if (this.f110233OooO0O0 == c30843OooO0o0.f110233OooO0O0 && this.f110235OooO0Oo == c30843OooO0o0.f110235OooO0Oo && Float.compare(c30843OooO0o0.f110237OooO0o0, this.f110237OooO0o0) == 0 && this.f110236OooO0o == c30843OooO0o0.f110236OooO0o && Float.compare(c30843OooO0o0.f110238OooO0oO, this.f110238OooO0oO) == 0 && this.f110232OooO00o == c30843OooO0o0.f110232OooO00o) {
            return Arrays.equals(this.f110234OooO0OO, c30843OooO0o0.f110234OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        OooO00o oooO00o = this.f110232OooO00o;
        int iHashCode = (((oooO00o != null ? oooO00o.hashCode() : 0) * 31) + (this.f110233OooO0O0 ? 1 : 0)) * 31;
        float[] fArr = this.f110234OooO0OO;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f110235OooO0Oo) * 31;
        float f = this.f110237OooO0o0;
        int iFloatToIntBits = (((iHashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f110236OooO0o) * 31;
        float f2 = this.f110238OooO0oO;
        return (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 961;
    }
}
