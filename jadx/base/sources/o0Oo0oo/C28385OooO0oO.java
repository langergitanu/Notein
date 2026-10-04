package o0Oo0oo;

/* JADX INFO: renamed from: o0Oo0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28385OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f100639OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C28385OooO0oO) {
            return this.f100639OooO00o == ((C28385OooO0oO) obj).f100639OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f100639OooO00o);
    }

    public final String toString() {
        int i = this.f100639OooO00o;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : "Unknown";
    }
}
