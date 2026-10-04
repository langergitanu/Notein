package Oooo0oO;

import o000oOoO.C24638OooO0Oo;

/* JADX INFO: renamed from: Oooo0oO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21052Oooo00O {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Oooo0oO.Oooo0O0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Oooo0oO.o000OO0O] */
    /* JADX WARN: Type inference failed for: r9v7, types: [Oooo0oO.o000oOoO] */
    /* JADX WARN: Type inference failed for: r9v9, types: [Oooo0oO.o000oOoO] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final o000000 OooO00o(o00000O0<?>[] o00000o0Arr, o000000 o000000Var, o000000 o000000Var2) {
        C24638OooO0Oo c24638OooO0Oo = C24638OooO0Oo.f83457OooOoO;
        C24638OooO0Oo.OooO00o oooO00o = new C24638OooO0Oo.OooO00o(c24638OooO0Oo);
        oooO00o.f83458OooOoo = c24638OooO0Oo;
        for (o00000O0<?> o00000o02 : o00000o0Arr) {
            o00000 o00000Var = o00000o02.f61055OooO00o;
            if (o00000o02.f61059OooO0o || !o000000Var.containsKey(o00000Var)) {
                InterfaceC21103o000O0o0 interfaceC21103o000O0o0 = (InterfaceC21103o000O0o0) o000000Var2.get(o00000Var);
                boolean z = interfaceC21103o000O0o0 instanceof o000oOoO;
                Object obj = o00000o02.f61060OooO0o0;
                boolean z2 = o00000o02.f61058OooO0Oo;
                ?? o000oo0o2 = 0;
                o000oo0o2 = 0;
                o000oo0o2 = 0;
                o000oo0o2 = 0;
                o000oo0o2 = 0;
                if (z) {
                    if (z2) {
                        o000oo0o2 = (o000oOoO) interfaceC21103o000O0o0;
                        o000oo0o2.f61247OooO00o.setValue((T) o00000o02.OooO00o());
                    }
                } else if (interfaceC21103o000O0o0 instanceof o000OO0O) {
                    if ((o00000o02.f61056OooO0O0 || obj != null) && !z2) {
                        o000OO0O o000oo0o3 = (o000OO0O) interfaceC21103o000O0o0;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(o00000o02.OooO00o(), o000oo0o3.f61222OooO00o)) {
                            o000oo0o2 = o000oo0o3;
                        }
                    }
                } else if (interfaceC21103o000O0o0 instanceof C21054Oooo0O0) {
                    o000oo0o2 = (C21054Oooo0O0) interfaceC21103o000O0o0;
                    o000oo0o2.getClass();
                }
                if (o000oo0o2 == 0) {
                    if (z2) {
                        o000O000 o000o0002 = o00000o02.f61057OooO0OO;
                        if (o000o0002 == null) {
                            o000o0002 = o000O0O0.f61218OooO00o;
                        }
                        o000oo0o2 = new o000oOoO(C21105o000OoO.OooO0OO(obj, o000o0002));
                    } else {
                        o000oo0o2 = new o000OO0O(o00000o02.OooO00o());
                    }
                }
                oooO00o.put(o00000Var, o000oo0o2);
            }
        }
        return oooO00o.build();
    }
}
