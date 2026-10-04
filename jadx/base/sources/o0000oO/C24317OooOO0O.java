package o0000oO;

import java.util.Iterator;
import o0000oO.C24312OooO0o;
import o0000oo.C24343OooO00o;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24317OooOO0O extends AbstractC24322OooOOOo {
    @Override // o0000oO.AbstractC24322OooOOOo, o0000oO.InterfaceC24311OooO0Oo
    public final void OooO00o(InterfaceC24311OooO0Oo interfaceC24311OooO0Oo) {
        C24343OooO00o c24343OooO00o = (C24343OooO00o) this.f81876OooO0O0;
        int i = c24343OooO00o.f81933o00oO0O;
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        Iterator it = c24312OooO0o.f81843OooOO0o.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C24312OooO0o) it.next()).f81839OooO0oO;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c24312OooO0o.OooO0Oo(i3 + c24343OooO00o.f81935o0ooOOo);
        } else {
            c24312OooO0o.OooO0Oo(i2 + c24343OooO00o.f81935o0ooOOo);
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0Oo() {
        C24348OooO0o0 c24348OooO0o0 = this.f81876OooO0O0;
        if (c24348OooO0o0 instanceof C24343OooO00o) {
            C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
            c24312OooO0o.f81834OooO0O0 = true;
            C24343OooO00o c24343OooO00o = (C24343OooO00o) c24348OooO0o0;
            int i = c24343OooO00o.f81933o00oO0O;
            boolean z = c24343OooO00o.f81934o0ooOO0;
            int i2 = 0;
            if (i == 0) {
                c24312OooO0o.f81838OooO0o0 = C24312OooO0o.OooO00o.f81846OooOoO;
                while (i2 < c24343OooO00o.f81931o00oO0o) {
                    C24348OooO0o0 c24348OooO0o02 = c24343OooO00o.f81932oo000o[i2];
                    if (z || c24348OooO0o02.f82052OoooooO != 8) {
                        C24312OooO0o c24312OooO0o2 = c24348OooO0o02.f81997OooO0Oo.f81882OooO0oo;
                        c24312OooO0o2.f81842OooOO0O.add(c24312OooO0o);
                        c24312OooO0o.f81843OooOO0o.add(c24312OooO0o2);
                    }
                    i2++;
                }
                OooOOO0(this.f81876OooO0O0.f81997OooO0Oo.f81882OooO0oo);
                OooOOO0(this.f81876OooO0O0.f81997OooO0Oo.f81874OooO);
                return;
            }
            if (i == 1) {
                c24312OooO0o.f81838OooO0o0 = C24312OooO0o.OooO00o.f81848OooOoOO;
                while (i2 < c24343OooO00o.f81931o00oO0o) {
                    C24348OooO0o0 c24348OooO0o03 = c24343OooO00o.f81932oo000o[i2];
                    if (z || c24348OooO0o03.f82052OoooooO != 8) {
                        C24312OooO0o c24312OooO0o3 = c24348OooO0o03.f81997OooO0Oo.f81874OooO;
                        c24312OooO0o3.f81842OooOO0O.add(c24312OooO0o);
                        c24312OooO0o.f81843OooOO0o.add(c24312OooO0o3);
                    }
                    i2++;
                }
                OooOOO0(this.f81876OooO0O0.f81997OooO0Oo.f81882OooO0oo);
                OooOOO0(this.f81876OooO0O0.f81997OooO0Oo.f81874OooO);
                return;
            }
            if (i == 2) {
                c24312OooO0o.f81838OooO0o0 = C24312OooO0o.OooO00o.f81850OooOoo0;
                while (i2 < c24343OooO00o.f81931o00oO0o) {
                    C24348OooO0o0 c24348OooO0o04 = c24343OooO00o.f81932oo000o[i2];
                    if (z || c24348OooO0o04.f82052OoooooO != 8) {
                        C24312OooO0o c24312OooO0o4 = c24348OooO0o04.f81999OooO0o0.f81882OooO0oo;
                        c24312OooO0o4.f81842OooOO0O.add(c24312OooO0o);
                        c24312OooO0o.f81843OooOO0o.add(c24312OooO0o4);
                    }
                    i2++;
                }
                OooOOO0(this.f81876OooO0O0.f81999OooO0o0.f81882OooO0oo);
                OooOOO0(this.f81876OooO0O0.f81999OooO0o0.f81874OooO);
                return;
            }
            if (i != 3) {
                return;
            }
            c24312OooO0o.f81838OooO0o0 = C24312OooO0o.OooO00o.f81849OooOoo;
            while (i2 < c24343OooO00o.f81931o00oO0o) {
                C24348OooO0o0 c24348OooO0o05 = c24343OooO00o.f81932oo000o[i2];
                if (z || c24348OooO0o05.f82052OoooooO != 8) {
                    C24312OooO0o c24312OooO0o5 = c24348OooO0o05.f81999OooO0o0.f81874OooO;
                    c24312OooO0o5.f81842OooOO0O.add(c24312OooO0o);
                    c24312OooO0o.f81843OooOO0o.add(c24312OooO0o5);
                }
                i2++;
            }
            OooOOO0(this.f81876OooO0O0.f81999OooO0o0.f81882OooO0oo);
            OooOOO0(this.f81876OooO0O0.f81999OooO0o0.f81874OooO);
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o() {
        this.f81877OooO0OO = null;
        this.f81882OooO0oo.OooO0OO();
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o0() {
        C24348OooO0o0 c24348OooO0o0 = this.f81876OooO0O0;
        if (c24348OooO0o0 instanceof C24343OooO00o) {
            int i = ((C24343OooO00o) c24348OooO0o0).f81933o00oO0O;
            C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
            if (i == 0 || i == 1) {
                c24348OooO0o0.f82044OoooOoo = c24312OooO0o.f81839OooO0oO;
            } else {
                c24348OooO0o0.f82045Ooooo00 = c24312OooO0o.f81839OooO0oO;
            }
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final boolean OooOO0O() {
        return false;
    }

    public final void OooOOO0(C24312OooO0o c24312OooO0o) {
        C24312OooO0o c24312OooO0o2 = this.f81882OooO0oo;
        c24312OooO0o2.f81842OooOO0O.add(c24312OooO0o);
        c24312OooO0o.f81843OooOO0o.add(c24312OooO0o2);
    }
}
