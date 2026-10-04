package OooOoOO;

import OooOoO.C20506OooO0Oo;
import OooOoO.C20510OooOO0o;
import OooOoO.OooO;
import OooOoOO.AbstractC20531OooOOo;

/* JADX INFO: renamed from: OooOoOO.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20576o00oO0o<V extends AbstractC20531OooOOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C20510OooOO0o f58809OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public V f58810OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public V f58811OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public V f58812OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f58813OooO0o0 = 0.0f;

    public C20576o00oO0o(C20510OooOO0o c20510OooOO0o) {
        this.f58809OooO00o = c20510OooOO0o;
    }

    public final float OooO00o() {
        return this.f58813OooO0o0;
    }

    public final V OooO0O0(long j, V initialValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        if (this.f58811OooO0OO == null) {
            this.f58811OooO0OO = (V) initialValue.OooO0OO();
        }
        V v = this.f58811OooO0OO;
        if (v == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
            throw null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f58811OooO0OO;
            if (v2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
                throw null;
            }
            long j2 = j / 1000000;
            OooO.OooO00o OooO00o2 = this.f58809OooO00o.f58578OooO00o.OooO00o(initialVelocity.OooO00o(i));
            long j3 = OooO00o2.f58566OooO0OO;
            v2.OooO0o0(i, (((Math.signum(OooO00o2.f58564OooO00o) * C20506OooO0Oo.OooO00o(j3 > 0 ? j2 / j3 : 1.0f).f58569OooO0O0) * OooO00o2.f58565OooO0O0) / j3) * 1000.0f);
        }
        V v3 = this.f58811OooO0OO;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
        throw null;
    }
}
