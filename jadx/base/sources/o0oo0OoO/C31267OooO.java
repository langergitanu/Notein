package o0oo0OoO;

import com.orion.penkit.models.DrawResult;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oo0OoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31267OooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C31267OooO f111642OooO0OO = new C31267OooO(true, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C31267OooO f111643OooO0Oo = new C31267OooO(false, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f111644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DrawResult f111645OooO0O0;

    public C31267OooO(boolean z, DrawResult drawResult) {
        this.f111644OooO00o = z;
        this.f111645OooO0O0 = drawResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31267OooO)) {
            return false;
        }
        C31267OooO c31267OooO = (C31267OooO) obj;
        return this.f111644OooO00o == c31267OooO.f111644OooO00o && OooOOO0.OooO0O0(this.f111645OooO0O0, c31267OooO.f111645OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f111644OooO00o) * 31;
        DrawResult drawResult = this.f111645OooO0O0;
        return iHashCode + (drawResult == null ? 0 : drawResult.hashCode());
    }

    public final String toString() {
        return "InkProgressResult(handled=" + this.f111644OooO00o + ", drawResult=" + this.f111645OooO0O0 + ")";
    }
}
