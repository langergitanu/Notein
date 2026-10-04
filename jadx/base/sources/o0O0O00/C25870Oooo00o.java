package o0O0O00;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0O0O00.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25870Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25868OooOooo f88269OooO00o = new C25868OooOooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32443OooOOO<Integer, Integer> f88270OooO0O0 = new C32443OooOOO<>(0, 0);

    public static final TextDirectionHeuristic OooO00o(int i) {
        if (i == 0) {
            TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
            kotlin.jvm.internal.OooOOO0.OooO0o(LTR, "LTR");
            return LTR;
        }
        if (i == 1) {
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            kotlin.jvm.internal.OooOOO0.OooO0o(RTL, "RTL");
            return RTL;
        }
        if (i == 2) {
            TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            kotlin.jvm.internal.OooOOO0.OooO0o(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            kotlin.jvm.internal.OooOOO0.OooO0o(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
            return FIRSTSTRONG_RTL;
        }
        if (i == 4) {
            TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
            kotlin.jvm.internal.OooOOO0.OooO0o(ANYRTL_LTR, "ANYRTL_LTR");
            return ANYRTL_LTR;
        }
        if (i != 5) {
            TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            kotlin.jvm.internal.OooOOO0.OooO0o(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR2;
        }
        TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
        kotlin.jvm.internal.OooOOO0.OooO0o(LOCALE, "LOCALE");
        return LOCALE;
    }
}
