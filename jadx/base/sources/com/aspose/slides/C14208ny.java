package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ny */
/* JADX INFO: loaded from: classes3.dex */
class C14208ny extends AbstractC7020m9<C14208ny> implements Comparable<C14208ny> {

    /* JADX INFO: renamed from: du */
    private List<fg1> f47647du;

    /* JADX INFO: renamed from: k4 */
    public nrw f47648k4;

    /* JADX INFO: renamed from: kk */
    private int f47649kk;

    /* JADX INFO: renamed from: to */
    private TextFrame f47650to;

    /* JADX INFO: renamed from: x1 */
    private int f47651x1;

    public C14208ny() {
        this.f47650to = null;
        this.f47648k4 = null;
    }

    /* JADX INFO: renamed from: ks */
    private void m68265ks() {
        List<r7c> listM68194to = this.f47648k4.m68194to();
        while (true) {
            int i = this.f47649kk;
            if (i < 0) {
                int i2 = this.f47651x1;
                if (i2 <= 0) {
                    this.f47649kk = -1;
                    break;
                } else {
                    int i3 = i2 - 1;
                    this.f47651x1 = i3;
                    this.f47649kk = i + this.f47647du.get_Item(i3).m6181kk();
                }
            } else {
                break;
            }
        }
        while (this.f47651x1 + 1 < this.f47647du.size() && this.f47649kk >= this.f47647du.get_Item(this.f47651x1).m6181kk()) {
            this.f47649kk -= this.f47647du.get_Item(this.f47651x1).m6181kk();
            this.f47651x1++;
        }
        if (this.f47651x1 < this.f47647du.size() - 1 || this.f47649kk < this.f47647du.get_Item(this.f47651x1).m6181kk()) {
            return;
        }
        int size = listM68194to.size() - 1;
        this.f47651x1 = size;
        this.f47649kk = this.f47647du.get_Item(size).m6181kk();
    }

    /* JADX INFO: renamed from: c5 */
    public final C14208ny m68268c5() {
        C14208ny c14208nyClone = Clone();
        c14208nyClone.m68280m9();
        return c14208nyClone;
    }

