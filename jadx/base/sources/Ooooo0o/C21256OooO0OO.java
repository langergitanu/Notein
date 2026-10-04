package Ooooo0o;

/* JADX INFO: renamed from: Ooooo0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21256OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f61650OooO00o;

    public static String OooO00o(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21256OooO0OO) {
            return this.f61650OooO00o == ((C21256OooO0OO) obj).f61650OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61650OooO00o);
    }

    public final String toString() {
        return OooO00o(this.f61650OooO00o);
    }
}
