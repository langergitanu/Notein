package o00000;

import Oooo0.C20855OooooOO;
import OooooOO.C21354OoooooO;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: renamed from: o00000.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24055OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f81063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C24049OooOO0o f81064OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f81065OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f81066OooO0Oo;

    public final int OooO00o() {
        C24049OooOO0o c24049OooOO0o = this.f81064OooO0O0;
        if (c24049OooOO0o == null) {
            return this.f81063OooO00o.length();
        }
        return (c24049OooOO0o.f81044OooO00o - c24049OooOO0o.OooO00o()) + (this.f81063OooO00o.length() - (this.f81066OooO0Oo - this.f81065OooO0OO));
    }

    public final void OooO0O0(int i, int i2, String text) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        if (i > i2) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "start index must be less than or equal to end index: ", " > ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "start must be non-negative, but was ").toString());
        }
        C24049OooOO0o c24049OooOO0o = this.f81064OooO0O0;
        if (c24049OooOO0o == null) {
            int iMax = Math.max(255, text.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.f81063OooO00o.length() - i2, 64);
            int i3 = i - iMin;
            C21354OoooooO.OooO0O0(this.f81063OooO00o, 0, cArr, i3, i);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            C21354OoooooO.OooO0O0(this.f81063OooO00o, i4, cArr, i2, i5);
            text.getChars(0, text.length(), cArr, iMin);
            int length = text.length() + iMin;
            C24049OooOO0o c24049OooOO0o2 = new C24049OooOO0o();
            c24049OooOO0o2.f81044OooO00o = iMax;
            c24049OooOO0o2.f81045OooO0O0 = cArr;
            c24049OooOO0o2.f81046OooO0OO = length;
            c24049OooOO0o2.f81047OooO0Oo = i4;
            this.f81064OooO0O0 = c24049OooOO0o2;
            this.f81065OooO0OO = i3;
            this.f81066OooO0Oo = i5;
            return;
        }
        int i6 = this.f81065OooO0OO;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > c24049OooOO0o.f81044OooO00o - c24049OooOO0o.OooO00o()) {
            this.f81063OooO00o = toString();
            this.f81064OooO0O0 = null;
            this.f81065OooO0OO = -1;
            this.f81066OooO0Oo = -1;
            OooO0O0(i, i2, text);
            return;
        }
        int length2 = text.length() - (i8 - i7);
        if (length2 > c24049OooOO0o.OooO00o()) {
            int iOooO00o = length2 - c24049OooOO0o.OooO00o();
            int i9 = c24049OooOO0o.f81044OooO00o;
            do {
                i9 *= 2;
            } while (i9 - c24049OooOO0o.f81044OooO00o < iOooO00o);
            char[] cArr2 = new char[i9];
            Oooo.OooO0OO.OooO0o(c24049OooOO0o.f81045OooO0O0, 0, 0, cArr2, c24049OooOO0o.f81046OooO0OO);
            int i10 = c24049OooOO0o.f81044OooO00o;
            int i11 = c24049OooOO0o.f81047OooO0Oo;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            Oooo.OooO0OO.OooO0o(c24049OooOO0o.f81045OooO0O0, i13, i11, cArr2, i12 + i11);
            c24049OooOO0o.f81045OooO0O0 = cArr2;
            c24049OooOO0o.f81044OooO00o = i9;
            c24049OooOO0o.f81047OooO0Oo = i13;
        }
        int i14 = c24049OooOO0o.f81046OooO0OO;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = c24049OooOO0o.f81045OooO0O0;
            Oooo.OooO0OO.OooO0o(cArr3, c24049OooOO0o.f81047OooO0Oo - i15, i8, cArr3, i14);
            c24049OooOO0o.f81046OooO0OO = i7;
            c24049OooOO0o.f81047OooO0Oo -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iOooO00o2 = c24049OooOO0o.OooO00o() + i7;
            int iOooO00o3 = c24049OooOO0o.OooO00o() + i8;
            int i16 = c24049OooOO0o.f81047OooO0Oo;
            char[] cArr4 = c24049OooOO0o.f81045OooO0O0;
            Oooo.OooO0OO.OooO0o(cArr4, c24049OooOO0o.f81046OooO0OO, i16, cArr4, iOooO00o2);
            c24049OooOO0o.f81046OooO0OO += iOooO00o2 - i16;
            c24049OooOO0o.f81047OooO0Oo = iOooO00o3;
        } else {
            c24049OooOO0o.f81047OooO0Oo = c24049OooOO0o.OooO00o() + i8;
            c24049OooOO0o.f81046OooO0OO = i7;
        }
        text.getChars(0, text.length(), c24049OooOO0o.f81045OooO0O0, c24049OooOO0o.f81046OooO0OO);
        c24049OooOO0o.f81046OooO0OO = text.length() + c24049OooOO0o.f81046OooO0OO;
    }

    public final String toString() {
        C24049OooOO0o c24049OooOO0o = this.f81064OooO0O0;
        if (c24049OooOO0o == null) {
            return this.f81063OooO00o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f81063OooO00o, 0, this.f81065OooO0OO);
        sb.append(c24049OooOO0o.f81045OooO0O0, 0, c24049OooOO0o.f81046OooO0OO);
        char[] cArr = c24049OooOO0o.f81045OooO0O0;
        int i = c24049OooOO0o.f81047OooO0Oo;
        sb.append(cArr, i, c24049OooOO0o.f81044OooO00o - i);
        String str = this.f81063OooO00o;
        sb.append((CharSequence) str, this.f81066OooO0Oo, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
        return string;
    }
}
