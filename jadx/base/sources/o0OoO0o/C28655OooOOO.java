package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0o0.C21009OooOooO;
import androidx.ink.brush.behavior.NoiseNodeNative;
import o0OoO0o.C28660OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0o.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28655OooOOO extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C28660OooOOo0 f101552OooO0o0;

    public C28655OooOOO() {
        throw null;
    }

    public C28655OooOOO(o000OO00.OooO0o oooO0o) {
        super(oooO0o, C34434OooOoO.f123453OooOo0o);
        C20481OooOOoo<C28660OooOOo0> c20481OooOOoo = C28660OooOOo0.f101570OooO0OO;
        this.f101552OooO0o0 = C28660OooOOo0.OooO00o.OooO00o(NoiseNodeNative.f65364OooO00o.getVaryOverInt(OooO00o()));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28655OooOOO)) {
            return false;
        }
        NoiseNodeNative noiseNodeNative = NoiseNodeNative.f65364OooO00o;
        C28655OooOOO c28655OooOOO = (C28655OooOOO) obj;
        return noiseNodeNative.getSeed(OooO00o()) == noiseNodeNative.getSeed(c28655OooOOO.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101552OooO0o0, c28655OooOOO.f101552OooO0o0) && noiseNodeNative.getBasePeriod(OooO00o()) == noiseNodeNative.getBasePeriod(c28655OooOOO.OooO00o());
    }

    public final int hashCode() {
        NoiseNodeNative noiseNodeNative = NoiseNodeNative.f65364OooO00o;
        return Float.hashCode(noiseNodeNative.getBasePeriod(OooO00o())) + ((this.f101552OooO0o0.hashCode() + (Integer.hashCode(noiseNodeNative.getSeed(OooO00o())) * 31)) * 31);
    }

    public final String toString() {
        NoiseNodeNative noiseNodeNative = NoiseNodeNative.f65364OooO00o;
        int seed = noiseNodeNative.getSeed(OooO00o());
        String str = this.f101552OooO0o0.f101573OooO0O0;
        return Oooo00o.OooO0OO.OooO0OO(C21009OooOooO.OooO0OO(seed, "NoiseNode(", ", ", str, ", "), noiseNodeNative.getBasePeriod(OooO00o()), ")");
    }
}
