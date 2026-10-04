package Oooo0oO;

/* JADX INFO: renamed from: Oooo0oO.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21072OooooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Integer f61034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f61035OooO0O0;

    public C21072OooooO0(Object obj, Integer num) {
        this.f61034OooO00o = num;
        this.f61035OooO0O0 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21072OooooO0)) {
            return false;
        }
        C21072OooooO0 c21072OooooO0 = (C21072OooooO0) obj;
        return this.f61034OooO00o.equals(c21072OooooO0.f61034OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61035OooO0O0, c21072OooooO0.f61035OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f61034OooO00o.hashCode() * 31;
        Object obj = this.f61035OooO0O0;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f61034OooO00o + ", right=" + this.f61035OooO0O0 + ')';
    }
}
