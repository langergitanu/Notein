package o0Ooo0o0;

import OooOoO.C20509OooO0oo;
import OooOoo0.o00000;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0Ooo0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29417OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final C29417OooO00o f104321OooOO0 = new C29417OooO00o(595.0f, 842.0f, null, null, false, null, null, null, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Float f104322OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f104323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f104324OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Float f104325OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Float f104326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Float f104327OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f104328OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Float f104329OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Float f104330OooO0oo;

    public C29417OooO00o(float f, float f2, Float f3, Float f4, boolean z, Float f5, Float f6, Float f7, Float f8) {
        this.f104323OooO00o = f;
        this.f104324OooO0O0 = f2;
        this.f104325OooO0OO = f3;
        this.f104326OooO0Oo = f4;
        this.f104328OooO0o0 = z;
        this.f104327OooO0o = f5;
        this.f104329OooO0oO = f6;
        this.f104330OooO0oo = f7;
        this.f104322OooO = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29417OooO00o)) {
            return false;
        }
        C29417OooO00o c29417OooO00o = (C29417OooO00o) obj;
        return Float.compare(this.f104323OooO00o, c29417OooO00o.f104323OooO00o) == 0 && Float.compare(this.f104324OooO0O0, c29417OooO00o.f104324OooO0O0) == 0 && OooOOO0.OooO0O0(this.f104325OooO0OO, c29417OooO00o.f104325OooO0OO) && OooOOO0.OooO0O0(this.f104326OooO0Oo, c29417OooO00o.f104326OooO0Oo) && this.f104328OooO0o0 == c29417OooO00o.f104328OooO0o0 && OooOOO0.OooO0O0(this.f104327OooO0o, c29417OooO00o.f104327OooO0o) && OooOOO0.OooO0O0(this.f104329OooO0oO, c29417OooO00o.f104329OooO0oO) && OooOOO0.OooO0O0(this.f104330OooO0oo, c29417OooO00o.f104330OooO0oo) && OooOOO0.OooO0O0(this.f104322OooO, c29417OooO00o.f104322OooO);
    }

    public final int hashCode() {
        int iOooO0OO = C20509OooO0oo.OooO0OO(this.f104324OooO0O0, Float.hashCode(this.f104323OooO00o) * 31, 31);
        Float f = this.f104325OooO0OO;
        int iHashCode = (iOooO0OO + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f104326OooO0Oo;
        int iOooO0O0 = o00000.OooO0O0((iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31, 31, this.f104328OooO0o0);
        Float f3 = this.f104327OooO0o;
        int iHashCode2 = (iOooO0O0 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.f104329OooO0oO;
        int iHashCode3 = (iHashCode2 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.f104330OooO0oo;
        int iHashCode4 = (iHashCode3 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.f104322OooO;
        return iHashCode4 + (f6 != null ? f6.hashCode() : 0);
    }

    public final String toString() {
        return "HollowPaperStyleParams(paperWidth=" + this.f104323OooO00o + ", paperHeight=" + this.f104324OooO0O0 + ", foregroundAlpha=" + this.f104325OooO0OO + ", requiredItemSpace=" + this.f104326OooO0Oo + ", horizontalFlip=" + this.f104328OooO0o0 + ", leftPadding=" + this.f104327OooO0o + ", topPadding=" + this.f104329OooO0oO + ", rightPadding=" + this.f104330OooO0oo + ", bottomPadding=" + this.f104322OooO + ")";
    }
}
