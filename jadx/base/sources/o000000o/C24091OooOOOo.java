package o000000o;

/* JADX INFO: renamed from: o000000o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24091OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81186OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C24091OooOOOo) {
            return this.f81186OooO00o == ((C24091OooOOOo) obj).f81186OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81186OooO00o);
    }

    public final String toString() {
        int i = this.f81186OooO00o;
        return i == 0 ? "None" : i == 1 ? "All" : i == 2 ? "Weight" : i == 3 ? "Style" : "Invalid";
    }
}
