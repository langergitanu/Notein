package o00000o0;

/* JADX INFO: renamed from: o00000o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24116OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81260OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C24116OooO0Oo) {
            return this.f81260OooO00o == ((C24116OooO0Oo) obj).f81260OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81260OooO00o);
    }

    public final String toString() {
        int i = this.f81260OooO00o;
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : "Invalid";
    }
}
