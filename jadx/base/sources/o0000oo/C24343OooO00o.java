package o0000oo;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22218Oooo;
import o0000.C24041OooO0Oo;
import o0000.C24044OooO0oo;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24343OooO00o extends C24342OooO {

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public int f81933o00oO0O = 0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f81934o0ooOO0 = true;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f81935o0ooOOo = 0;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f81936o0ooOoO = false;

    @Override // o0000oo.C24348OooO0o0
    public final void OooO0O0(C24041OooO0Oo c24041OooO0Oo, boolean z) {
        boolean z2;
        int i;
        C24346OooO0Oo[] c24346OooO0OoArr = this.f82036OoooO0;
        C24346OooO0Oo c24346OooO0Oo = this.f82029Oooo0O0;
        c24346OooO0OoArr[0] = c24346OooO0Oo;
        C24346OooO0Oo c24346OooO0Oo2 = this.f82030Oooo0OO;
        int i2 = 2;
        c24346OooO0OoArr[2] = c24346OooO0Oo2;
        C24346OooO0Oo c24346OooO0Oo3 = this.f82032Oooo0o0;
        c24346OooO0OoArr[1] = c24346OooO0Oo3;
        C24346OooO0Oo c24346OooO0Oo4 = this.f82031Oooo0o;
        c24346OooO0OoArr[3] = c24346OooO0Oo4;
        for (C24346OooO0Oo c24346OooO0Oo5 : c24346OooO0OoArr) {
            c24346OooO0Oo5.f81954OooO = c24041OooO0Oo.OooOO0O(c24346OooO0Oo5);
        }
        int i3 = this.f81933o00oO0O;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        C24346OooO0Oo c24346OooO0Oo6 = c24346OooO0OoArr[i3];
        if (!this.f81936o0ooOoO) {
            OoooO();
        }
        if (this.f81936o0ooOoO) {
            this.f81936o0ooOoO = false;
            int i4 = this.f81933o00oO0O;
            if (i4 == 0 || i4 == 1) {
                c24041OooO0Oo.OooO0Oo(c24346OooO0Oo.f81954OooO, this.f82044OoooOoo);
                c24041OooO0Oo.OooO0Oo(c24346OooO0Oo3.f81954OooO, this.f82044OoooOoo);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    c24041OooO0Oo.OooO0Oo(c24346OooO0Oo2.f81954OooO, this.f82045Ooooo00);
                    c24041OooO0Oo.OooO0Oo(c24346OooO0Oo4.f81954OooO, this.f82045Ooooo00);
                    return;
                }
                return;
            }
        }
        for (int i5 = 0; i5 < this.f81931o00oO0o; i5++) {
            C24348OooO0o0 c24348OooO0o0 = this.f81932oo000o[i5];
            if (this.f81934o0ooOO0 || c24348OooO0o0.OooO0OO()) {
                int i6 = this.f81933o00oO0O;
                C24348OooO0o0.OooO00o oooO00o = C24348OooO0o0.OooO00o.f82065OooOoO0;
                if (((i6 == 0 || i6 == 1) && c24348OooO0o0.f82039OoooOO0[0] == oooO00o && c24348OooO0o0.f82029Oooo0O0.f81959OooO0o != null && c24348OooO0o0.f82032Oooo0o0.f81959OooO0o != null) || ((i6 == 2 || i6 == 3) && c24348OooO0o0.f82039OoooOO0[1] == oooO00o && c24348OooO0o0.f82030Oooo0OO.f81959OooO0o != null && c24348OooO0o0.f82031Oooo0o.f81959OooO0o != null)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = c24346OooO0Oo.OooO0oO() || c24346OooO0Oo3.OooO0oO();
        boolean z4 = c24346OooO0Oo2.OooO0oO() || c24346OooO0Oo4.OooO0oO();
        int i7 = (z2 || !(((i = this.f81933o00oO0O) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f81931o00oO0o) {
            C24348OooO0o0 c24348OooO0o02 = this.f81932oo000o[i8];
            if (this.f81934o0ooOO0 || c24348OooO0o02.OooO0OO()) {
                C24044OooO0oo c24044OooO0ooOooOO0O = c24041OooO0Oo.OooOO0O(c24348OooO0o02.f82036OoooO0[this.f81933o00oO0O]);
                int i9 = this.f81933o00oO0O;
                C24346OooO0Oo c24346OooO0Oo7 = c24348OooO0o02.f82036OoooO0[i9];
                c24346OooO0Oo7.f81954OooO = c24044OooO0ooOooOO0O;
                C24346OooO0Oo c24346OooO0Oo8 = c24346OooO0Oo7.f81959OooO0o;
                int i10 = (c24346OooO0Oo8 == null || c24346OooO0Oo8.f81958OooO0Oo != this) ? 0 : c24346OooO0Oo7.f81961OooO0oO;
                if (i9 == 0 || i9 == i2) {
                    C24044OooO0oo c24044OooO0oo = c24346OooO0Oo6.f81954OooO;
                    int i11 = this.f81935o0ooOOo - i10;
                    o0000.OooO0O0 oooO0O0OooOO0o = c24041OooO0Oo.OooOO0o();
                    C24044OooO0oo c24044OooO0ooOooOOO0 = c24041OooO0Oo.OooOOO0();
                    c24044OooO0ooOooOOO0.f81009OooOoO = 0;
                    oooO0O0OooOO0o.OooO0Oo(c24044OooO0oo, c24044OooO0ooOooOO0O, c24044OooO0ooOooOOO0, i11);
                    c24041OooO0Oo.OooO0OO(oooO0O0OooOO0o);
                } else {
                    C24044OooO0oo c24044OooO0oo2 = c24346OooO0Oo6.f81954OooO;
                    int i12 = this.f81935o0ooOOo + i10;
                    o0000.OooO0O0 oooO0O0OooOO0o2 = c24041OooO0Oo.OooOO0o();
                    C24044OooO0oo c24044OooO0ooOooOOO02 = c24041OooO0Oo.OooOOO0();
                    c24044OooO0ooOooOOO02.f81009OooOoO = 0;
                    oooO0O0OooOO0o2.OooO0OO(c24044OooO0oo2, c24044OooO0ooOooOO0O, c24044OooO0ooOooOOO02, i12);
                    c24041OooO0Oo.OooO0OO(oooO0O0OooOO0o2);
                }
                c24041OooO0Oo.OooO0o0(c24346OooO0Oo6.f81954OooO, c24044OooO0ooOooOO0O, this.f81935o0ooOOo + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.f81933o00oO0O;
        if (i13 == 0) {
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo3.f81954OooO, c24346OooO0Oo.f81954OooO, 0, 8);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo.f81954OooO, this.f82054o000oOoO.f82032Oooo0o0.f81954OooO, 0, 4);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo.f81954OooO, this.f82054o000oOoO.f82029Oooo0O0.f81954OooO, 0, 0);
            return;
        }
        if (i13 == 1) {
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo.f81954OooO, c24346OooO0Oo3.f81954OooO, 0, 8);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo.f81954OooO, this.f82054o000oOoO.f82029Oooo0O0.f81954OooO, 0, 4);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo.f81954OooO, this.f82054o000oOoO.f82032Oooo0o0.f81954OooO, 0, 0);
        } else if (i13 == 2) {
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo4.f81954OooO, c24346OooO0Oo2.f81954OooO, 0, 8);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo2.f81954OooO, this.f82054o000oOoO.f82031Oooo0o.f81954OooO, 0, 4);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo2.f81954OooO, this.f82054o000oOoO.f82030Oooo0OO.f81954OooO, 0, 0);
        } else if (i13 == 3) {
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo2.f81954OooO, c24346OooO0Oo4.f81954OooO, 0, 8);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo2.f81954OooO, this.f82054o000oOoO.f82030Oooo0OO.f81954OooO, 0, 4);
            c24041OooO0Oo.OooO0o0(c24346OooO0Oo2.f81954OooO, this.f82054o000oOoO.f82031Oooo0o.f81954OooO, 0, 0);
        }
    }

    @Override // o0000oo.C24348OooO0o0
    public final boolean OooO0OO() {
        return true;
    }

    @Override // o0000oo.C24348OooO0o0
    public final boolean OooOoOO() {
        return this.f81936o0ooOoO;
    }

    @Override // o0000oo.C24348OooO0o0
    public final boolean OooOoo0() {
        return this.f81936o0ooOoO;
    }

    public final boolean OoooO() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f81931o00oO0o;
            if (i4 >= i) {
                break;
            }
            C24348OooO0o0 c24348OooO0o0 = this.f81932oo000o[i4];
            if ((this.f81934o0ooOO0 || c24348OooO0o0.OooO0OO()) && ((((i2 = this.f81933o00oO0O) == 0 || i2 == 1) && !c24348OooO0o0.OooOoOO()) || (((i3 = this.f81933o00oO0O) == 2 || i3 == 3) && !c24348OooO0o0.OooOoo0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f81931o00oO0o; i5++) {
            C24348OooO0o0 c24348OooO0o02 = this.f81932oo000o[i5];
            if (this.f81934o0ooOO0 || c24348OooO0o02.OooO0OO()) {
                C24346OooO0Oo.OooO00o oooO00o = C24346OooO0Oo.OooO00o.f81965OooOoO;
                C24346OooO0Oo.OooO00o oooO00o2 = C24346OooO0Oo.OooO00o.f81963OooOo;
                C24346OooO0Oo.OooO00o oooO00o3 = C24346OooO0Oo.OooO00o.f81966OooOoO0;
                C24346OooO0Oo.OooO00o oooO00o4 = C24346OooO0Oo.OooO00o.f81964OooOo0o;
                if (!z2) {
                    int i6 = this.f81933o00oO0O;
                    if (i6 == 0) {
                        iMax = c24348OooO0o02.OooO(oooO00o4).OooO0Oo();
                    } else if (i6 == 1) {
                        iMax = c24348OooO0o02.OooO(oooO00o3).OooO0Oo();
                    } else if (i6 == 2) {
                        iMax = c24348OooO0o02.OooO(oooO00o2).OooO0Oo();
                    } else if (i6 == 3) {
                        iMax = c24348OooO0o02.OooO(oooO00o).OooO0Oo();
                    }
                    z2 = true;
                }
                int i7 = this.f81933o00oO0O;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c24348OooO0o02.OooO(oooO00o4).OooO0Oo());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c24348OooO0o02.OooO(oooO00o3).OooO0Oo());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c24348OooO0o02.OooO(oooO00o2).OooO0Oo());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c24348OooO0o02.OooO(oooO00o).OooO0Oo());
                }
            }
        }
        int i8 = iMax + this.f81935o0ooOOo;
        int i9 = this.f81933o00oO0O;
        if (i9 == 0 || i9 == 1) {
            Oooo0O0(i8, i8);
        } else {
            Oooo0OO(i8, i8);
        }
        this.f81936o0ooOoO = true;
        return true;
    }

    public final int OoooOO0() {
        int i = this.f81933o00oO0O;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // o0000oo.C24348OooO0o0
    public final String toString() {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("[Barrier] "), this.f82053Ooooooo, " {");
        for (int i = 0; i < this.f81931o00oO0o; i++) {
            C24348OooO0o0 c24348OooO0o0 = this.f81932oo000o[i];
            if (i > 0) {
                strOooO0OO = C21111o0ooOoO.OooO0Oo(strOooO0OO, ", ");
            }
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strOooO0OO);
            sbOooO0OO.append(c24348OooO0o0.f82053Ooooooo);
            strOooO0OO = sbOooO0OO.toString();
        }
        return C21111o0ooOoO.OooO0Oo(strOooO0OO, "}");
    }
}
