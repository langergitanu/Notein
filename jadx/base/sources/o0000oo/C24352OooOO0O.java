package o0000oo;

import o0000.C24041OooO0Oo;
import o0000oo.C24346OooO0Oo;

/* JADX INFO: renamed from: o0000oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24352OooOO0O extends C24353OooOO0o {
    @Override // o0000oo.C24348OooO0o0
    public final void OooO0O0(C24041OooO0Oo c24041OooO0Oo, boolean z) {
        super.OooO0O0(c24041OooO0Oo, z);
        if (this.f81931o00oO0o > 0) {
            C24348OooO0o0 c24348OooO0o0 = this.f81932oo000o[0];
            c24348OooO0o0.OooOooO();
            c24348OooO0o0.f82051Oooooo0 = 0.5f;
            c24348OooO0o0.f82049OooooOo = 0.5f;
            C24346OooO0Oo.OooO00o oooO00o = C24346OooO0Oo.OooO00o.f81964OooOo0o;
            c24348OooO0o0.OooO0o0(oooO00o, this, oooO00o, 0);
            C24346OooO0Oo.OooO00o oooO00o2 = C24346OooO0Oo.OooO00o.f81966OooOoO0;
            c24348OooO0o0.OooO0o0(oooO00o2, this, oooO00o2, 0);
            C24346OooO0Oo.OooO00o oooO00o3 = C24346OooO0Oo.OooO00o.f81963OooOo;
            c24348OooO0o0.OooO0o0(oooO00o3, this, oooO00o3, 0);
            C24346OooO0Oo.OooO00o oooO00o4 = C24346OooO0Oo.OooO00o.f81965OooOoO;
            c24348OooO0o0.OooO0o0(oooO00o4, this, oooO00o4, 0);
        }
    }

    @Override // o0000oo.C24353OooOO0o
    public final void OoooO(int i, int i2, int i3, int i4) {
        int iOooOOo0 = this.f82121o0OOO0o + this.f82122o0Oo0oo;
        int iOooOO0O = this.f82118o00oO0O + this.f82123o0ooOO0;
        if (this.f81931o00oO0o > 0) {
            iOooOOo0 += this.f81932oo000o[0].OooOOo0();
            iOooOO0O += this.f81932oo000o[0].OooOO0O();
        }
        int iMax = Math.max(this.f82047OooooO0, iOooOOo0);
        int iMax2 = Math.max(this.f82048OooooOO, iOooOO0O);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(iMax, i2) : i == 0 ? iMax : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(iMax2, i4) : i3 == 0 ? iMax2 : 0;
        }
        this.f82126oo0o0Oo = i2;
        this.f82119o0O0O00 = i4;
        Oooo0oo(i2);
        Oooo0o0(i4);
        this.f82120o0OO00O = this.f81931o00oO0o > 0;
    }
}
