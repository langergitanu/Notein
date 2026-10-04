package o00O00oO;

import androidx.core.view.WindowInsetsCompat;
import o00O00o.C24807OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24807OooO0O0 f84187OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final WindowInsetsCompat f84188OooO0O0;

    public OooOOO0(C24807OooO0O0 c24807OooO0O0, WindowInsetsCompat _windowInsetsCompat) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(_windowInsetsCompat, "_windowInsetsCompat");
        this.f84187OooO00o = c24807OooO0O0;
        this.f84188OooO0O0 = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!OooOOO0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f84187OooO00o, oooOOO0.f84187OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f84188OooO0O0, oooOOO0.f84188OooO0O0);
    }

    public final int hashCode() {
        return this.f84188OooO0O0.hashCode() + (this.f84187OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f84187OooO00o + ", windowInsetsCompat=" + this.f84188OooO0O0 + ')';
    }
}
