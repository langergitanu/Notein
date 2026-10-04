package o00000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81275OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof OooOO0) {
            return this.f81275OooO00o == ((OooOO0) obj).f81275OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81275OooO00o);
    }

    public final String toString() {
        int i = this.f81275OooO00o;
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : "Invalid";
    }
}
