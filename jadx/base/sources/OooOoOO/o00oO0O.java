package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;
import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0O<V extends AbstractC20531OooOOo> implements o00O0O<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC20575o00o0O<V> f58805OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EnumC20551Oooo0o0 f58806OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f58807OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f58808OooO0Oo;

    public o00oO0O(InterfaceC20575o00o0O interfaceC20575o00o0O, EnumC20551Oooo0o0 enumC20551Oooo0o0, long j) {
        this.f58805OooO00o = interfaceC20575o00o0O;
        this.f58806OooO0O0 = enumC20551Oooo0o0;
        this.f58807OooO0OO = ((long) (interfaceC20575o00o0O.OooO0OO() + interfaceC20575o00o0O.OooO0o())) * 1000000;
        this.f58808OooO0Oo = j * 1000000;
    }

    @Override // OooOoOO.o00O0O
    public final boolean OooO00o() {
        return true;
    }

    @Override // OooOoOO.o00O0O
    public final long OooO0O0(V initialValue, V targetValue, V v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0Oo(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        long jOooO0oo = OooO0oo(j);
        long j2 = this.f58808OooO0Oo;
        long j3 = j + j2;
        long j4 = this.f58807OooO0OO;
        return this.f58805OooO00o.OooO0Oo(jOooO0oo, initialValue, targetValue, j3 > j4 ? OooO0Oo(j4 - j2, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0o0(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        long jOooO0oo = OooO0oo(j);
        long j2 = this.f58808OooO0Oo;
        long j3 = j + j2;
        long j4 = this.f58807OooO0OO;
        return this.f58805OooO00o.OooO0o0(jOooO0oo, initialValue, targetValue, j3 > j4 ? OooO0Oo(j4 - j2, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    public final long OooO0oo(long j) {
        long j2 = this.f58808OooO0Oo;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f58807OooO0OO;
        long j5 = j3 / j4;
        return (this.f58806OooO0O0 == EnumC20551Oooo0o0.f58708OooOo0o || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }
}
