package o00Ooo;

/* JADX INFO: renamed from: o00Ooo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25090OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f85167OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C25090OooOoOO) {
            return this.f85167OooO00o == ((C25090OooOoOO) obj).f85167OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85167OooO00o);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f85167OooO00o + ')';
    }
}
