package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;

/* JADX INFO: loaded from: classes.dex */
public interface o00O0O<V extends AbstractC20531OooOOo> {
    boolean OooO00o();

    long OooO0O0(V v, V v2, V v3);

    V OooO0Oo(long j, V v, V v2, V v3);

    V OooO0o0(long j, V v, V v2, V v3);

    default V OooO0oO(V initialValue, V targetValue, V v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initialValue, "initialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetValue, "targetValue");
        return (V) OooO0Oo(OooO0O0(initialValue, targetValue, v), initialValue, targetValue, v);
    }
}
