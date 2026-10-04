package o00oO0O;

import java.util.Comparator;

/* JADX INFO: renamed from: o00oO0O.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25539OooooOo implements Comparator<C25503OooOoOO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25539OooooOo f87115OooOo0o = new C25539OooooOo();

    @Override // java.util.Comparator
    public final int compare(C25503OooOoOO c25503OooOoOO, C25503OooOoOO c25503OooOoOO2) {
        C25503OooOoOO a = c25503OooOoOO;
        C25503OooOoOO b = c25503OooOoOO2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        int iOooO = kotlin.jvm.internal.OooOOO0.OooO(b.f86945OooOooo, a.f86945OooOooo);
        return iOooO != 0 ? iOooO : kotlin.jvm.internal.OooOOO0.OooO(a.hashCode(), b.hashCode());
    }
}
