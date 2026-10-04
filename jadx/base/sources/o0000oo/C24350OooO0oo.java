package o0000oo;

import java.util.ArrayList;
import o0000.C24041OooO0Oo;
import o0000.C24044OooO0oo;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24350OooO0oo extends C24348OooO0o0 {

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f82113o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public float f82114oo000o = -1.0f;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f82110o00oO0o = -1;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public int f82109o00oO0O = -1;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public C24346OooO0Oo f82111o0ooOO0 = this.f82030Oooo0OO;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f82112o0ooOOo = 0;

    public C24350OooO0oo() {
        this.f82038OoooO0O.clear();
        this.f82038OoooO0O.add(this.f82111o0ooOO0);
        int length = this.f82036OoooO0.length;
        for (int i = 0; i < length; i++) {
            this.f82036OoooO0[i] = this.f82111o0ooOO0;
        }
    }

    @Override // o0000oo.C24348OooO0o0
    public final C24346OooO0Oo OooO(C24346OooO0Oo.OooO00o oooO00o) {
        int iOrdinal = oooO00o.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f82112o0ooOOo == 0) {
                return this.f82111o0ooOO0;
            }
            return null;
        }
        if (this.f82112o0ooOOo == 1) {
            return this.f82111o0ooOO0;
        }
        return null;
    }

    @Override // o0000oo.C24348OooO0o0
    public final void OooO0O0(C24041OooO0Oo c24041OooO0Oo, boolean z) {
        C24347OooO0o c24347OooO0o = (C24347OooO0o) this.f82054o000oOoO;
        if (c24347OooO0o == null) {
            return;
        }
        Object objOooO = c24347OooO0o.OooO(C24346OooO0Oo.OooO00o.f81964OooOo0o);
        Object objOooO2 = c24347OooO0o.OooO(C24346OooO0Oo.OooO00o.f81966OooOoO0);
        C24348OooO0o0 c24348OooO0o0 = this.f82054o000oOoO;
        C24348OooO0o0.OooO00o oooO00o = C24348OooO0o0.OooO00o.f82062OooOo;
        boolean z2 = c24348OooO0o0 != null && c24348OooO0o0.f82039OoooOO0[0] == oooO00o;
        if (this.f82112o0ooOOo == 0) {
            objOooO = c24347OooO0o.OooO(C24346OooO0Oo.OooO00o.f81963OooOo);
            objOooO2 = c24347OooO0o.OooO(C24346OooO0Oo.OooO00o.f81965OooOoO);
            C24348OooO0o0 c24348OooO0o02 = this.f82054o000oOoO;
            z2 = c24348OooO0o02 != null && c24348OooO0o02.f82039OoooOO0[1] == oooO00o;
        }
        if (this.f82113o0ooOoO) {
            C24346OooO0Oo c24346OooO0Oo = this.f82111o0ooOO0;
            if (c24346OooO0Oo.f81957OooO0OO) {
                C24044OooO0oo c24044OooO0ooOooOO0O = c24041OooO0Oo.OooOO0O(c24346OooO0Oo);
                c24041OooO0Oo.OooO0Oo(c24044OooO0ooOooOO0O, this.f82111o0ooOO0.OooO0Oo());
                if (this.f82110o00oO0o != -1) {
                    if (z2) {
                        c24041OooO0Oo.OooO0o(c24041OooO0Oo.OooOO0O(objOooO2), c24044OooO0ooOooOO0O, 0, 5);
                    }
                } else if (this.f82109o00oO0O != -1 && z2) {
                    C24044OooO0oo c24044OooO0ooOooOO0O2 = c24041OooO0Oo.OooOO0O(objOooO2);
                    c24041OooO0Oo.OooO0o(c24044OooO0ooOooOO0O, c24041OooO0Oo.OooOO0O(objOooO), 0, 5);
                    c24041OooO0Oo.OooO0o(c24044OooO0ooOooOO0O2, c24044OooO0ooOooOO0O, 0, 5);
                }
                this.f82113o0ooOoO = false;
                return;
            }
        }
        if (this.f82110o00oO0o != -1) {
            C24044OooO0oo c24044OooO0ooOooOO0O3 = c24041OooO0Oo.OooOO0O(this.f82111o0ooOO0);
            c24041OooO0Oo.OooO0o0(c24044OooO0ooOooOO0O3, c24041OooO0Oo.OooOO0O(objOooO), this.f82110o00oO0o, 8);
            if (z2) {
                c24041OooO0Oo.OooO0o(c24041OooO0Oo.OooOO0O(objOooO2), c24044OooO0ooOooOO0O3, 0, 5);
                return;
            }
            return;
        }
        if (this.f82109o00oO0O != -1) {
            C24044OooO0oo c24044OooO0ooOooOO0O4 = c24041OooO0Oo.OooOO0O(this.f82111o0ooOO0);
            C24044OooO0oo c24044OooO0ooOooOO0O5 = c24041OooO0Oo.OooOO0O(objOooO2);
            c24041OooO0Oo.OooO0o0(c24044OooO0ooOooOO0O4, c24044OooO0ooOooOO0O5, -this.f82109o00oO0O, 8);
            if (z2) {
                c24041OooO0Oo.OooO0o(c24044OooO0ooOooOO0O4, c24041OooO0Oo.OooOO0O(objOooO), 0, 5);
                c24041OooO0Oo.OooO0o(c24044OooO0ooOooOO0O5, c24044OooO0ooOooOO0O4, 0, 5);
                return;
            }
            return;
        }
        if (this.f82114oo000o != -1.0f) {
            C24044OooO0oo c24044OooO0ooOooOO0O6 = c24041OooO0Oo.OooOO0O(this.f82111o0ooOO0);
            C24044OooO0oo c24044OooO0ooOooOO0O7 = c24041OooO0Oo.OooOO0O(objOooO2);
            float f = this.f82114oo000o;
            o0000.OooO0O0 oooO0O0OooOO0o = c24041OooO0Oo.OooOO0o();
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0ooOooOO0O6, -1.0f);
            oooO0O0OooOO0o.f80977OooO0Oo.OooOO0O(c24044OooO0ooOooOO0O7, f);
            c24041OooO0Oo.OooO0OO(oooO0O0OooOO0o);
        }
    }

    @Override // o0000oo.C24348OooO0o0
    public final boolean OooO0OO() {
        return true;
    }

    @Override // o0000oo.C24348OooO0o0
    public final boolean OooOoOO() {
        return this.f82113o0ooOoO;
    }

    @Override // o0000oo.C24348OooO0o0
    public final boolean OooOoo0() {
        return this.f82113o0ooOoO;
    }

    public final void OoooO0(int i) {
        this.f82111o0ooOO0.OooOO0o(i);
        this.f82113o0ooOoO = true;
    }

    @Override // o0000oo.C24348OooO0o0
    public final void OoooO00(C24041OooO0Oo c24041OooO0Oo, boolean z) {
        if (this.f82054o000oOoO == null) {
            return;
        }
        C24346OooO0Oo c24346OooO0Oo = this.f82111o0ooOO0;
        c24041OooO0Oo.getClass();
        int iOooOOO = C24041OooO0Oo.OooOOO(c24346OooO0Oo);
        if (this.f82112o0ooOOo == 1) {
            this.f82044OoooOoo = iOooOOO;
            this.f82045Ooooo00 = 0;
            Oooo0o0(this.f82054o000oOoO.OooOO0O());
            Oooo0oo(0);
            return;
        }
        this.f82044OoooOoo = 0;
        this.f82045Ooooo00 = iOooOOO;
        Oooo0oo(this.f82054o000oOoO.OooOOo0());
        Oooo0o0(0);
    }

    public final void OoooO0O(int i) {
        if (this.f82112o0ooOOo == i) {
            return;
        }
        this.f82112o0ooOOo = i;
        ArrayList<C24346OooO0Oo> arrayList = this.f82038OoooO0O;
        arrayList.clear();
        if (this.f82112o0ooOOo == 1) {
            this.f82111o0ooOO0 = this.f82029Oooo0O0;
        } else {
            this.f82111o0ooOO0 = this.f82030Oooo0OO;
        }
        arrayList.add(this.f82111o0ooOO0);
        C24346OooO0Oo[] c24346OooO0OoArr = this.f82036OoooO0;
        int length = c24346OooO0OoArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c24346OooO0OoArr[i2] = this.f82111o0ooOO0;
        }
    }
}
