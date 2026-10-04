package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.oo */
/* JADX INFO: loaded from: classes4.dex */
public class C8459oo extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28046to = new C7017h4(C18773h.f57233c, "tc", "extLst");

    /* JADX INFO: renamed from: k4 */
    private double f28047k4;

    /* JADX INFO: renamed from: kk */
    private C8397nz f28048kk;

    /* JADX INFO: renamed from: x1 */
    private List<C9087w5> f28049x1;

    public C8459oo() {
        m38383h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m38383h4() {
        this.f28047k4 = Double.NaN;
        this.f28049x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C9087w5[] m38390kk() {
        return this.f28049x1.toArray(new C9087w5[0]);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m38391to() {
        return this.f28048kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m38392x1() {
        return this.f28047k4;
    }

    public C8459oo(final AbstractC13912i5 abstractC13912i5) {
        m38383h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8459oo.f28046to.m27428k4(str) != 0) {
                    return false;
                }
                C8459oo.this.f28047k4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8459oo.f28046to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C8459oo.this.f28049x1.addItem(new C9087w5(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8459oo.this.f28048kk = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9087w5 m38387k4() {
        C9087w5 c9087w5 = new C9087w5();
        this.f28049x1.addItem(c9087w5);
        return c9087w5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38388k4(double d) {
        this.f28047k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38389k4(AbstractC7414ck abstractC7414ck) {
        this.f28048kk = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18773h.f57233c, C22238OooO0oO.OooO00o(this.f28047k4, 12700.0d, 14));
        List.Enumerator<C9087w5> it = this.f28049x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "tc");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8397nz c8397nz = this.f28048kk;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
