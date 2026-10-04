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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.eq */
/* JADX INFO: loaded from: classes4.dex */
public class C7591eq extends AbstractC8986uz implements InterfaceC7764gi, InterfaceC7973j2, InterfaceC8800ss {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f22330h4 = new C7017h4("varyColors", "ser", "dLbls", "firstSliceAng", "extLst");

    /* JADX INFO: renamed from: du */
    private C7683fo f22331du;

    /* JADX INFO: renamed from: k4 */
    private C8828t1 f22332k4;

    /* JADX INFO: renamed from: kk */
    private C9115wi f22333kk;

    /* JADX INFO: renamed from: to */
    private C9204xj f22334to;

    /* JADX INFO: renamed from: x1 */
    private List<C8178lf> f22335x1;

    public C7591eq() {
        m31193g8();
    }

    /* JADX INFO: renamed from: g8 */
    private void m31193g8() {
        this.f22335x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f22333kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f22331du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ix */
    public C9204xj mo31200ix() {
        return this.f22334to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C8178lf c8178lf = new C8178lf();
        this.f22335x1.addItem(c8178lf);
        return c8178lf;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f22332k4 != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f22332k4 = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f22332k4;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f22333kk != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f22333kk = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f22335x1.toArray(new C8178lf[0]);
    }

    public C7591eq(final AbstractC13912i5 abstractC13912i5) {
        m31193g8();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7591eq.f22330h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7591eq.this.f22332k4 = new C8828t1(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7591eq.this.f22335x1.addItem(new C8178lf(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    C7591eq.this.f22333kk = new C9115wi(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7591eq.this.f22334to = new C9204xj(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C7591eq.this.f22331du = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7764gi
    /* JADX INFO: renamed from: k4 */
    public final C9204xj mo31201k4() {
        if (this.f22334to != null) {
            throw new Exception("Only one <firstSliceAng> element can be added.");
        }
        C9204xj c9204xj = new C9204xj();
        this.f22334to = c9204xj;
        return c9204xj;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f22331du = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8828t1 c8828t1 = this.f22332k4;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C8178lf> it = this.f22335x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f22333kk;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C9204xj c9204xj = this.f22334to;
        if (c9204xj != null) {
            c9204xj.mo6846k4("c", c3059ii, "firstSliceAng");
        }
        C7683fo c7683fo = this.f22331du;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
