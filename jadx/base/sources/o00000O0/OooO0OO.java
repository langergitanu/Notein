package o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f81242OooO00o;

    public OooO0OO(OooO00o oooO00o) {
        this.f81242OooO00o = oooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OooO0OO)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f81242OooO00o.OooO0O0().equals(((OooO0OO) obj).f81242OooO00o.OooO0O0());
    }

    public final int hashCode() {
        return this.f81242OooO00o.OooO0O0().hashCode();
    }

    public final String toString() {
        return this.f81242OooO00o.OooO0O0();
    }
}
