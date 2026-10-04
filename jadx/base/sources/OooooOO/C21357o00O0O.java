package OooooOO;

/* JADX INFO: renamed from: OooooOO.o00O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21357o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f61778OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C21357o00O0O) {
            return this.f61778OooO00o == ((C21357o00O0O) obj).f61778OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61778OooO00o);
    }

    public final String toString() {
        int i = this.f61778OooO00o;
        return i == 0 ? "NonZero" : i == 1 ? "EvenOdd" : "Unknown";
    }
}
