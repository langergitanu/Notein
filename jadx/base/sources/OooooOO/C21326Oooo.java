package OooooOO;

/* JADX INFO: renamed from: OooooOO.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21326Oooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f61736OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C21326Oooo) {
            return this.f61736OooO00o == ((C21326Oooo) obj).f61736OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61736OooO00o);
    }

    public final String toString() {
        int i = this.f61736OooO00o;
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }
}
