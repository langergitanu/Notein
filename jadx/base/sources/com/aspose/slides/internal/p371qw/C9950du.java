package com.aspose.slides.internal.p371qw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p022ai.C1381up;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p051bz.C1918lr;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p150gi.C4261ar;
import com.aspose.slides.internal.p150gi.C4289qw;
import com.aspose.slides.internal.p150gi.C4292ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p481wp.C12232rv;
import com.aspose.slides.internal.p481wp.C12239wl;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9950du {

    /* JADX INFO: renamed from: k4 */
    private C12232rv f35871k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1380to f35874x1;

    /* JADX INFO: renamed from: kk */
    private List<C12239wl> f35872kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<InterfaceC1984kk> f35873to = new List<>();

    /* JADX INFO: renamed from: du */
    private int f35870du = 0;

    public C9950du(C12232rv c12232rv) {
        this.f35871k4 = c12232rv;
        this.f35874x1 = C1381up.m8173k4(c12232rv);
        m48918x1();
        m48916kk();
    }

    /* JADX INFO: renamed from: x1 */
    private int m48917x1(int i, InterfaceC1981h4 interfaceC1981h4) {
        int iMo9886x1 = 0;
        while (true) {
            i--;
            if (i < 0) {
                return iMo9886x1;
            }
            int size = i < this.f35873to.size() ? i : this.f35873to.size() - 1;
            if (this.f35873to.get_Item(size) != null) {
                iMo9886x1 = this.f35873to.get_Item(size).mo9886x1(interfaceC1981h4) + iMo9886x1;
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final boolean m48919du(InterfaceC1981h4 interfaceC1981h4) {
        int iM48922k4 = m48922k4();
        for (int i = 1; i <= iM48922k4; i++) {
            C12239wl c12239wlM48925k4 = m48925k4(i);
            if ((!c12239wlM48925k4.m57159ts().mo9883kk() || c12239wlM48925k4.m57159ts().mo9886x1(interfaceC1981h4) == 0) && !C7019kk.m27469x1(c12239wlM48925k4.m57159ts(), C4292ss.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m48920k4(C9959up c9959up) {
        return m48921k4(c9959up, c9959up.mo48944dy());
    }

    /* JADX INFO: renamed from: kk */
    public final int m48926kk(InterfaceC1981h4 interfaceC1981h4) {
        int iM48922k4 = m48922k4();
        int iMo9886x1 = 0;
        for (int i = 1; i <= iM48922k4; i++) {
            C12239wl c12239wlM48925k4 = m48925k4(i);
            if (c12239wlM48925k4.m57159ts().mo9883kk() && c12239wlM48925k4.m57159ts().mo9886x1(interfaceC1981h4) != 0) {
                iMo9886x1 = c12239wlM48925k4.m57159ts().mo9886x1(interfaceC1981h4) + iMo9886x1;
            }
        }
        return iMo9886x1;
    }

    /* JADX INFO: renamed from: to */
    public final void m48928to(InterfaceC1981h4 interfaceC1981h4, int i) {
        int iM48922k4 = m48922k4();
        for (int i2 = 1; i2 <= m48922k4(); i2++) {
            if (m48925k4(i2).f40754h4) {
                iM48922k4--;
            }
        }
        if (iM48922k4 <= 1) {
            return;
        }
        int iM48922k42 = m48922k4();
        for (int i3 = 1; i3 <= iM48922k42; i3++) {
            C12239wl c12239wlM48925k4 = m48925k4(i3);
            C4292ss c4292ss = (C4292ss) C7019kk.m27452k4((Object) c12239wlM48925k4.m57159ts(), C4292ss.class);
            if (c4292ss != null) {
                int iOooO00o = OooO00o.OooO00o(c4292ss.m17269yj() / 100.0d, i, 14);
                C1375h4 c1375h4M57148bz = c12239wlM48925k4.m57148bz();
                if (c1375h4M57148bz != null && c1375h4M57148bz.m8155k4() > iOooO00o) {
                    iOooO00o = c1375h4M57148bz.m8163x1();
                }
                c12239wlM48925k4.m57153k4(C4261ar.m17118k4(iOooO00o));
            }
        }
    }

    public String toString() {
        return this.f35872kk.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private void m48918x1() {
        List<C12239wl> listM57089g8 = this.f35871k4.m57089g8();
        if (listM57089g8 != null) {
            C1869to c1869to = new C1869to(listM57089g8);
            while (c1869to.mo9764x1()) {
                C12239wl c12239wl = (C12239wl) c1869to.mo9760kk();
                if (c12239wl != null) {
                    int iM57156qm = c12239wl.m57156qm();
                    for (int i = 0; i < c12239wl.m57150g8(); i++) {
                        while (iM57156qm > this.f35872kk.size()) {
                            this.f35872kk.addItem(null);
                        }
                        this.f35872kk.set_Item(iM57156qm - 1, c12239wl);
                        iM57156qm++;
                    }
                }
            }
            C1869to c1869to2 = new C1869to(this.f35872kk);
            while (c1869to2.mo9764x1()) {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final float m48921k4(InterfaceC1981h4 interfaceC1981h4, int i) {
        double dM9876c5;
        List.Enumerator<InterfaceC1984kk> it = this.f35873to.iterator();
        int iMo9886x1 = 0;
        float f = 0.0f;
        while (it.hasNext()) {
            try {
                InterfaceC1984kk next = it.next();
                if (next != null) {
                    iMo9886x1 += next.mo9886x1(interfaceC1981h4);
                    if (C7019kk.m27469x1(next, C1918lr.class)) {
                        dM9876c5 = ((C1918lr) next).m9876c5();
                    } else if (C7019kk.m27469x1(next, C4289qw.class)) {
                        dM9876c5 = ((C4289qw) next).m17259yj();
                    }
                    f += (float) dM9876c5;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (f <= 0.0f || iMo9886x1 >= i) {
            return 0.0f;
        }
        return (i - iMo9886x1) / f;
    }

    /* JADX INFO: renamed from: kk */
    public final int m48927kk(InterfaceC1981h4 interfaceC1981h4, int i) {
        int iM48922k4 = m48922k4();
        float f = 0.0f;
        for (int i2 = 1; i2 <= iM48922k4; i2++) {
            C12239wl c12239wlM48925k4 = m48925k4(i2);
            C4292ss c4292ss = (C4292ss) C7019kk.m27452k4((Object) c12239wlM48925k4.m57159ts(), C4292ss.class);
            if (c4292ss != null) {
                float fM17269yj = (float) ((c4292ss.m17269yj() / 100.0d) * ((double) i));
                C1375h4 c1375h4M57148bz = c12239wlM48925k4.m57148bz();
                if (c1375h4M57148bz != null && c1375h4M57148bz.m8155k4() > fM17269yj) {
                    fM17269yj = c1375h4M57148bz.m8163x1();
                }
                f += fM17269yj;
            }
        }
        return C7019kk.m27462to(Float.valueOf(f), 13);
    }

    /* JADX INFO: renamed from: kk */
    private void m48916kk() {
        int size = this.f35872kk.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f35873to.insertItem(0, null);
                return;
            } else if (this.f35872kk.get_Item(size) != null) {
                this.f35873to.insertItem(0, this.f35872kk.get_Item(size).m57159ts());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48922k4() {
        return this.f35870du > this.f35872kk.size() ? this.f35870du : this.f35872kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48930x1(InterfaceC1981h4 interfaceC1981h4) {
        int iM48922k4 = m48922k4();
        for (int i = 1; i <= iM48922k4; i++) {
            C12239wl c12239wlM48925k4 = m48925k4(i);
            if (c12239wlM48925k4.m57159ts().mo9883kk()) {
                int iMo9886x1 = c12239wlM48925k4.m57159ts().mo9886x1(interfaceC1981h4);
                C1375h4 c1375h4M57148bz = c12239wlM48925k4.m57148bz();
                if (c1375h4M57148bz != null && c1375h4M57148bz.m8155k4() > iMo9886x1) {
                    c12239wlM48925k4.m57153k4(C4261ar.m17118k4(c1375h4M57148bz.m8155k4()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48923k4(int i, InterfaceC1981h4 interfaceC1981h4) {
        return m48917x1(i, interfaceC1981h4);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48931x1(InterfaceC1981h4 interfaceC1981h4, int i) {
        int iM48922k4 = m48922k4();
        int iM48926kk = m48926kk(interfaceC1981h4);
        for (int i2 = 1; i2 <= iM48922k4; i2++) {
            C12239wl c12239wlM48925k4 = m48925k4(i2);
            int iMo9886x1 = c12239wlM48925k4.m57159ts().mo9886x1(interfaceC1981h4);
            int iOooO00o = OooO00o.OooO00o(iMo9886x1, ((double) i) / ((double) iM48926kk), 14);
            if (iOooO00o > c12239wlM48925k4.m57148bz().m8155k4()) {
                iM48926kk -= iMo9886x1;
                i -= iOooO00o;
                c12239wlM48925k4.m57153k4(C4261ar.m17119k4(iOooO00o, "mpt"));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48924k4(InterfaceC1981h4 interfaceC1981h4) {
        int iM48922k4 = m48922k4();
        int iMo9886x1 = 0;
        int i = 1;
        while (i <= iM48922k4) {
            int size = i >= this.f35873to.size() ? this.f35873to.size() - 1 : i;
            if (this.f35873to.get_Item(size) != null) {
                iMo9886x1 = this.f35873to.get_Item(size).mo9886x1(interfaceC1981h4) + iMo9886x1;
            }
            i++;
        }
        return iMo9886x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m48929to(InterfaceC1981h4 interfaceC1981h4) {
        int iM48922k4 = m48922k4();
        for (int i = 1; i <= iM48922k4; i++) {
            C12239wl c12239wlM48925k4 = m48925k4(i);
            if (!c12239wlM48925k4.m57159ts().mo9883kk() || c12239wlM48925k4.m57159ts().mo9886x1(interfaceC1981h4) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12239wl m48925k4(int i) {
        C12239wl c12239wl;
        int size = this.f35872kk.size();
        if (i > size) {
            if (i > this.f35870du) {
                this.f35870du = i;
                C12239wl c12239wlM48925k4 = m48925k4(1);
                if (size != 1 || !c12239wlM48925k4.m57160wp()) {
                    this.f35871k4.m57094qm();
                }
            }
            c12239wl = this.f35872kk.get_Item(size - 1);
        } else {
            c12239wl = this.f35872kk.get_Item(i - 1);
        }
        return c12239wl;
    }
}
