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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rn */
/* JADX INFO: loaded from: classes4.dex */
public class C8689rn extends AbstractC8986uz implements InterfaceC7764gi, InterfaceC7973j2, InterfaceC8800ss {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29374m9 = new C7017h4("varyColors", "ser", "dLbls", "firstSliceAng", "holeSize", "extLst");

    /* JADX INFO: renamed from: du */
    private C8049k0 f29375du;

    /* JADX INFO: renamed from: h4 */
    private C7683fo f29376h4;

    /* JADX INFO: renamed from: k4 */
    private C8828t1 f29377k4;

    /* JADX INFO: renamed from: kk */
    private C9115wi f29378kk;

    /* JADX INFO: renamed from: to */
    private C9204xj f29379to;

    /* JADX INFO: renamed from: x1 */
    private List<C8178lf> f29380x1;

    public C8689rn() {
        m40083sv();
    }

    /* JADX INFO: renamed from: sv */
    private void m40083sv() {
        this.f29380x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f29378kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f29376h4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ix */
    public C9204xj mo31200ix() {
        return this.f29379to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C8178lf c8178lf = new C8178lf();
        this.f29380x1.addItem(c8178lf);
        return c8178lf;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f29377k4 != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f29377k4 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: qm */
    public final C8049k0 m40084qm() {
        if (this.f29375du != null) {
            throw new Exception("Only one <holeSize> element can be added.");
        }
        C8049k0 c8049k0 = new C8049k0();
        this.f29375du = c8049k0;
        return c8049k0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: u4 */
    public C8049k0 mo40085u4() {
        return this.f29375du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f29377k4;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f29378kk != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f29378kk = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f29380x1.toArray(new C8178lf[0]);
    }

    public C8689rn(final AbstractC13912i5 abstractC13912i5) {
        m40083sv();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8689rn.f29374m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8689rn.this.f29377k4 = new C8828t1(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8689rn.this.f29380x1.addItem(new C8178lf(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    C8689rn.this.f29378kk = new C9115wi(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C8689rn.this.f29379to = new C9204xj(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C8689rn.this.f29375du = new C8049k0(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C8689rn.this.f29376h4 = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7764gi
    /* JADX INFO: renamed from: k4 */
    public final C9204xj mo31201k4() {
        if (this.f29379to != null) {
            throw new Exception("Only one <firstSliceAng> element can be added.");
        }
        C9204xj c9204xj = new C9204xj();
        this.f29379to = c9204xj;
        return c9204xj;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f29376h4 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8828t1 c8828t1 = this.f29377k4;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C8178lf> it = this.f29380x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f29378kk;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C9204xj c9204xj = this.f29379to;
        if (c9204xj != null) {
            c9204xj.mo6846k4("c", c3059ii, "firstSliceAng");
        }
        C8049k0 c8049k0 = this.f29375du;
        if (c8049k0 != null) {
            c8049k0.mo6846k4("c", c3059ii, "holeSize");
        }
        C7683fo c7683fo = this.f29376h4;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
