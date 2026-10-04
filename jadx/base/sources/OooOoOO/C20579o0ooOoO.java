package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;

/* JADX INFO: renamed from: OooOoOO.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20579o0ooOoO<V extends AbstractC20531OooOOo> implements InterfaceC20575o00o0O<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f58822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f58823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC20539OooOoO0 f58824OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo000o<V> f58825OooO0Oo;

    public C20579o0ooOoO(int i, int i2, InterfaceC20539OooOoO0 easing) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(easing, "easing");
        this.f58822OooO00o = i;
        this.f58823OooO0O0 = i2;
        this.f58824OooO0OO = easing;
        this.f58825OooO0Oo = new oo000o<>(new C20543OooOooO(i, i2, easing));
    }

    @Override // OooOoOO.InterfaceC20575o00o0O
    public final int OooO0OO() {
        return this.f58822OooO00o;
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0Oo(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        return (V) this.f58825OooO0Oo.OooO0Oo(j, initialValue, targetValue, initialVelocity);
    }

    @Override // OooOoOO.InterfaceC20575o00o0O
    public final int OooO0o() {
        return this.f58823OooO0O0;
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0o0(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        return (V) this.f58825OooO0Oo.OooO0o0(j, initialValue, targetValue, initialVelocity);
    }
}
