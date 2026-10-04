package o00000o0;

/* JADX INFO: renamed from: o00000o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24113OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f81258OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C24113OooO00o) {
            return Float.compare(this.f81258OooO00o, ((C24113OooO00o) obj).f81258OooO00o) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81258OooO00o);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f81258OooO00o + ')';
    }
}
