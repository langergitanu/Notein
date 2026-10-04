package o0000Ooo;

/* JADX INFO: renamed from: o0000Ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24232OooO0o0 implements Comparable<C24232OooO0o0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f81479OooOo0o;

    public static final boolean OooO00o(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String OooO0O0(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(C24232OooO0o0 c24232OooO0o0) {
        return Float.compare(this.f81479OooOo0o, c24232OooO0o0.f81479OooOo0o);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24232OooO0o0) {
            return Float.compare(this.f81479OooOo0o, ((C24232OooO0o0) obj).f81479OooOo0o) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81479OooOo0o);
    }

    public final String toString() {
        return OooO0O0(this.f81479OooOo0o);
    }
}
