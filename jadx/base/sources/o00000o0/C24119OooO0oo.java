package o00000o0;

/* JADX INFO: renamed from: o00000o0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24119OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81274OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C24119OooO0oo) {
            return this.f81274OooO00o == ((C24119OooO0oo) obj).f81274OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81274OooO00o);
    }

    public final String toString() {
        int i = this.f81274OooO00o;
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : "Invalid";
    }
}
