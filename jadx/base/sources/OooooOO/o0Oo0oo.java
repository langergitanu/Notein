package OooooOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f61800OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof o0Oo0oo) {
            return this.f61800OooO00o == ((o0Oo0oo) obj).f61800OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61800OooO00o);
    }

    public final String toString() {
        int i = this.f61800OooO00o;
        return i == 0 ? "Miter" : i == 1 ? "Round" : i == 2 ? "Bevel" : "Unknown";
    }
}