    /* JADX INFO: renamed from: ck */
    public final C14208ny m68269ck() {
        C14208ny c14208nyClone = Clone();
        c14208nyClone.m68277k4(this.f47647du.size() - 1, ((fg1) OooO0O0.OooO00o(this.f47647du, 1)).m6181kk());
        return c14208nyClone;
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final int m68270du() {
        return C3047dy.m12855ix(m68283x1()) ? C3047dy.m12858k4(m68276k4().f48544x1, this.f47649kk) : m68283x1();
    }

    /* JADX INFO: renamed from: dy */
    public final void m68271dy() {
        this.f47649kk--;
        m68265ks();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C14208ny) {
            return m68266to((C14208ny) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public final C14208ny m68272fa() {
        C14208ny c14208nyClone = Clone();
        c14208nyClone.m68277k4(this.f47651x1, ((fg1) OooO0O0.OooO00o(this.f47647du, 1)).m6181kk());
        return c14208nyClone;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m68273h4() {
        return C3047dy.m12850du(m68270du());
    }

    public int hashCode() {
        return C12569rv.m58664k4(Integer.valueOf(this.f47651x1), Integer.valueOf(this.f47649kk), this.f47648k4);
    }

    /* JADX INFO: renamed from: jd */
    public final C14208ny m68274jd() {
        C14208ny c14208nyClone = Clone();
        c14208nyClone.m68271dy();
        return c14208nyClone;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C14208ny c14208ny) {
        if (this.f47648k4 != c14208ny.f47648k4) {
            throw new Exception("iterators mismatch");
        }
        int i = this.f47651x1;
        int i2 = c14208ny.f47651x1;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        int i3 = this.f47649kk;
        int i4 = c14208ny.f47649kk;
        if (i3 == i4) {
            return 0;
        }
        return i3 < i4 ? -1 : 1;
    }

    /* JADX INFO: renamed from: kk */
    public final kjz m68278kk() {
        if (this.f47649kk < 0 || m68276k4() == null || !C7019kk.m27469x1(m68276k4().f48542kk, MathPortion.class) || this.f47649kk >= this.f47647du.get_Item(this.f47651x1).m6181kk()) {
            return null;
        }
        return this.f47647du.get_Item(this.f47651x1).m6182x1().get_Item(m68281to());
    }

    /* JADX INFO: renamed from: m9 */
    public final void m68280m9() {
        this.f47649kk++;
        m68265ks();
    }

    /* JADX INFO: renamed from: to */
    public final int m68281to() {
        return this.f47649kk;
    }

    /* JADX INFO: renamed from: up */
    public final int m68282up() {
        return this.f47651x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final char m68283x1() {
        return (this.f47649kk < 0 || m68276k4() == null || !C7019kk.m27469x1(m68276k4().f48542kk, Portion.class) || this.f47649kk >= m68276k4().f48544x1.length()) ? C7019kk.m27469x1(m68276k4().f48542kk, MathPortion.class) ? (char) 57346 : (char) 0 : m68276k4().f48544x1.charAt(this.f47649kk);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: yj, reason: merged with bridge method [inline-methods] */
    public C14208ny Clone() {
        C14208ny c14208ny = new C14208ny();
        CloneTo(c14208ny);
        return c14208ny;
    }

    public C14208ny(nrw nrwVar, int i, int i2) {
        this.f47648k4 = nrwVar;
        this.f47651x1 = i;
        this.f47649kk = i2;
        this.f47650to = nrwVar.f47606x1.m2154ck().m2179kk();
        this.f47647du = new List<>();
        List.Enumerator<r7c> it = nrwVar.m68194to().iterator();
        while (it.hasNext()) {
            try {
                this.f47647du.addItem(new fg1(this.f47650to, nrwVar, it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        while (this.f47651x1 < this.f47647du.size() - 1 && this.f47647du.get_Item(this.f47651x1).m6181kk() == 0) {
            this.f47651x1++;
        }
        m68265ks();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14208ny m68263k4(nrw nrwVar) {
        return new C14208ny(nrwVar, 0, 0);
    }

    /* JADX INFO: renamed from: to */
    private boolean m68266to(C14208ny c14208ny) {
        return c14208ny.f47651x1 == this.f47651x1 && c14208ny.f47649kk == this.f47649kk && C14067j2.m66728k4(c14208ny.f47650to, this.f47650to) && C14067j2.m66728k4(c14208ny.f47647du, this.f47647du) && C14067j2.m66728k4(c14208ny.f47648k4, this.f47648k4);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14208ny c14208ny) {
        c14208ny.f47651x1 = this.f47651x1;
        c14208ny.f47649kk = this.f47649kk;
        c14208ny.f47650to = this.f47650to;
        c14208ny.f47647du = this.f47647du;
        c14208ny.f47648k4 = this.f47648k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m68284x1(C14208ny c14208ny) {
        if (this.f47648k4 == c14208ny.f47648k4) {
            return this.f47651x1 == c14208ny.f47651x1 && this.f47649kk == c14208ny.f47649kk;
        }
        throw new Exception("iterators mismatch");
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m68267x1(C14208ny c14208ny, C14208ny c14208ny2) {
        return c14208ny.compareTo(c14208ny2.Clone()) < 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final r7c m68276k4() {
        return this.f47647du.get_Item(this.f47651x1).m6177k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68277k4(int i, int i2) {
        this.f47651x1 = i;
        this.f47649kk = this.f47647du.get_Item(i).m6181kk();
        m68265ks();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m68264k4(C14208ny c14208ny, C14208ny c14208ny2) {
        return c14208ny.m68284x1(c14208ny2.Clone());
    }
}
