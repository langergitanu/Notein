package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;
import java.util.LinkedHashMap;
import java.util.Map;
import o00ooO0.C25751OooOoo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: OooOoOO.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20578o0ooOO0<V extends AbstractC20531OooOOo> implements InterfaceC20575o00o0O<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f58817OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f58818OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public V f58819OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public V f58820OooO0Oo;

    public C20578o0ooOO0(int i, LinkedHashMap linkedHashMap) {
        this.f58817OooO00o = linkedHashMap;
        this.f58818OooO0O0 = i;
    }

    @Override // OooOoOO.InterfaceC20575o00o0O
    public final int OooO0OO() {
        return this.f58818OooO0O0;
    }

    @Override // OooOoOO.o00O0O
    public final V OooO0Oo(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        long jOooO0oO = oO0O00oo.OooOO0.OooO0oO((j / 1000000) - ((long) 0), 0L, this.f58818OooO0O0);
        if (jOooO0oO <= 0) {
            return initialVelocity;
        }
        AbstractC20531OooOOo abstractC20531OooOOoOooO0o0 = OooO0o0((jOooO0oO - 1) * 1000000, initialValue, targetValue, initialVelocity);
        AbstractC20531OooOOo abstractC20531OooOOoOooO0o02 = OooO0o0(jOooO0oO * 1000000, initialValue, targetValue, initialVelocity);
        if (this.f58819OooO0OO == null) {
            this.f58819OooO0OO = (V) C25751OooOoo.OooO0OO(initialValue);
            this.f58820OooO0Oo = (V) C25751OooOoo.OooO0OO(initialValue);
        }
        int iOooO0O0 = abstractC20531OooOOoOooO0o0.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v = this.f58820OooO0Oo;
            if (v == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
                throw null;
            }
            v.OooO0o0(i, (abstractC20531OooOOoOooO0o0.OooO00o(i) - abstractC20531OooOOoOooO0o02.OooO00o(i)) * 1000.0f);
        }
        V v2 = this.f58820OooO0Oo;
        if (v2 != null) {
            return v2;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("velocityVector");
        throw null;
    }

    @Override // OooOoOO.InterfaceC20575o00o0O
    public final int OooO0o() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooOoOO.o00O0O
    public final V OooO0o0(long j, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialVelocity, "initialVelocity");
        long j2 = (j / 1000000) - ((long) 0);
        int i = this.f58818OooO0O0;
        int iOooO0oO = (int) oO0O00oo.OooOO0.OooO0oO(j2, 0L, i);
        Integer numValueOf = Integer.valueOf(iOooO0oO);
        LinkedHashMap linkedHashMap = this.f58817OooO00o;
        if (linkedHashMap.containsKey(numValueOf)) {
            return (V) ((C32443OooOOO) C34444Oooo0O0.OooO0oO(Integer.valueOf(iOooO0oO), linkedHashMap)).f116638OooOo0o;
        }
        if (iOooO0oO >= i) {
            return targetValue;
        }
        if (iOooO0oO <= 0) {
            return initialValue;
        }
        InterfaceC20539OooOoO0 interfaceC20539OooOoO0 = C20538OooOoO.f58667OooO0OO;
        AbstractC20531OooOOo abstractC20531OooOOo = initialValue;
        int i2 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            C32443OooOOO c32443OooOOO = (C32443OooOOO) entry.getValue();
            if (iOooO0oO > iIntValue && iIntValue >= i2) {
                abstractC20531OooOOo = (AbstractC20531OooOOo) c32443OooOOO.f116638OooOo0o;
                interfaceC20539OooOoO0 = (InterfaceC20539OooOoO0) c32443OooOOO.f116637OooOo;
                i2 = iIntValue;
            } else if (iOooO0oO < iIntValue && iIntValue <= i) {
                targetValue = (V) c32443OooOOO.f116638OooOo0o;
                i = iIntValue;
            }
        }
        float fOooO00o = interfaceC20539OooOoO0.OooO00o((iOooO0oO - i2) / (i - i2));
        if (this.f58819OooO0OO == null) {
            this.f58819OooO0OO = (V) C25751OooOoo.OooO0OO(initialValue);
            this.f58820OooO0Oo = (V) C25751OooOoo.OooO0OO(initialValue);
        }
        int iOooO0O0 = abstractC20531OooOOo.OooO0O0();
        for (int i3 = 0; i3 < iOooO0O0; i3++) {
            V v = this.f58819OooO0OO;
            if (v == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("valueVector");
                throw null;
            }
            float fOooO00o2 = abstractC20531OooOOo.OooO00o(i3);
            float fOooO00o3 = targetValue.OooO00o(i3);
            o0OoOo0 o0oooo02 = C20580ooOO.f58832OooO00o;
            v.OooO0o0(i3, (fOooO00o3 * fOooO00o) + ((1 - fOooO00o) * fOooO00o2));
        }
        V v2 = this.f58819OooO0OO;
        if (v2 != null) {
            return v2;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("valueVector");
        throw null;
    }
}
