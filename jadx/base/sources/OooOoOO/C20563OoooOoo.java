package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;
import o00ooO0.C25751OooOoo;

/* JADX INFO: renamed from: OooOoOO.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20563OoooOoo<T, V extends AbstractC20531OooOOo> implements InterfaceC20523OooO0oo<T, V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final V f58745OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O<V> f58746OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC20574Ooooooo<T, V> f58747OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final T f58748OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final T f58749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final V f58750OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final V f58751OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final V f58752OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f58753OooO0oo;

    public C20563OoooOoo() {
        throw null;
    }

    public C20563OoooOoo(InterfaceC20526OooOO0o<T> animationSpec, InterfaceC20574Ooooooo<T, V> typeConverter, T t, T t2, V v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(animationSpec, "animationSpec");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeConverter, "typeConverter");
        o00O0O<V> animationSpec2 = animationSpec.OooO00o(typeConverter);
        kotlin.jvm.internal.OooOOO0.OooO0oO(animationSpec2, "animationSpec");
        this.f58746OooO00o = animationSpec2;
        this.f58747OooO0O0 = typeConverter;
        this.f58748OooO0OO = t;
        this.f58749OooO0Oo = t2;
        V vInvoke = typeConverter.OooO00o().invoke(t);
        this.f58751OooO0o0 = vInvoke;
        V vInvoke2 = typeConverter.OooO00o().invoke(t2);
        this.f58750OooO0o = vInvoke2;
        V v2 = v != null ? (V) C25751OooOoo.OooO00o(v) : (V) C25751OooOoo.OooO0OO(typeConverter.OooO00o().invoke(t));
        this.f58752OooO0oO = v2;
        this.f58753OooO0oo = animationSpec2.OooO0O0(vInvoke, vInvoke2, v2);
        this.f58745OooO = (V) animationSpec2.OooO0oO(vInvoke, vInvoke2, v2);
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final boolean OooO00o() {
        return this.f58746OooO00o.OooO00o();
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final long OooO0OO() {
        return this.f58753OooO0oo;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final InterfaceC20574Ooooooo<T, V> OooO0Oo() {
        return this.f58747OooO0O0;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final T OooO0o() {
        return this.f58749OooO0Oo;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final T OooO0o0(long j) {
        if (OooO0O0(j)) {
            return this.f58749OooO0Oo;
        }
        AbstractC20531OooOOo abstractC20531OooOOoOooO0o0 = this.f58746OooO00o.OooO0o0(j, this.f58751OooO0o0, this.f58750OooO0o, this.f58752OooO0oO);
        int iOooO0O0 = abstractC20531OooOOoOooO0o0.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            if (Float.isNaN(abstractC20531OooOOoOooO0o0.OooO00o(i))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + abstractC20531OooOOoOooO0o0 + ". Animation: " + this + ", playTimeNanos: " + j).toString());
            }
        }
        return (T) this.f58747OooO0O0.OooO0O0().invoke(abstractC20531OooOOoOooO0o0);
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final V OooO0oO(long j) {
        return !OooO0O0(j) ? (V) this.f58746OooO00o.OooO0Oo(j, this.f58751OooO0o0, this.f58750OooO0o, this.f58752OooO0oO) : this.f58745OooO;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f58748OooO0OO + " -> " + this.f58749OooO0Oo + ",initial velocity: " + this.f58752OooO0oO + ", duration: " + (this.f58753OooO0oo / 1000000) + " ms,animationSpec: " + this.f58746OooO00o;
    }
}
