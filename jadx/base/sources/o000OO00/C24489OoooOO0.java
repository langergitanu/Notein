package o000OO00;

import o000OO00.OooOo;

/* JADX INFO: renamed from: o000OO00.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24489OoooOO0 {
    public static final long OooO00o(OooOo brushPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(brushPaint, "brushPaint");
        for (OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo : brushPaint.f82688OooO0O0) {
            if (abstractC24463OooO0Oo instanceof OooOo.OooO0OO) {
                OooOo.OooO0OO oooO0OO = (OooOo.OooO0OO) abstractC24463OooO0Oo;
                if (oooO0OO.OooO0Oo() > 1) {
                    return oooO0OO.OooO0OO();
                }
            }
        }
        return 0L;
    }
}
