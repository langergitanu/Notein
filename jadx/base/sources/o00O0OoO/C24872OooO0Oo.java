package o00O0OoO;

/* JADX INFO: renamed from: o00O0OoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24872OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f84438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Long f84439OooO0O0;

    public C24872OooO0Oo(String str, long j) {
        this.f84438OooO00o = str;
        this.f84439OooO0O0 = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24872OooO0Oo)) {
            return false;
        }
        C24872OooO0Oo c24872OooO0Oo = (C24872OooO0Oo) obj;
        if (!this.f84438OooO00o.equals(c24872OooO0Oo.f84438OooO00o)) {
            return false;
        }
        Long l = c24872OooO0Oo.f84439OooO0O0;
        Long l2 = this.f84439OooO0O0;
        return l2 != null ? l2.equals(l) : l == null;
    }

    public final int hashCode() {
        int iHashCode = this.f84438OooO00o.hashCode() * 31;
        Long l = this.f84439OooO0O0;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
