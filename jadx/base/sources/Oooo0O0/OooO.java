package Oooo0O0;

import Oooo0.o000000;
import Oooo0O0.OooO;
import OooooO0.C21289OooO0o;
import java.util.ArrayList;
import o00000.InterfaceC24054OooOo0;
import o00000o0.EnumC24118OooO0oO;
import o00o00O0.C25252OooO0Oo;
import o00o00Oo.C25256OooO00o;
import o0O0O00.C25869Oooo00O;
import oo0o0Oo.C34679OooO00o;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34682OooO0Oo;
import oo0o0Oo.C34683OooO0o;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO<T extends OooO<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34680OooO0O0 f60300OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f60301OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34695OooOOo0 f60302OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC24054OooOo0 f60303OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f60304OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C20943Oooo0oO f60305OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C34680OooO0O0 f60306OooO0oO;

    public OooO(C34680OooO0O0 c34680OooO0O0, long j, C34695OooOOo0 c34695OooOOo0, InterfaceC24054OooOo0 interfaceC24054OooOo0, C20943Oooo0oO c20943Oooo0oO) {
        this.f60300OooO00o = c34680OooO0O0;
        this.f60301OooO0O0 = j;
        this.f60302OooO0OO = c34695OooOOo0;
        this.f60303OooO0Oo = interfaceC24054OooOo0;
        this.f60305OooO0o0 = c20943Oooo0oO;
        this.f60304OooO0o = j;
        this.f60306OooO0oO = c34680OooO0O0;
    }

    public final void OooO() {
        Integer numValueOf = null;
        this.f60305OooO0o0.f60432OooO00o = null;
        if (this.f60306OooO0oO.f124887OooOo0o.length() > 0) {
            C34695OooOOo0 c34695OooOOo0 = this.f60302OooO0OO;
            if (c34695OooOOo0 != null) {
                int iOooO0Oo = C34696OooOOoo.OooO0Oo(this.f60304OooO0o);
                InterfaceC24054OooOo0 interfaceC24054OooOo0 = this.f60303OooO0Oo;
                numValueOf = Integer.valueOf(interfaceC24054OooOo0.OooO00o(c34695OooOOo0.OooO0oo(c34695OooOOo0.OooO0o(interfaceC24054OooOo0.OooO0O0(iOooO0Oo)))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                OooOO0O(iIntValue, iIntValue);
            }
        }
    }

    public final Integer OooO00o() {
        C34695OooOOo0 c34695OooOOo0 = this.f60302OooO0OO;
        if (c34695OooOOo0 == null) {
            return null;
        }
        int iOooO0OO = C34696OooOOoo.OooO0OO(this.f60304OooO0o);
        InterfaceC24054OooOo0 interfaceC24054OooOo0 = this.f60303OooO0Oo;
        return Integer.valueOf(interfaceC24054OooOo0.OooO00o(c34695OooOOo0.OooO0o0(c34695OooOOo0.OooO0o(interfaceC24054OooOo0.OooO0O0(iOooO0OO)), true)));
    }

    public final Integer OooO0O0() {
        int length;
        C34695OooOOo0 c34695OooOOo0 = this.f60302OooO0OO;
        if (c34695OooOOo0 == null) {
            return null;
        }
        int iOooOO0o = OooOO0o();
        while (true) {
            C34680OooO0O0 c34680OooO0O0 = this.f60300OooO00o;
            if (iOooOO0o < c34680OooO0O0.f124887OooOo0o.length()) {
                int length2 = this.f60306OooO0oO.f124887OooOo0o.length() - 1;
                if (iOooOO0o <= length2) {
                    length2 = iOooOO0o;
                }
                long jOooOO0o = c34695OooOOo0.OooOO0o(length2);
                int i = C34696OooOOoo.f124979OooO0OO;
                int i2 = (int) (jOooOO0o & 4294967295L);
                if (i2 > iOooOO0o) {
                    length = this.f60303OooO0Oo.OooO00o(i2);
                    break;
                }
                iOooOO0o++;
            } else {
                length = c34680OooO0O0.f124887OooOo0o.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer OooO0OO() {
        int iOooO00o;
        C34695OooOOo0 c34695OooOOo0 = this.f60302OooO0OO;
        if (c34695OooOOo0 == null) {
            return null;
        }
        int iOooOO0o = OooOO0o();
        while (true) {
            if (iOooOO0o <= 0) {
                iOooO00o = 0;
                break;
            }
            int length = this.f60306OooO0oO.f124887OooOo0o.length() - 1;
            if (iOooOO0o <= length) {
                length = iOooOO0o;
            }
            long jOooOO0o = c34695OooOOo0.OooOO0o(length);
            int i = C34696OooOOoo.f124979OooO0OO;
            int i2 = (int) (jOooOO0o >> 32);
            if (i2 < iOooOO0o) {
                iOooO00o = this.f60303OooO0Oo.OooO00o(i2);
                break;
            }
            iOooOO0o--;
        }
        return Integer.valueOf(iOooO00o);
    }

    public final boolean OooO0Oo() {
        C34695OooOOo0 c34695OooOOo0 = this.f60302OooO0OO;
        return (c34695OooOOo0 != null ? c34695OooOOo0.OooOO0O(OooOO0o()) : null) != EnumC24118OooO0oO.f81271OooOo;
    }

    public final void OooO0o() {
        this.f60305OooO0o0.f60432OooO00o = null;
        C34680OooO0O0 c34680OooO0O0 = this.f60306OooO0oO;
        if (c34680OooO0O0.f124887OooOo0o.length() > 0) {
            int iOooO0OO = o000000.OooO0OO(C34696OooOOoo.OooO0OO(this.f60304OooO0o), c34680OooO0O0.f124887OooOo0o);
            OooOO0O(iOooO0OO, iOooO0OO);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r4 <= (r5.f88258OooO0Oo.getLineLeft(r12) + (r12 == r5.f88260OooO0o0 - 1 ? r5.f88262OooO0oo : 0.0f))) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0o0(C34695OooOOo0 c34695OooOOo0, int i) {
        int iOooOO0o = OooOO0o();
        C20943Oooo0oO c20943Oooo0oO = this.f60305OooO0o0;
        if (c20943Oooo0oO.f60432OooO00o == null) {
            c20943Oooo0oO.f60432OooO00o = Float.valueOf(c34695OooOOo0.OooO0OO(iOooOO0o).f61724OooO00o);
        }
        int iOooO0o = c34695OooOOo0.OooO0o(iOooOO0o) + i;
        if (iOooO0o < 0) {
            return 0;
        }
        C34682OooO0Oo c34682OooO0Oo = c34695OooOOo0.f124973OooO0O0;
        if (iOooO0o >= c34682OooO0Oo.f124907OooO0o) {
            return this.f60306OooO0oO.f124887OooOo0o.length();
        }
        float fOooO0Oo = c34695OooOOo0.OooO0Oo(iOooO0o) - 1;
        Float f = c20943Oooo0oO.f60432OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(f);
        float fFloatValue = f.floatValue();
        if (OooO0Oo()) {
            c34682OooO0Oo.OooO0Oo(iOooO0o);
            ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
            C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(C25252OooO0Oo.OooOOOo(iOooO0o, arrayList));
            C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
            int i2 = iOooO0o - c34683OooO0o.f124914OooO0Oo;
            C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
            if (fFloatValue < c25869Oooo00O.f88258OooO0Oo.getLineRight(i2) + (i2 == c25869Oooo00O.f88260OooO0o0 - 1 ? c25869Oooo00O.f88254OooO : 0.0f)) {
                if (!OooO0Oo()) {
                    c34682OooO0Oo.OooO0Oo(iOooO0o);
                    ArrayList arrayList2 = c34682OooO0Oo.f124910OooO0oo;
                    C34683OooO0o c34683OooO0o2 = (C34683OooO0o) arrayList2.get(C25252OooO0Oo.OooOOOo(iOooO0o, arrayList2));
                    C34679OooO00o c34679OooO00o2 = c34683OooO0o2.f124911OooO00o;
                    int i3 = iOooO0o - c34683OooO0o2.f124914OooO0Oo;
                    C25869Oooo00O c25869Oooo00O2 = c34679OooO00o2.f124881OooO0Oo;
                }
                return this.f60303OooO0Oo.OooO00o(c34695OooOOo0.OooOO0(C21289OooO0o.OooO00o(f.floatValue(), fOooO0Oo)));
            }
        }
        return c34695OooOOo0.OooO0o0(iOooO0o, true);
    }

    public final void OooO0oO() {
        this.f60305OooO0o0.f60432OooO00o = null;
        C34680OooO0O0 c34680OooO0O0 = this.f60306OooO0oO;
        if (c34680OooO0O0.f124887OooOo0o.length() > 0) {
            int iOooO0Oo = C34696OooOOoo.OooO0Oo(this.f60304OooO0o);
            String str = c34680OooO0O0.f124887OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
            int i = iOooO0Oo - 1;
            while (true) {
                if (i <= 0) {
                    i = 0;
                    break;
                } else if (str.charAt(i - 1) == '\n') {
                    break;
                } else {
                    i--;
                }
            }
            OooOO0O(i, i);
        }
    }

    public final void OooO0oo() {
        Integer numOooO00o;
        this.f60305OooO0o0.f60432OooO00o = null;
        if (this.f60306OooO0oO.f124887OooOo0o.length() <= 0 || (numOooO00o = OooO00o()) == null) {
            return;
        }
        int iIntValue = numOooO00o.intValue();
        OooOO0O(iIntValue, iIntValue);
    }

    public final void OooOO0() {
        if (this.f60306OooO0oO.f124887OooOo0o.length() > 0) {
            int i = C34696OooOOoo.f124979OooO0OO;
            this.f60304OooO0o = C25256OooO00o.OooO0OO((int) (this.f60301OooO0O0 >> 32), (int) (this.f60304OooO0o & 4294967295L));
        }
    }

    public final void OooOO0O(int i, int i2) {
        this.f60304OooO0o = C25256OooO00o.OooO0OO(i, i2);
    }

    public final int OooOO0o() {
        long j = this.f60304OooO0o;
        int i = C34696OooOOoo.f124979OooO0OO;
        return this.f60303OooO0Oo.OooO0O0((int) (j & 4294967295L));
    }
}
