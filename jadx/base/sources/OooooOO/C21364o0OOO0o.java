package OooooOO;

/* JADX INFO: renamed from: OooooOO.o0OOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21364o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f61799OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C21364o0OOO0o) {
            return this.f61799OooO00o == ((C21364o0OOO0o) obj).f61799OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61799OooO00o);
    }

    public final String toString() {
        int i = this.f61799OooO00o;
        return i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
    }
}
