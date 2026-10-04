package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.f4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7635f4 extends AbstractC8986uz implements InterfaceC7649f9, InterfaceC7973j2, InterfaceC8745s7, InterfaceC8800ss, InterfaceC9128wp {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f22653ck = new C7017h4("barDir", "grouping", "varyColors", "ser", "dLbls", "gapWidth", "gapDepth", "shape", "axId", "extLst");

    /* JADX INFO: renamed from: c5 */
    private List<C8827t0> f22654c5;

    /* JADX INFO: renamed from: du */
    private C9115wi f22655du;

    /* JADX INFO: renamed from: dy */
    private C8066ka f22656dy;

    /* JADX INFO: renamed from: h4 */
    private C8274mm f22657h4;

    /* JADX INFO: renamed from: jd */
    private C7683fo f22658jd;

    /* JADX INFO: renamed from: k4 */
    private C8170lc f22659k4;

    /* JADX INFO: renamed from: kk */
    private C8828t1 f22660kk;

    /* JADX INFO: renamed from: m9 */
    private C8274mm f22661m9;

    /* JADX INFO: renamed from: to */
    private List<C9398zs> f22662to;

    /* JADX INFO: renamed from: x1 */
    private C7716g0 f22663x1;

    public C7635f4() {
        m31602wp();
        this.f22659k4 = new C8170lc();
    }

    /* JADX INFO: renamed from: wp */
    private void m31602wp() {
        this.f22662to = new List<>();
        this.f22654c5 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8827t0[] aE_() {
        return this.f22654c5.toArray(new C8827t0[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8170lc aw_() {
        return this.f22659k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f22655du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c6 */
    public C8066ka mo31605c6() {
        return this.f22656dy;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9128wp
    /* JADX INFO: renamed from: du */
    public final C8827t0 mo31606du() {
        C8827t0 c8827t0 = new C8827t0();
        this.f22654c5.addItem(c8827t0);
        return c8827t0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f22658jd;
    }

    /* JADX INFO: renamed from: g8 */
    public final C7716g0 m31607g8() {
        return this.f22663x1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8745s7
    /* JADX INFO: renamed from: jd */
    public final C8274mm mo31608jd() {
        if (this.f22661m9 != null) {
            throw new Exception("Only one <gapDepth> element can be added.");
        }
        C8274mm c8274mm = new C8274mm();
        this.f22661m9 = c8274mm;
        return c8274mm;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C9398zs c9398zs = new C9398zs();
        this.f22662to.addItem(c9398zs);
        return c9398zs;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ks */
    public C8274mm mo28514ks() {
        return this.f22657h4;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f22660kk != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f22660kk = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7649f9
    /* JADX INFO: renamed from: m9 */
    public final C8274mm mo28516m9() {
        if (this.f22657h4 != null) {
            throw new Exception("Only one <gapWidth> element can be added.");
        }
        C8274mm c8274mm = new C8274mm();
        this.f22657h4 = c8274mm;
        return c8274mm;
    }

    /* JADX INFO: renamed from: qm */
    public final C7716g0 m31609qm() {
        if (this.f22663x1 != null) {
            throw new Exception("Only one <grouping> element can be added.");
        }
        C7716g0 c7716g0 = new C7716g0();
        this.f22663x1 = c7716g0;
        return c7716g0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ts */
    public C8066ka mo31610ts() {
        if (this.f22656dy != null) {
            throw new Exception("Only one <shape> element can be added.");
        }
        C8066ka c8066ka = new C8066ka();
        this.f22656dy = c8066ka;
        return c8066ka;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f22660kk;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f22655du != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f22655du = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: yj */
    public C8274mm mo31611yj() {
        return this.f22661m9;
    }

    public C7635f4(final AbstractC13912i5 abstractC13912i5) {
        m31602wp();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c9398zs;
                List list;
                switch (C7635f4.f22653ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7635f4.this.f22659k4 = new C8170lc(abstractC13912i5);
                        return true;
                    case 1:
                        C7635f4.this.f22663x1 = new C7716g0(abstractC13912i5);
                        return true;
                    case 2:
                        C7635f4.this.f22660kk = new C8828t1(abstractC13912i5);
                        return true;
                    case 3:
                        c9398zs = new C9398zs(abstractC13912i5);
                        list = C7635f4.this.f22662to;
                        break;
                    case 4:
                        C7635f4.this.f22655du = new C9115wi(abstractC13912i5);
                        return true;
                    case 5:
                        C7635f4.this.f22657h4 = new C8274mm(abstractC13912i5);
                        return true;
                    case 6:
                        C7635f4.this.f22661m9 = new C8274mm(abstractC13912i5);
                        return true;
                    case 7:
                        C7635f4.this.f22656dy = new C8066ka(abstractC13912i5);
                        return true;
                    case 8:
                        c9398zs = new C8827t0(abstractC13912i5);
                        list = C7635f4.this.f22654c5;
                        break;
                    case 9:
                        C7635f4.this.f22658jd = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c9398zs);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f22662to.toArray(new C9398zs[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f22658jd = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f22659k4.mo6846k4("c", c3059ii, "barDir");
        C7716g0 c7716g0 = this.f22663x1;
        if (c7716g0 != null) {
            c7716g0.mo6846k4("c", c3059ii, "grouping");
        }
        C8828t1 c8828t1 = this.f22660kk;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C8827t0> it = this.f22662to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C9115wi c9115wi = this.f22655du;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C8274mm c8274mm = this.f22657h4;
        if (c8274mm != null) {
            c8274mm.mo6846k4("c", c3059ii, "gapWidth");
        }
        C8274mm c8274mm2 = this.f22661m9;
        if (c8274mm2 != null) {
            c8274mm2.mo6846k4("c", c3059ii, "gapDepth");
        }
        C8066ka c8066ka = this.f22656dy;
        if (c8066ka != null) {
            c8066ka.mo6846k4("c", c3059ii, "shape");
        }
        it = this.f22654c5.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "axId");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7683fo c7683fo = this.f22658jd;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
