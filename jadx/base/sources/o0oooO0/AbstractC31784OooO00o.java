package o0oooO0;

import java.io.IOException;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooOoo.InterfaceC31672OooO0Oo;

/* JADX INFO: renamed from: o0oooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31784OooO00o implements InterfaceC31672OooO0Oo {
    public static AbstractC31784OooO00o OooO00o(AbstractC31434OooO0O0 abstractC31434OooO0O0) throws IOException {
        if (abstractC31434OooO0O0 == null) {
            return null;
        }
        if (abstractC31434OooO0O0 instanceof C31433OooO00o) {
            C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0;
            if (c31433OooO00o.f112214OooOo.size() > 1 && (c31433OooO00o.Oooo0OO(1) instanceof C31441OooOO0)) {
                C31441OooOO0 c31441OooOO0 = (C31441OooOO0) c31433OooO00o.Oooo0OO(1);
                String str = c31441OooOO0.f112461OooOo;
                if (str.equals("Fit") || str.equals("FitB")) {
                    return new C31787OooO0Oo(c31433OooO00o);
                }
                if (str.equals("FitV") || str.equals("FitBV")) {
                    return new C31789OooO0o0(c31433OooO00o);
                }
                if (str.equals("FitR")) {
                    return new C31788OooO0o(c31433OooO00o);
                }
                if (str.equals("FitH") || str.equals("FitBH")) {
                    return new C31790OooO0oO(c31433OooO00o);
                }
                if (str.equals("XYZ")) {
                    return new C31791OooO0oo(c31433OooO00o);
                }
                throw new IOException("Unknown destination type: " + c31441OooOO0.f112461OooOo);
            }
        }
        if (abstractC31434OooO0O0 instanceof C31450OooOOoo) {
            C31785OooO0O0 c31785OooO0O0 = new C31785OooO0O0();
            c31785OooO0O0.f113420OooOo0o = (C31450OooOOoo) abstractC31434OooO0O0;
            return c31785OooO0O0;
        }
        if (abstractC31434OooO0O0 instanceof C31441OooOO0) {
            C31785OooO0O0 c31785OooO0O02 = new C31785OooO0O0();
            c31785OooO0O02.f113420OooOo0o = (C31441OooOO0) abstractC31434OooO0O0;
            return c31785OooO0O02;
        }
        throw new IOException("Error: can't convert to Destination " + abstractC31434OooO0O0);
    }
}
