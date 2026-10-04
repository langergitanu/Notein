package OooOoOO;

import OooOoO.C20506OooO0Oo;
import OooOoO.C20510OooOO0o;
import OooOoO.OooO;
import OooOoOO.AbstractC20531OooOOo;
import o00ooO0.C25751OooOoo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20536OooOo0O<T, V extends AbstractC20531OooOOo> implements InterfaceC20523OooO0oo<T, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C20576o00oO0o f58657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC20574Ooooooo<T, V> f58658OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final T f58659OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final V f58660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final V f58661OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final V f58662OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final T f58663OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f58664OooO0oo;

    public C20536OooOo0O(InterfaceC20537OooOo0o<T> animationSpec, InterfaceC20574Ooooooo<T, V> typeConverter, T t, V initialVelocityVector) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(animationSpec, "animationSpec");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeConverter, "typeConverter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocityVector, "initialVelocityVector");
        C20576o00oO0o c20576o00oO0oOooO00o = animationSpec.OooO00o(typeConverter);
        this.f58657OooO00o = c20576o00oO0oOooO00o;
        this.f58658OooO0O0 = typeConverter;
        this.f58659OooO0OO = t;
        V initialValue = typeConverter.OooO00o().invoke(t);
        this.f58660OooO0Oo = initialValue;
        this.f58662OooO0o0 = (V) C25751OooOoo.OooO00o(initialVelocityVector);
        InterfaceC32507OooOO0o<V, T> interfaceC32507OooOO0oOooO0O0 = typeConverter.OooO0O0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        if (c20576o00oO0oOooO00o.f58812OooO0Oo == null) {
            c20576o00oO0oOooO00o.f58812OooO0Oo = (V) initialValue.OooO0OO();
        }
        V v = c20576o00oO0oOooO00o.f58812OooO0Oo;
        if (v == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("targetVector");
            throw null;
        }
        int iOooO0O0 = v.OooO0O0();
        int i = 0;
        while (true) {
            C20510OooOO0o c20510OooOO0o = c20576o00oO0oOooO00o.f58809OooO00o;
            if (i >= iOooO0O0) {
                V v2 = c20576o00oO0oOooO00o.f58812OooO0Oo;
                if (v2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("targetVector");
                    throw null;
                }
                this.f58663OooO0oO = interfaceC32507OooOO0oOooO0O0.invoke(v2);
                if (c20576o00oO0oOooO00o.f58811OooO0OO == null) {
                    c20576o00oO0oOooO00o.f58811OooO0OO = (V) initialValue.OooO0OO();
                }
                V v3 = c20576o00oO0oOooO00o.f58811OooO0OO;
                if (v3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
                    throw null;
                }
                int iOooO0O02 = v3.OooO0O0();
                long jMax = 0;
                for (int i2 = 0; i2 < iOooO0O02; i2++) {
                    jMax = Math.max(jMax, ((long) (Math.exp(c20510OooOO0o.f58578OooO00o.OooO0O0(initialVelocityVector.OooO00o(i2)) / (((double) OooOoO.OooOO0.f58576OooO00o) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.f58664OooO0oo = jMax;
                V v4 = (V) C25751OooOoo.OooO00o(c20576o00oO0oOooO00o.OooO0O0(jMax, initialValue, initialVelocityVector));
                this.f58661OooO0o = v4;
                int iOooO0O03 = v4.OooO0O0();
                for (int i3 = 0; i3 < iOooO0O03; i3++) {
                    V v5 = this.f58661OooO0o;
                    v5.OooO0o0(i3, oO0O00oo.OooOO0.OooO0o0(v5.OooO00o(i3), -this.f58657OooO00o.OooO00o(), this.f58657OooO00o.OooO00o()));
                }
                return;
            }
            V v6 = c20576o00oO0oOooO00o.f58812OooO0Oo;
            if (v6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("targetVector");
                throw null;
            }
            float fOooO00o = initialValue.OooO00o(i);
            float fOooO00o2 = initialVelocityVector.OooO00o(i);
            OooOoO.OooO oooO = c20510OooOO0o.f58578OooO00o;
            double dOooO0O0 = oooO.OooO0O0(fOooO00o2);
            double d = OooOoO.OooOO0.f58576OooO00o;
            int i4 = i;
            v6.OooO0o0(i4, (Math.signum(fOooO00o2) * ((float) (Math.exp((d / (d - 1.0d)) * dOooO0O0) * ((double) (oooO.f58561OooO00o * oooO.f58563OooO0OO))))) + fOooO00o);
            i = i4 + 1;
        }
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final boolean OooO00o() {
        return false;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final long OooO0OO() {
        return this.f58664OooO0oo;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final InterfaceC20574Ooooooo<T, V> OooO0Oo() {
        return this.f58658OooO0O0;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final T OooO0o() {
        return this.f58663OooO0oO;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final T OooO0o0(long j) {
        if (OooO0O0(j)) {
            return this.f58663OooO0oO;
        }
        InterfaceC32507OooOO0o<V, T> interfaceC32507OooOO0oOooO0O0 = this.f58658OooO0O0.OooO0O0();
        V initialVelocity = this.f58662OooO0o0;
        C20576o00oO0o c20576o00oO0o = this.f58657OooO00o;
        V initialValue = this.f58660OooO0Oo;
        c20576o00oO0o.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        if (c20576o00oO0o.f58810OooO0O0 == null) {
            c20576o00oO0o.f58810OooO0O0 = (V) initialValue.OooO0OO();
        }
        V v = c20576o00oO0o.f58810OooO0O0;
        String str = "valueVector";
        if (v == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("valueVector");
            throw null;
        }
        int iOooO0O0 = v.OooO0O0();
        int i = 0;
        while (i < iOooO0O0) {
            V v2 = c20576o00oO0o.f58810OooO0O0;
            if (v2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO(str);
                throw null;
            }
            float fOooO00o = initialValue.OooO00o(i);
            long j2 = j / 1000000;
            OooO.OooO00o OooO00o2 = c20576o00oO0o.f58809OooO00o.f58578OooO00o.OooO00o(initialVelocity.OooO00o(i));
            String str2 = str;
            long j3 = OooO00o2.f58566OooO0OO;
            v2.OooO0o0(i, (Math.signum(OooO00o2.f58564OooO00o) * OooO00o2.f58565OooO0O0 * C20506OooO0Oo.OooO00o(j3 > 0 ? j2 / j3 : 1.0f).f58568OooO00o) + fOooO00o);
            i++;
            str = str2;
        }
        String str3 = str;
        V v3 = c20576o00oO0o.f58810OooO0O0;
        if (v3 != null) {
            return interfaceC32507OooOO0oOooO0O0.invoke(v3);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO(str3);
        throw null;
    }

    @Override // OooOoOO.InterfaceC20523OooO0oo
    public final V OooO0oO(long j) {
        if (OooO0O0(j)) {
            return this.f58661OooO0o;
        }
        return (V) this.f58657OooO00o.OooO0O0(j, this.f58660OooO0Oo, this.f58662OooO0o0);
    }
}
