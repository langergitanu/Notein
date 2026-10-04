package androidx.graphics.surface;

import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f65126OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f65127OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(OooO0O0 oooO0O0, InterfaceC32507OooOO0o<? super o000OO0O.OooO0OO, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f65126OooO00o = oooO0O0;
        this.f65127OooO0O0 = (OooOOOO) interfaceC32507OooOO0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return this.f65126OooO00o.equals(oooO0OO.f65126OooO00o) && OooOOO0.OooO0O0(this.f65127OooO0O0, oooO0OO.f65127OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f65126OooO00o.hashCode() * 31;
        OooOOOO oooOOOO = this.f65127OooO0O0;
        return iHashCode + (oooOOOO == null ? 0 : oooOOOO.hashCode());
    }

    public final String toString() {
        return "CallbackEntry(surfaceControl=" + this.f65126OooO00o + ", callback=" + this.f65127OooO0O0 + ')';
    }
}
