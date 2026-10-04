package o00O;

import com.airbnb.lottie.C22142OooO0oo;
import java.io.IOException;
import java.util.ArrayList;
import o00O0oO.C24942OooO00o;
import o00O0oOo.C24947OooO;
import o00O0oOo.C24949OooO0O0;
import o00O0oOo.C24953OooO0o0;
import o00O0oOo.InterfaceC24957OooOO0O;
import o00OO000.C24982OooO0Oo;
import o00OO000.OooO0OO;
import o00OO00O.C24986OooO0oo;
import o00OO00o.C24988OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84003OooO00o = OooO0OO.OooO00o.OooO00o("k", "x", "y");

    public static C24953OooO0o0 OooO00o(C24982OooO0Oo c24982OooO0Oo, C22142OooO0oo c22142OooO0oo) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (c24982OooO0Oo.ooOO() == OooO0OO.OooO0O0.f84726OooOo0o) {
            c24982OooO0Oo.OooO00o();
            while (c24982OooO0Oo.OooOooo()) {
                C24982OooO0Oo c24982OooO0Oo2 = c24982OooO0Oo;
                C22142OooO0oo c22142OooO0oo2 = c22142OooO0oo;
                arrayList.add(new C24942OooO00o(c22142OooO0oo2, C24781OooOOoo.OooO0O0(c24982OooO0Oo2, c22142OooO0oo2, C24986OooO0oo.OooO0O0(), OooOo.f84035OooO00o, c24982OooO0Oo.ooOO() == OooO0OO.OooO0O0.f84728OooOoO0, false)));
                c24982OooO0Oo = c24982OooO0Oo2;
                c22142OooO0oo = c22142OooO0oo2;
            }
            c24982OooO0Oo.OooOOO0();
            OooOo00.OooO0O0(arrayList);
        } else {
            arrayList.add(new C24988OooO00o(C24779OooOOo.OooO0O0(c24982OooO0Oo, C24986OooO0oo.OooO0O0())));
        }
        return new C24953OooO0o0(arrayList);
    }

    public static InterfaceC24957OooOO0O OooO0O0(C24982OooO0Oo c24982OooO0Oo, C22142OooO0oo c22142OooO0oo) throws IOException {
        c24982OooO0Oo.OooO0OO();
        C24953OooO0o0 c24953OooO0o0OooO00o = null;
        C24949OooO0O0 c24949OooO0O0OooO0O0 = null;
        boolean z = false;
        C24949OooO0O0 c24949OooO0O0OooO0O02 = null;
        while (c24982OooO0Oo.ooOO() != OooO0OO.OooO0O0.f84727OooOoO) {
            int iO0Oo0oo = c24982OooO0Oo.o0Oo0oo(f84003OooO00o);
            if (iO0Oo0oo != 0) {
                OooO0OO.OooO0O0 oooO0O0 = OooO0OO.OooO0O0.f84731OooOoo0;
                if (iO0Oo0oo != 1) {
                    if (iO0Oo0oo != 2) {
                        c24982OooO0Oo.o00000OO();
                        c24982OooO0Oo.o00000oO();
                    } else if (c24982OooO0Oo.ooOO() == oooO0O0) {
                        c24982OooO0Oo.o00000oO();
                        z = true;
                    } else {
                        c24949OooO0O0OooO0O0 = C24773OooO0Oo.OooO0O0(c24982OooO0Oo, c22142OooO0oo, true);
                    }
                } else if (c24982OooO0Oo.ooOO() == oooO0O0) {
                    c24982OooO0Oo.o00000oO();
                    z = true;
                } else {
                    c24949OooO0O0OooO0O02 = C24773OooO0Oo.OooO0O0(c24982OooO0Oo, c22142OooO0oo, true);
                }
            } else {
                c24953OooO0o0OooO00o = OooO00o(c24982OooO0Oo, c22142OooO0oo);
            }
        }
        c24982OooO0Oo.OooOOo0();
        if (z) {
            c22142OooO0oo.OooO00o("Lottie doesn't support expressions.");
        }
        return c24953OooO0o0OooO00o != null ? c24953OooO0o0OooO00o : new C24947OooO(c24949OooO0O0OooO0O02, c24949OooO0O0OooO0O0);
    }
}
