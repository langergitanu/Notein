package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20528OooOOO0 {
    public static C20555OoooO0 OooO00o(int i, Object obj) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C20555OoooO0(1.0f, 1500.0f, obj);
    }

    public static C20573OoooooO OooO0O0(int i, int i2, InterfaceC20539OooOoO0 easing) {
        int i3 = (i2 & 2) != 0 ? 0 : 74;
        if ((i2 & 4) != 0) {
            easing = C20538OooOoO.f58665OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(easing, "easing");
        return new C20573OoooooO(i, i3, easing);
    }
}
