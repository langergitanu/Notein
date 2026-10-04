package o000000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81185OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof OooOOOO) {
            return this.f81185OooO00o == ((OooOOOO) obj).f81185OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81185OooO00o);
    }

    public final String toString() {
        int i = this.f81185OooO00o;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
