package o00o0O;

import OooOoO.C20505OooO0OO;

/* JADX INFO: renamed from: o00o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25303OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f86118OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f86119OooO0O0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25303OooO00o)) {
            return false;
        }
        C25303OooO00o c25303OooO00o = (C25303OooO00o) obj;
        return this.f86118OooO00o == c25303OooO00o.f86118OooO00o && Float.compare(this.f86119OooO0O0, c25303OooO00o.f86119OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f86119OooO0O0) + (Long.hashCode(this.f86118OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f86118OooO00o);
        sb.append(", dataPoint=");
        return C20505OooO0OO.OooO0O0(sb, this.f86119OooO0O0, ')');
    }
}
