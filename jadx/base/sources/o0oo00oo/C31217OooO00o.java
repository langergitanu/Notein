package o0oo00oo;

import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0oo00oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31217OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C31217OooO00o f111336OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Map<Integer, Integer> f111337OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f111338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Integer, Integer> f111339OooO0O0;

    static {
        new C31217OooO00o(0, C34436OooOoOO.f123455OooOo0o);
        f111336OooO0OO = new C31217OooO00o(144, Oooo0.OooO0o0(new C32443OooOOO(100, 90)));
        f111337OooO0Oo = Oooo0.OooO0o0(new C32443OooOOO(100, 90));
    }

    public C31217OooO00o(int i, Map<Integer, Integer> toolRates) {
        OooOOO0.OooO0oO(toolRates, "toolRates");
        this.f111338OooO00o = i;
        this.f111339OooO0O0 = toolRates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31217OooO00o)) {
            return false;
        }
        C31217OooO00o c31217OooO00o = (C31217OooO00o) obj;
        return this.f111338OooO00o == c31217OooO00o.f111338OooO00o && OooOOO0.OooO0O0(this.f111339OooO0O0, c31217OooO00o.f111339OooO0O0);
    }

    public final int hashCode() {
        return this.f111339OooO0O0.hashCode() + (Integer.hashCode(this.f111338OooO00o) * 31);
    }

    public final String toString() {
        return "InkSamplingRateConfig(defaultHz=" + this.f111338OooO00o + ", toolRates=" + this.f111339OooO0O0 + ")";
    }
}
