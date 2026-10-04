package o00000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81052OooO00o;

    public static String OooO00o(int i) {
        return i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOOO0) {
            return this.f81052OooO00o == ((OooOOO0) obj).f81052OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81052OooO00o);
    }

    public final String toString() {
        return OooO00o(this.f81052OooO00o);
    }
}
