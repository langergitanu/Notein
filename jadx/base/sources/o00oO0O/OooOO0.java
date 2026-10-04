package o00oO0O;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Comparator<C25503OooOoOO> {
    @Override // java.util.Comparator
    public final int compare(C25503OooOoOO c25503OooOoOO, C25503OooOoOO c25503OooOoOO2) {
        C25503OooOoOO l1 = c25503OooOoOO;
        C25503OooOoOO l2 = c25503OooOoOO2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(l1, "l1");
        kotlin.jvm.internal.OooOOO0.OooO0oO(l2, "l2");
        int iOooO = kotlin.jvm.internal.OooOOO0.OooO(l1.f86945OooOooo, l2.f86945OooOooo);
        return iOooO != 0 ? iOooO : kotlin.jvm.internal.OooOOO0.OooO(l1.hashCode(), l2.hashCode());
    }
}
