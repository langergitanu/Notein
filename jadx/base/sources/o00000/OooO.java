package o00000;

import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;
import o00o00Oo.C25256OooO00o;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24055OooOo0O f81024OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f81025OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f81026OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f81027OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f81028OooO0o0;

    public OooO(C34680OooO0O0 c34680OooO0O0, long j) {
        String text = c34680OooO0O0.f124887OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        C24055OooOo0O c24055OooOo0O = new C24055OooOo0O();
        c24055OooOo0O.f81063OooO00o = text;
        c24055OooOo0O.f81065OooO0OO = -1;
        c24055OooOo0O.f81066OooO0Oo = -1;
        this.f81024OooO00o = c24055OooOo0O;
        this.f81025OooO0O0 = C34696OooOOoo.OooO0Oo(j);
        this.f81026OooO0OO = C34696OooOOoo.OooO0OO(j);
        this.f81027OooO0Oo = -1;
        this.f81028OooO0o0 = -1;
        int iOooO0Oo = C34696OooOOoo.OooO0Oo(j);
        int iOooO0OO = C34696OooOOoo.OooO0OO(j);
        String str = c34680OooO0O0.f124887OooOo0o;
        if (iOooO0Oo < 0 || iOooO0Oo > str.length()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(iOooO0Oo, "start (", ") offset is outside of text region ");
            sbOooO0OO.append(str.length());
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        if (iOooO0OO < 0 || iOooO0OO > str.length()) {
            StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(iOooO0OO, "end (", ") offset is outside of text region ");
            sbOooO0OO2.append(str.length());
            throw new IndexOutOfBoundsException(sbOooO0OO2.toString());
        }
        if (iOooO0Oo > iOooO0OO) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(iOooO0Oo, iOooO0OO, "Do not set reversed range: ", " > "));
        }
    }

    public final void OooO00o(int i, int i2) {
        long jOooO0OO = C25256OooO00o.OooO0OO(i, i2);
        this.f81024OooO00o.OooO0O0(i, i2, "");
        long jOooOO0 = OooOO0.OooOO0(C25256OooO00o.OooO0OO(this.f81025OooO0O0, this.f81026OooO0OO), jOooO0OO);
        OooO0oo(C34696OooOOoo.OooO0Oo(jOooOO0));
        OooO0oO(C34696OooOOoo.OooO0OO(jOooOO0));
        int i3 = this.f81027OooO0Oo;
        if (i3 != -1) {
            long jOooOO02 = OooOO0.OooOO0(C25256OooO00o.OooO0OO(i3, this.f81028OooO0o0), jOooO0OO);
            if (C34696OooOOoo.OooO0O0(jOooOO02)) {
                this.f81027OooO0Oo = -1;
                this.f81028OooO0o0 = -1;
            } else {
                this.f81027OooO0Oo = C34696OooOOoo.OooO0Oo(jOooOO02);
                this.f81028OooO0o0 = C34696OooOOoo.OooO0OO(jOooOO02);
            }
        }
    }

    public final char OooO0O0(int i) {
        C24055OooOo0O c24055OooOo0O = this.f81024OooO00o;
        C24049OooOO0o c24049OooOO0o = c24055OooOo0O.f81064OooO0O0;
        if (c24049OooOO0o != null && i >= c24055OooOo0O.f81065OooO0OO) {
            int iOooO00o = c24049OooOO0o.f81044OooO00o - c24049OooOO0o.OooO00o();
            int i2 = c24055OooOo0O.f81065OooO0OO;
            if (i >= iOooO00o + i2) {
                return c24055OooOo0O.f81063OooO00o.charAt(i - ((iOooO00o - c24055OooOo0O.f81066OooO0Oo) + i2));
            }
            int i3 = i - i2;
            int i4 = c24049OooOO0o.f81046OooO0OO;
            return i3 < i4 ? c24049OooOO0o.f81045OooO0O0[i3] : c24049OooOO0o.f81045OooO0O0[(i3 - i4) + c24049OooOO0o.f81047OooO0Oo];
        }
        return c24055OooOo0O.f81063OooO00o.charAt(i);
    }

    public final C34696OooOOoo OooO0OO() {
        int i = this.f81027OooO0Oo;
        if (i != -1) {
            return new C34696OooOOoo(C25256OooO00o.OooO0OO(i, this.f81028OooO0o0));
        }
        return null;
    }

    public final void OooO0Oo(int i, int i2, String text) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        C24055OooOo0O c24055OooOo0O = this.f81024OooO00o;
        if (i < 0 || i > c24055OooOo0O.OooO00o()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "start (", ") offset is outside of text region ");
            sbOooO0OO.append(c24055OooOo0O.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        if (i2 < 0 || i2 > c24055OooOo0O.OooO00o()) {
            StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(i2, "end (", ") offset is outside of text region ");
            sbOooO0OO2.append(c24055OooOo0O.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO0OO2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "Do not set reversed range: ", " > "));
        }
        c24055OooOo0O.OooO0O0(i, i2, text);
        OooO0oo(text.length() + i);
        OooO0oO(text.length() + i);
        this.f81027OooO0Oo = -1;
        this.f81028OooO0o0 = -1;
    }

    public final void OooO0o(int i, int i2) {
        C24055OooOo0O c24055OooOo0O = this.f81024OooO00o;
        if (i < 0 || i > c24055OooOo0O.OooO00o()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "start (", ") offset is outside of text region ");
            sbOooO0OO.append(c24055OooOo0O.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        if (i2 < 0 || i2 > c24055OooOo0O.OooO00o()) {
            StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(i2, "end (", ") offset is outside of text region ");
            sbOooO0OO2.append(c24055OooOo0O.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO0OO2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "Do not set reversed range: ", " > "));
        }
        OooO0oo(i);
        OooO0oO(i2);
    }

    public final void OooO0o0(int i, int i2) {
        C24055OooOo0O c24055OooOo0O = this.f81024OooO00o;
        if (i < 0 || i > c24055OooOo0O.OooO00o()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "start (", ") offset is outside of text region ");
            sbOooO0OO.append(c24055OooOo0O.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        if (i2 < 0 || i2 > c24055OooOo0O.OooO00o()) {
            StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(i2, "end (", ") offset is outside of text region ");
            sbOooO0OO2.append(c24055OooOo0O.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO0OO2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        this.f81027OooO0Oo = i;
        this.f81028OooO0o0 = i2;
    }

    public final void OooO0oO(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f81026OooO0OO = i;
    }

    public final void OooO0oo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f81025OooO0O0 = i;
    }

    public final String toString() {
        return this.f81024OooO00o.toString();
    }
}
