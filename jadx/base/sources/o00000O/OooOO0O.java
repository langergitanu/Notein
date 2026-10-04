package o00000O;

import Oooo0oO.o000O0;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0<Object> f81234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f81235OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f81236OooO0OO;

    public OooOO0O(o000O0<? extends Object> resolveResult, OooOO0O oooOO0O) {
        OooOOO0.OooO0oO(resolveResult, "resolveResult");
        this.f81234OooO00o = resolveResult;
        this.f81235OooO0O0 = oooOO0O;
        this.f81236OooO0OO = resolveResult.getValue();
    }

    public final boolean OooO00o() {
        if (this.f81234OooO00o.getValue() != this.f81236OooO0OO) {
            return true;
        }
        OooOO0O oooOO0O = this.f81235OooO0O0;
        return oooOO0O != null && oooOO0O.OooO00o();
    }
}
