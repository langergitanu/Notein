package o00000;

import OooOoo0.C20703o000000o;
import OoooOOO.C21176OooO;
import OoooOOO.C21185OooOO0;
import o00o00Oo.C25256OooO00o;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34680OooO0O0 f81083OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f81084OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34696OooOOoo f81085OooO0OO;

    static {
        C21185OooOO0 c21185OooOO0 = C21176OooO.f61418OooO00o;
    }

    public Oooo0(C34680OooO0O0 c34680OooO0O0, long j, C34696OooOOoo c34696OooOOoo) {
        C34696OooOOoo c34696OooOOoo2;
        this.f81083OooO00o = c34680OooO0O0;
        int length = c34680OooO0O0.f124887OooOo0o.length();
        int i = C34696OooOOoo.f124979OooO0OO;
        int i2 = (int) (j >> 32);
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(i2, 0, length);
        int i3 = (int) (j & 4294967295L);
        int iOooO0o2 = oO0O00oo.OooOO0.OooO0o(i3, 0, length);
        this.f81084OooO0O0 = (iOooO0o == i2 && iOooO0o2 == i3) ? j : C25256OooO00o.OooO0OO(iOooO0o, iOooO0o2);
        if (c34696OooOOoo != null) {
            int length2 = c34680OooO0O0.f124887OooOo0o.length();
            long j2 = c34696OooOOoo.f124980OooO00o;
            int i4 = (int) (j2 >> 32);
            int iOooO0o3 = oO0O00oo.OooOO0.OooO0o(i4, 0, length2);
            int i5 = (int) (j2 & 4294967295L);
            int iOooO0o4 = oO0O00oo.OooOO0.OooO0o(i5, 0, length2);
            c34696OooOOoo2 = new C34696OooOOoo((iOooO0o3 == i4 && iOooO0o4 == i5) ? j2 : C25256OooO00o.OooO0OO(iOooO0o3, iOooO0o4));
        } else {
            c34696OooOOoo2 = null;
        }
        this.f81085OooO0OO = c34696OooOOoo2;
    }

    public static Oooo0 OooO00o(Oooo0 oooo0, C34680OooO0O0 annotatedString, long j, int i) {
        if ((i & 1) != 0) {
            annotatedString = oooo0.f81083OooO00o;
        }
        if ((i & 2) != 0) {
            j = oooo0.f81084OooO0O0;
        }
        C34696OooOOoo c34696OooOOoo = (i & 4) != 0 ? oooo0.f81085OooO0OO : null;
        oooo0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotatedString, "annotatedString");
        return new Oooo0(annotatedString, j, c34696OooOOoo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return C34696OooOOoo.OooO00o(this.f81084OooO0O0, oooo0.f81084OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81085OooO0OO, oooo0.f81085OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81083OooO00o, oooo0.f81083OooO00o);
    }

    public final int hashCode() {
        int iHashCode = this.f81083OooO00o.hashCode() * 31;
        int i = C34696OooOOoo.f124979OooO0OO;
        int iOooO0O0 = C20703o000000o.OooO0O0(iHashCode, 31, this.f81084OooO0O0);
        C34696OooOOoo c34696OooOOoo = this.f81085OooO0OO;
        return iOooO0O0 + (c34696OooOOoo != null ? Long.hashCode(c34696OooOOoo.f124980OooO00o) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f81083OooO00o) + "', selection=" + ((Object) C34696OooOOoo.OooO0o(this.f81084OooO0O0)) + ", composition=" + this.f81085OooO0OO + ')';
    }

    public Oooo0(String str, long j, int i) {
        this(new C34680OooO0O0(6, (i & 1) != 0 ? "" : str, null), (i & 2) != 0 ? C34696OooOOoo.f124978OooO0O0 : j, (C34696OooOOoo) null);
    }
}
