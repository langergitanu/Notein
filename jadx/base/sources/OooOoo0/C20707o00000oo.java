package OooOoo0;

import OooOo.C20496Oooo0o0;
import OooOooo.C20787Oooo0OO;
import OooooOO.C21348Ooooo0o;

/* JADX INFO: renamed from: OooOoo0.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20707o00000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f59455OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C20787Oooo0OO f59456OooO0O0;

    public C20707o00000oo() {
        long jOooO0OO = C20496Oooo0o0.OooO0OO(4284900966L);
        float f = 0;
        C20787Oooo0OO c20787Oooo0OO = new C20787Oooo0OO(f, f, f, f);
        this.f59455OooO00o = jOooO0OO;
        this.f59456OooO0O0 = c20787Oooo0OO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C20707o00000oo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C20707o00000oo c20707o00000oo = (C20707o00000oo) obj;
        return C21348Ooooo0o.OooO0OO(this.f59455OooO00o, c20707o00000oo.f59455OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f59456OooO0O0, c20707o00000oo.f59456OooO0O0);
    }

    public final int hashCode() {
        int i = C21348Ooooo0o.f61767OooO0oo;
        return this.f59456OooO0O0.hashCode() + (Long.hashCode(this.f59455OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        C20706o00000oO.OooO0O0(this.f59455OooO00o, ", drawPadding=", sb);
        sb.append(this.f59456OooO0O0);
        sb.append(')');
        return sb.toString();
    }
}
