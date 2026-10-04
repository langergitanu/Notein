package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;
import java.util.Iterator;
import oO0O00oo.C32520OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o<V extends AbstractC20531OooOOo> implements InterfaceC20577o00ooo<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC20533OooOOoo f58826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public V f58827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public V f58828OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public V f58829OooO0Oo;

    public static final class OooO00o implements InterfaceC20533OooOOoo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20542OooOoo0 f58830OooO00o;

        public OooO00o(InterfaceC20542OooOoo0 interfaceC20542OooOoo0) {
            this.f58830OooO00o = interfaceC20542OooOoo0;
        }

        @Override // OooOoOO.InterfaceC20533OooOOoo
        public final InterfaceC20542OooOoo0 get(int i) {
            return this.f58830OooO00o;
        }
    }

    public oo000o(InterfaceC20533OooOOoo interfaceC20533OooOOoo) {
        this.f58826OooO00o = interfaceC20533OooOOoo;
    }

    @Override // OooOoOO.o00O0O
    public final long OooO0O0(V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        Iterator<Integer> it = oO0O00oo.OooOO0.OooO(0, initialValue.OooO0O0()).iterator();
        long jMax = 0;
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
            jMax = Math.max(jMax, this.f58826OooO00o.get(iNextInt).OooO0OO(initialValue.OooO00o(iNextInt), targetValue.OooO00o(iNextInt), initialVelocity.OooO00o(iNextInt)));
        }
        return jMax;
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0Oo(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        if (this.f58828OooO0OO == null) {
            this.f58828OooO0OO = (V) initialVelocity.OooO0OO();
        }
        V v = this.f58828OooO0OO;
        if (v == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
            throw null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f58828OooO0OO;
            if (v2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
                throw null;
            }
            v2.OooO0o0(i, this.f58826OooO00o.get(i).OooO0O0(j, initialValue.OooO00o(i), targetValue.OooO00o(i), initialVelocity.OooO00o(i)));
        }
        V v3 = this.f58828OooO0OO;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
        throw null;
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0o0(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        if (this.f58827OooO0O0 == null) {
            this.f58827OooO0O0 = (V) initialValue.OooO0OO();
        }
        V v = this.f58827OooO0O0;
        if (v == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("valueVector");
            throw null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f58827OooO0O0;
            if (v2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("valueVector");
                throw null;
            }
            v2.OooO0o0(i, this.f58826OooO00o.get(i).OooO0o0(j, initialValue.OooO00o(i), targetValue.OooO00o(i), initialVelocity.OooO00o(i)));
        }
        V v3 = this.f58827OooO0O0;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("valueVector");
        throw null;
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0oO(V initialValue, V targetValue, V v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        if (this.f58829OooO0Oo == null) {
            this.f58829OooO0Oo = (V) v.OooO0OO();
        }
        V v2 = this.f58829OooO0Oo;
        if (v2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("endVelocityVector");
            throw null;
        }
        int iOooO0O0 = v2.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v3 = this.f58829OooO0Oo;
            if (v3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("endVelocityVector");
                throw null;
            }
            v3.OooO0o0(i, this.f58826OooO00o.get(i).OooO0Oo(initialValue.OooO00o(i), targetValue.OooO00o(i), v.OooO00o(i)));
        }
        V v4 = this.f58829OooO0Oo;
        if (v4 != null) {
            return v4;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("endVelocityVector");
        throw null;
    }

    public oo000o(InterfaceC20542OooOoo0 anim) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(anim, "anim");
        this.f58826OooO00o = new OooO00o(anim);
    }
}
