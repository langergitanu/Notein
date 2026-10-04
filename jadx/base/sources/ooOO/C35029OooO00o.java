package ooOO;

/* JADX INFO: renamed from: ooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C35029OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f125768OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C35029OooO00o) {
            return this.f125768OooO00o == ((C35029OooO00o) obj).f125768OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f125768OooO00o);
    }

    public final String toString() {
        int i = this.f125768OooO00o;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
